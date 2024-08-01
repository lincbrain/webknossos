package com.scalableminds.webknossos.datastore.datavault

import com.scalableminds.util.tools.Fox
import com.scalableminds.webknossos.datastore.storage.{
  LegacyDataVaultCredential,
  RemoteSourceDescriptor,
  S3AccessKeyCredential
}
import net.liftweb.common.{Box, Failure, Full, Empty}
import org.apache.commons.lang3.builder.HashCodeBuilder
import software.amazon.awssdk.auth.credentials.{
  AwsBasicCredentials,
  AwsCredentialsProvider,
  DefaultCredentialsProvider,
  StaticCredentialsProvider
}
import software.amazon.awssdk.core.async.AsyncResponseTransformer
import software.amazon.awssdk.core.ResponseBytes
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.s3.S3AsyncClient
import software.amazon.awssdk.services.s3.model._

import java.net.URI
import java.util.concurrent.CompletableFuture
import scala.collection.immutable.NumericRange
import scala.concurrent.{ExecutionContext, Future}
import scala.jdk.FutureConverters._
//import scala.util.{Failure => ScalaFailure, Success}

class S3DataVault(s3AccessKeyCredential: Option[S3AccessKeyCredential], uri: URI) extends DataVault {
  private lazy val bucketName = S3DataVault.hostBucketFromUri(uri) match {
    case Some(value) => value
    case None        => throw new Exception(s"Could not parse S3 bucket for ${uri.toString}")
  }

  private lazy val client: S3AsyncClient = S3DataVault.getAmazonS3Client(s3AccessKeyCredential, uri)

  private def getRangeRequest(bucketName: String, key: String, range: NumericRange[Long]): GetObjectRequest =
    GetObjectRequest.builder().bucket(bucketName).key(key).range(s"bytes=${range.start}-${range.end}").build()

  private def getSuffixRangeRequest(bucketName: String, key: String, length: Long): GetObjectRequest = {
    GetObjectRequest.builder().bucket(bucketName).key(key).range(s"bytes=-$length").build()
  }

  private def getRequest(bucketName: String, key: String): GetObjectRequest =
    GetObjectRequest.builder().bucket(bucketName).key(key).build()

  private def performRequest(request: GetObjectRequest)(implicit ec: ExecutionContext): Fox[(Array[Byte], String)] = {
    val responseFuture: CompletableFuture[ResponseBytes[GetObjectResponse]] = client.getObject(request, AsyncResponseTransformer.toBytes())
    val scalaFuture: Future[ResponseBytes[GetObjectResponse]] = responseFuture.asScala

    val resultFuture = scalaFuture.map { response =>
      val bytes = response.asByteArray()
      val encodingStr = Option(response.response().contentEncoding()).getOrElse("")
      (bytes, encodingStr)
    }.recover {
      case e: S3Exception if e.statusCode() == 404 => (Array.emptyByteArray, "")
      case e: Exception => throw e
    }

    futureToFox(resultFuture)
  }

  private def futureToFox[T](future: Future[T])(implicit ec: ExecutionContext): Fox[T] = {
    val boxFuture: Future[Box[T]] = future.map(Full(_)).recover { case e => Failure(e.getMessage, Full(e), Empty) }
    new Fox(boxFuture)
  }

  override def readBytesAndEncoding(path: VaultPath, range: RangeSpecifier)(
    implicit ec: ExecutionContext): Fox[(Array[Byte], Encoding.Value)] =
    for {
      objectKey <- Fox.box2Fox(S3DataVault.objectKeyFromUri(path.toUri))
      request = range match {
        case StartEnd(r)     => getRangeRequest(bucketName, objectKey, r)
        case SuffixLength(l) => getSuffixRangeRequest(bucketName, objectKey, l)
        case Complete()      => getRequest(bucketName, objectKey)
      }
      (bytes, encodingString) <- performRequest(request)
      encoding <- Encoding.fromRfc7231String(encodingString)
    } yield (bytes, encoding)

  private def getUri = uri
  private def getCredential = s3AccessKeyCredential

  override def equals(obj: Any): Boolean = obj match {
    case other: S3DataVault => other.getUri == uri && other.getCredential == s3AccessKeyCredential
    case _                  => false
  }

  override def hashCode(): Int =
    new HashCodeBuilder(17, 31).append(uri.toString).append(s3AccessKeyCredential).toHashCode
}

object S3DataVault {
  def create(remoteSourceDescriptor: RemoteSourceDescriptor): S3DataVault = {
    val credential = remoteSourceDescriptor.credential.flatMap {
      case f: S3AccessKeyCredential     => Some(f)
      case f: LegacyDataVaultCredential => Some(f.toS3AccessKey)
      case _                            => None
    }
    new S3DataVault(credential, remoteSourceDescriptor.uri)
  }

  private def hostBucketFromUri(uri: URI): Option[String] = {
    val host = uri.getHost
    if (isShortStyle(uri)) { // assume host is omitted from uri, shortcut form s3://bucket/key
      Some(host)
    } else if (isVirtualHostedStyle(uri)) {
      Some(host.substring(0, host.length - ".s3.amazonaws.com".length))
    } else if (isPathStyle(uri)) {
      Some(uri.getPath.substring(1).split("/")(0))
    } else {
      None
    }
  }

  // https://bucket-name.s3.region-code.amazonaws.com/key-name
  private def isVirtualHostedStyle(uri: URI): Boolean =
    uri.getHost.endsWith(".s3.amazonaws.com")

  // https://s3.region-code.amazonaws.com/bucket-name/key-name
  private def isPathStyle(uri: URI): Boolean =
    uri.getHost.matches("s3(.[\\w\\-_]+)?.amazonaws.com") ||
      (!uri.getHost.contains("amazonaws.com") && uri.getHost.contains("."))

  // S3://bucket-name/key-name
  private def isShortStyle(uri: URI): Boolean =
    !uri.getHost.contains(".")

  private def objectKeyFromUri(uri: URI): Box[String] =
    if (isVirtualHostedStyle(uri)) {
      Full(uri.getPath)
    } else if (isPathStyle(uri)) {
      Full(uri.getPath.substring(1).split("/").tail.mkString("/"))
    } else if (isShortStyle(uri)) {
      Full(uri.getPath.tail)
    } else Failure(s"Not a valid s3 uri: $uri")

  private def getCredentialsProvider(credentialOpt: Option[S3AccessKeyCredential]): AwsCredentialsProvider =
    credentialOpt match {
      case Some(s3AccessKeyCredential: S3AccessKeyCredential) =>
        StaticCredentialsProvider.create(
          AwsBasicCredentials.create(s3AccessKeyCredential.accessKeyId, s3AccessKeyCredential.secretAccessKey))
      case None =>
        DefaultCredentialsProvider.create()
    }

  private def getAmazonS3Client(credentialOpt: Option[S3AccessKeyCredential], uri: URI): S3AsyncClient = {
    val builder = S3AsyncClient.builder()
      .credentialsProvider(getCredentialsProvider(credentialOpt))

    if (isNonAmazonHost(uri)) {
      builder.endpointOverride(uri)
      builder.region(Region.US_EAST_2)  // Default region for non-Amazon hosts, change if necessary
    } else {
      builder.region(Region.US_EAST_2)
    }

    builder.build()
  }

  private def isNonAmazonHost(uri: URI): Boolean =
    isPathStyle(uri) && !uri.getHost.endsWith(".amazonaws.com")
}
