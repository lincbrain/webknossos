// @GENERATOR:play-routes-compiler
// @SOURCE:conf/webknossos.versioned.routes

package webknossos.versioned

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:13
  webknossos_latest_Routes_0: webknossos.latest.Routes,
  // @LINE:16
  LegacyApiController_0: controllers.LegacyApiController,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:13
    webknossos_latest_Routes_0: webknossos.latest.Routes,
    // @LINE:16
    LegacyApiController_0: controllers.LegacyApiController
  ) = this(errorHandler, webknossos_latest_Routes_0, LegacyApiController_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    webknossos.versioned.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, webknossos_latest_Routes_0, LegacyApiController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_webknossos_latest_Routes_0_0.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v5/datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/isValidNewName""", """controllers.LegacyApiController.assertValidNewNameV5(organizationName:String, datasetName:String)"""),
    prefixed_webknossos_latest_Routes_0_2.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/info""", """controllers.LegacyApiController.annotationInfoV4(typ:String, id:String, timestamp:Long)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/finish""", """controllers.LegacyApiController.annotationFinishV4(typ:String, id:String, timestamp:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""", """controllers.LegacyApiController.annotationMergeV4(typ:String, id:String, mergedTyp:String, mergedId:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/edit""", """controllers.LegacyApiController.annotationEditV4(typ:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/duplicate""", """controllers.LegacyApiController.annotationDuplicateV4(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reopen""", """controllers.LegacyApiController.annotationReopenV4(typ:String, id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reset""", """controllers.LegacyApiController.annotationResetV4(typ:String, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/user/annotations""", """controllers.LegacyApiController.annotationListForCurrentUserV4(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/user/tasks""", """controllers.LegacyApiController.annotationTasksV4(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/users/""" + "$" + """id<[^/]+>/annotations""", """controllers.LegacyApiController.annotationListByUserV4(id:String, isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/users/""" + "$" + """id<[^/]+>/tasks""", """controllers.LegacyApiController.annotationTasksByUserV4(id:String, isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/tasks/""" + "$" + """id<[^/]+>/annotations""", """controllers.LegacyApiController.annotationsForTaskV4(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v4/datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/createExplorational""", """controllers.LegacyApiController.annotationCreateExplorationalV4(organizationName:String, datasetName:String)"""),
    prefixed_webknossos_latest_Routes_0_16.router.documentation,
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/finish""", """controllers.LegacyApiController.annotationFinishV4(typ:String, id:String, timestamp:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/info""", """controllers.LegacyApiController.annotationInfoV4(typ:String, id:String, timestamp:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""", """controllers.LegacyApiController.annotationMergeV4(typ:String, id:String, mergedTyp:String, mergedId:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/edit""", """controllers.LegacyApiController.annotationEditV4(typ:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/duplicate""", """controllers.LegacyApiController.annotationDuplicateV4(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reopen""", """controllers.LegacyApiController.annotationReopenV4(typ:String, id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reset""", """controllers.LegacyApiController.annotationResetV4(typ:String, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/user/annotations""", """controllers.LegacyApiController.annotationListForCurrentUserV4(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/user/tasks""", """controllers.LegacyApiController.annotationTasksV4(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/users/""" + "$" + """id<[^/]+>/annotations""", """controllers.LegacyApiController.annotationListByUserV4(id:String, isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/users/""" + "$" + """id<[^/]+>/tasks""", """controllers.LegacyApiController.annotationTasksByUserV4(id:String, isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/tasks/""" + "$" + """id<[^/]+>/annotations""", """controllers.LegacyApiController.annotationsForTaskV4(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/createExplorational""", """controllers.LegacyApiController.annotationCreateExplorationalV4(organizationName:String, datasetName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/tasks/list""", """controllers.LegacyApiController.taskListTasks"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/projects/""" + "$" + """name<[^/]+>""", """controllers.LegacyApiController.projectRead(name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/projects/""" + "$" + """name<[^/]+>""", """controllers.LegacyApiController.projectDelete(name:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/projects/""" + "$" + """name<[^/]+>""", """controllers.LegacyApiController.projectUpdate(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/projects/""" + "$" + """name<[^/]+>/tasks""", """controllers.LegacyApiController.projectTasksForProject(name:String, limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/projects/""" + "$" + """name<[^/]+>/incrementEachTasksInstances""", """controllers.LegacyApiController.projectIncrementEachTasksInstances(name:String, delta:Option[Long])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/projects/""" + "$" + """name<[^/]+>/pause""", """controllers.LegacyApiController.projectPause(name:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v3/projects/""" + "$" + """name<[^/]+>/resume""", """controllers.LegacyApiController.projectResume(name:String)"""),
    prefixed_webknossos_latest_Routes_0_38.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/info""", """controllers.LegacyApiController.annotationInfoV2(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/finish""", """controllers.LegacyApiController.annotationFinishV2(typ:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""", """controllers.LegacyApiController.annotationMergeV4(typ:String, id:String, mergedTyp:String, mergedId:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/edit""", """controllers.LegacyApiController.annotationEditV4(typ:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/duplicate""", """controllers.LegacyApiController.annotationDuplicateV4(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reopen""", """controllers.LegacyApiController.annotationReopenV4(typ:String, id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reset""", """controllers.LegacyApiController.annotationResetV4(typ:String, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/user/annotations""", """controllers.LegacyApiController.annotationListForCurrentUserV4(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/user/tasks""", """controllers.LegacyApiController.annotationTasksV4(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/users/""" + "$" + """id<[^/]+>/annotations""", """controllers.LegacyApiController.annotationListByUserV4(id:String, isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/users/""" + "$" + """id<[^/]+>/tasks""", """controllers.LegacyApiController.annotationTasksByUserV4(id:String, isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/tasks/""" + "$" + """id<[^/]+>/annotations""", """controllers.LegacyApiController.annotationsForTaskV4(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/createExplorational""", """controllers.LegacyApiController.annotationCreateExplorationalV4(organizationName:String, datasetName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/tasks/list""", """controllers.LegacyApiController.taskListTasks"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/projects/""" + "$" + """name<[^/]+>""", """controllers.LegacyApiController.projectRead(name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/projects/""" + "$" + """name<[^/]+>""", """controllers.LegacyApiController.projectDelete(name:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/projects/""" + "$" + """name<[^/]+>""", """controllers.LegacyApiController.projectUpdate(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/projects/""" + "$" + """name<[^/]+>/tasks""", """controllers.LegacyApiController.projectTasksForProject(name:String, limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/projects/""" + "$" + """name<[^/]+>/incrementEachTasksInstances""", """controllers.LegacyApiController.projectIncrementEachTasksInstances(name:String, delta:Option[Long])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/projects/""" + "$" + """name<[^/]+>/pause""", """controllers.LegacyApiController.projectPause(name:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v2/projects/""" + "$" + """name<[^/]+>/resume""", """controllers.LegacyApiController.projectResume(name:String)"""),
    prefixed_webknossos_latest_Routes_0_60.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/info""", """controllers.LegacyApiController.annotationInfoV1(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/finish""", """controllers.LegacyApiController.annotationFinishV1(typ:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""", """controllers.LegacyApiController.annotationMergeV1(typ:String, id:String, mergedTyp:String, mergedId:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/edit""", """controllers.LegacyApiController.annotationEditV1(typ:String, id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/duplicate""", """controllers.LegacyApiController.annotationDuplicateV1(typ:String, id:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reopen""", """controllers.LegacyApiController.annotationReopenV1(typ:String, id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reset""", """controllers.LegacyApiController.annotationResetV1(typ:String, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/user/annotations""", """controllers.LegacyApiController.annotationListForCurrentUserV1(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/user/tasks""", """controllers.LegacyApiController.annotationTasksV1(isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/users/""" + "$" + """id<[^/]+>/annotations""", """controllers.LegacyApiController.annotationListByUserV1(id:String, isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/users/""" + "$" + """id<[^/]+>/tasks""", """controllers.LegacyApiController.annotationTasksByUserV1(id:String, isFinished:Option[Boolean], limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/tasks/""" + "$" + """id<[^/]+>/annotations""", """controllers.LegacyApiController.annotationsForTaskV1(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/createExplorational""", """controllers.LegacyApiController.annotationCreateExplorationalV1(organizationName:String, datasetName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/tasks/list""", """controllers.LegacyApiController.taskListTasks"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/projects/""" + "$" + """name<[^/]+>""", """controllers.LegacyApiController.projectRead(name:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/projects/""" + "$" + """name<[^/]+>""", """controllers.LegacyApiController.projectDelete(name:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/projects/""" + "$" + """name<[^/]+>""", """controllers.LegacyApiController.projectUpdate(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/projects/""" + "$" + """name<[^/]+>/tasks""", """controllers.LegacyApiController.projectTasksForProject(name:String, limit:Option[Int], pageNumber:Option[Int], includeTotalCount:Option[Boolean])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/projects/""" + "$" + """name<[^/]+>/incrementEachTasksInstances""", """controllers.LegacyApiController.projectIncrementEachTasksInstances(name:String, delta:Option[Long])"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/projects/""" + "$" + """name<[^/]+>/pause""", """controllers.LegacyApiController.projectPause(name:String)"""),
    ("""PATCH""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """v1/projects/""" + "$" + """name<[^/]+>/resume""", """controllers.LegacyApiController.projectResume(name:String)"""),
    prefixed_webknossos_latest_Routes_0_82.router.documentation,
    prefixed_webknossos_latest_Routes_0_83.router.documentation,
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:13
  private[this] val prefixed_webknossos_latest_Routes_0_0 = Include(webknossos_latest_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v6/"))

  // @LINE:16
  private[this] lazy val controllers_LegacyApiController_assertValidNewNameV51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v5/datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/isValidNewName")))
  )
  private[this] lazy val controllers_LegacyApiController_assertValidNewNameV51_invoker = createInvoker(
    LegacyApiController_0.assertValidNewNameV5(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "assertValidNewNameV5",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """v5/datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/isValidNewName""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] val prefixed_webknossos_latest_Routes_0_2 = Include(webknossos_latest_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v5/"))

  // @LINE:22
  private[this] lazy val controllers_LegacyApiController_annotationInfoV43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/info")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationInfoV43_invoker = createInvoker(
    LegacyApiController_0.annotationInfoV4(fakeValue[String], fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationInfoV4",
      Seq(classOf[String], classOf[String], classOf[Long]),
      "GET",
      this.prefix + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/info""",
      """ support changes to v5""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_LegacyApiController_annotationFinishV44_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/finish")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationFinishV44_invoker = createInvoker(
    LegacyApiController_0.annotationFinishV4(fakeValue[String], fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationFinishV4",
      Seq(classOf[String], classOf[String], classOf[Long]),
      "PATCH",
      this.prefix + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/finish""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_LegacyApiController_annotationMergeV45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/merge/"), DynamicPart("mergedTyp", """[^/]+""",true), StaticPart("/"), DynamicPart("mergedId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_annotationMergeV45_invoker = createInvoker(
    LegacyApiController_0.annotationMergeV4(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationMergeV4",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_LegacyApiController_annotationEditV46_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationEditV46_invoker = createInvoker(
    LegacyApiController_0.annotationEditV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationEditV4",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_LegacyApiController_annotationDuplicateV47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/duplicate")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationDuplicateV47_invoker = createInvoker(
    LegacyApiController_0.annotationDuplicateV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationDuplicateV4",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/duplicate""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_LegacyApiController_annotationReopenV48_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reopen")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationReopenV48_invoker = createInvoker(
    LegacyApiController_0.annotationReopenV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationReopenV4",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reopen""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_LegacyApiController_annotationResetV49_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reset")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationResetV49_invoker = createInvoker(
    LegacyApiController_0.annotationResetV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationResetV4",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """v4/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reset""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_LegacyApiController_annotationListForCurrentUserV410_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/user/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationListForCurrentUserV410_invoker = createInvoker(
    LegacyApiController_0.annotationListForCurrentUserV4(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationListForCurrentUserV4",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v4/user/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_LegacyApiController_annotationTasksV411_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/user/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationTasksV411_invoker = createInvoker(
    LegacyApiController_0.annotationTasksV4(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationTasksV4",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v4/user/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_LegacyApiController_annotationListByUserV412_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationListByUserV412_invoker = createInvoker(
    LegacyApiController_0.annotationListByUserV4(fakeValue[String], fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationListByUserV4",
      Seq(classOf[String], classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v4/users/""" + "$" + """id<[^/]+>/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_LegacyApiController_annotationTasksByUserV413_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationTasksByUserV413_invoker = createInvoker(
    LegacyApiController_0.annotationTasksByUserV4(fakeValue[String], fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationTasksByUserV4",
      Seq(classOf[String], classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v4/users/""" + "$" + """id<[^/]+>/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_LegacyApiController_annotationsForTaskV414_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/tasks/"), DynamicPart("id", """[^/]+""",true), StaticPart("/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationsForTaskV414_invoker = createInvoker(
    LegacyApiController_0.annotationsForTaskV4(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationsForTaskV4",
      Seq(classOf[String]),
      "GET",
      this.prefix + """v4/tasks/""" + "$" + """id<[^/]+>/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_LegacyApiController_annotationCreateExplorationalV415_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v4/datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/createExplorational")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationCreateExplorationalV415_invoker = createInvoker(
    LegacyApiController_0.annotationCreateExplorationalV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationCreateExplorationalV4",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """v4/datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/createExplorational""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] val prefixed_webknossos_latest_Routes_0_16 = Include(webknossos_latest_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v4/"))

  // @LINE:39
  private[this] lazy val controllers_LegacyApiController_annotationFinishV417_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/finish")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationFinishV417_invoker = createInvoker(
    LegacyApiController_0.annotationFinishV4(fakeValue[String], fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationFinishV4",
      Seq(classOf[String], classOf[String], classOf[Long]),
      "PATCH",
      this.prefix + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/finish""",
      """ support changes to v5""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_LegacyApiController_annotationInfoV418_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/info")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationInfoV418_invoker = createInvoker(
    LegacyApiController_0.annotationInfoV4(fakeValue[String], fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationInfoV4",
      Seq(classOf[String], classOf[String], classOf[Long]),
      "GET",
      this.prefix + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/info""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_LegacyApiController_annotationMergeV419_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/merge/"), DynamicPart("mergedTyp", """[^/]+""",true), StaticPart("/"), DynamicPart("mergedId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_annotationMergeV419_invoker = createInvoker(
    LegacyApiController_0.annotationMergeV4(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationMergeV4",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_LegacyApiController_annotationEditV420_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationEditV420_invoker = createInvoker(
    LegacyApiController_0.annotationEditV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationEditV4",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_LegacyApiController_annotationDuplicateV421_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/duplicate")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationDuplicateV421_invoker = createInvoker(
    LegacyApiController_0.annotationDuplicateV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationDuplicateV4",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/duplicate""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_LegacyApiController_annotationReopenV422_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reopen")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationReopenV422_invoker = createInvoker(
    LegacyApiController_0.annotationReopenV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationReopenV4",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reopen""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_LegacyApiController_annotationResetV423_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reset")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationResetV423_invoker = createInvoker(
    LegacyApiController_0.annotationResetV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationResetV4",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """v3/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reset""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_LegacyApiController_annotationListForCurrentUserV424_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/user/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationListForCurrentUserV424_invoker = createInvoker(
    LegacyApiController_0.annotationListForCurrentUserV4(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationListForCurrentUserV4",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v3/user/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_LegacyApiController_annotationTasksV425_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/user/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationTasksV425_invoker = createInvoker(
    LegacyApiController_0.annotationTasksV4(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationTasksV4",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v3/user/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_LegacyApiController_annotationListByUserV426_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationListByUserV426_invoker = createInvoker(
    LegacyApiController_0.annotationListByUserV4(fakeValue[String], fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationListByUserV4",
      Seq(classOf[String], classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v3/users/""" + "$" + """id<[^/]+>/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_LegacyApiController_annotationTasksByUserV427_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationTasksByUserV427_invoker = createInvoker(
    LegacyApiController_0.annotationTasksByUserV4(fakeValue[String], fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationTasksByUserV4",
      Seq(classOf[String], classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v3/users/""" + "$" + """id<[^/]+>/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_LegacyApiController_annotationsForTaskV428_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/tasks/"), DynamicPart("id", """[^/]+""",true), StaticPart("/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationsForTaskV428_invoker = createInvoker(
    LegacyApiController_0.annotationsForTaskV4(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationsForTaskV4",
      Seq(classOf[String]),
      "GET",
      this.prefix + """v3/tasks/""" + "$" + """id<[^/]+>/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_LegacyApiController_annotationCreateExplorationalV429_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/createExplorational")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationCreateExplorationalV429_invoker = createInvoker(
    LegacyApiController_0.annotationCreateExplorationalV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationCreateExplorationalV4",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """v3/datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/createExplorational""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_LegacyApiController_taskListTasks30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/tasks/list")))
  )
  private[this] lazy val controllers_LegacyApiController_taskListTasks30_invoker = createInvoker(
    LegacyApiController_0.taskListTasks,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "taskListTasks",
      Nil,
      "POST",
      this.prefix + """v3/tasks/list""",
      """ support changes to v4""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_LegacyApiController_projectRead31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_projectRead31_invoker = createInvoker(
    LegacyApiController_0.projectRead(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectRead",
      Seq(classOf[String]),
      "GET",
      this.prefix + """v3/projects/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_LegacyApiController_projectDelete32_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_projectDelete32_invoker = createInvoker(
    LegacyApiController_0.projectDelete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectDelete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """v3/projects/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_LegacyApiController_projectUpdate33_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_projectUpdate33_invoker = createInvoker(
    LegacyApiController_0.projectUpdate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectUpdate",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """v3/projects/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_LegacyApiController_projectTasksForProject34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_projectTasksForProject34_invoker = createInvoker(
    LegacyApiController_0.projectTasksForProject(fakeValue[String], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectTasksForProject",
      Seq(classOf[String], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v3/projects/""" + "$" + """name<[^/]+>/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_LegacyApiController_projectIncrementEachTasksInstances35_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/incrementEachTasksInstances")))
  )
  private[this] lazy val controllers_LegacyApiController_projectIncrementEachTasksInstances35_invoker = createInvoker(
    LegacyApiController_0.projectIncrementEachTasksInstances(fakeValue[String], fakeValue[Option[Long]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectIncrementEachTasksInstances",
      Seq(classOf[String], classOf[Option[Long]]),
      "PATCH",
      this.prefix + """v3/projects/""" + "$" + """name<[^/]+>/incrementEachTasksInstances""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_LegacyApiController_projectPause36_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/pause")))
  )
  private[this] lazy val controllers_LegacyApiController_projectPause36_invoker = createInvoker(
    LegacyApiController_0.projectPause(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectPause",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """v3/projects/""" + "$" + """name<[^/]+>/pause""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_LegacyApiController_projectResume37_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v3/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/resume")))
  )
  private[this] lazy val controllers_LegacyApiController_projectResume37_invoker = createInvoker(
    LegacyApiController_0.projectResume(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectResume",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """v3/projects/""" + "$" + """name<[^/]+>/resume""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] val prefixed_webknossos_latest_Routes_0_38 = Include(webknossos_latest_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v3/"))

  // @LINE:67
  private[this] lazy val controllers_LegacyApiController_annotationInfoV239_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/info")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationInfoV239_invoker = createInvoker(
    LegacyApiController_0.annotationInfoV2(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationInfoV2",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/info""",
      """ Support changes to v3 and v5""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_LegacyApiController_annotationFinishV240_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/finish")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationFinishV240_invoker = createInvoker(
    LegacyApiController_0.annotationFinishV2(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationFinishV2",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/finish""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_LegacyApiController_annotationMergeV441_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/merge/"), DynamicPart("mergedTyp", """[^/]+""",true), StaticPart("/"), DynamicPart("mergedId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_annotationMergeV441_invoker = createInvoker(
    LegacyApiController_0.annotationMergeV4(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationMergeV4",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""",
      """ support changes to v5""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_LegacyApiController_annotationEditV442_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationEditV442_invoker = createInvoker(
    LegacyApiController_0.annotationEditV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationEditV4",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_LegacyApiController_annotationDuplicateV443_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/duplicate")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationDuplicateV443_invoker = createInvoker(
    LegacyApiController_0.annotationDuplicateV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationDuplicateV4",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/duplicate""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_LegacyApiController_annotationReopenV444_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reopen")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationReopenV444_invoker = createInvoker(
    LegacyApiController_0.annotationReopenV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationReopenV4",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reopen""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_LegacyApiController_annotationResetV445_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reset")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationResetV445_invoker = createInvoker(
    LegacyApiController_0.annotationResetV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationResetV4",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """v2/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reset""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_LegacyApiController_annotationListForCurrentUserV446_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/user/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationListForCurrentUserV446_invoker = createInvoker(
    LegacyApiController_0.annotationListForCurrentUserV4(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationListForCurrentUserV4",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v2/user/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_LegacyApiController_annotationTasksV447_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/user/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationTasksV447_invoker = createInvoker(
    LegacyApiController_0.annotationTasksV4(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationTasksV4",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v2/user/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_LegacyApiController_annotationListByUserV448_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationListByUserV448_invoker = createInvoker(
    LegacyApiController_0.annotationListByUserV4(fakeValue[String], fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationListByUserV4",
      Seq(classOf[String], classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v2/users/""" + "$" + """id<[^/]+>/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_LegacyApiController_annotationTasksByUserV449_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationTasksByUserV449_invoker = createInvoker(
    LegacyApiController_0.annotationTasksByUserV4(fakeValue[String], fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationTasksByUserV4",
      Seq(classOf[String], classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v2/users/""" + "$" + """id<[^/]+>/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_LegacyApiController_annotationsForTaskV450_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/tasks/"), DynamicPart("id", """[^/]+""",true), StaticPart("/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationsForTaskV450_invoker = createInvoker(
    LegacyApiController_0.annotationsForTaskV4(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationsForTaskV4",
      Seq(classOf[String]),
      "GET",
      this.prefix + """v2/tasks/""" + "$" + """id<[^/]+>/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_LegacyApiController_annotationCreateExplorationalV451_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/createExplorational")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationCreateExplorationalV451_invoker = createInvoker(
    LegacyApiController_0.annotationCreateExplorationalV4(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationCreateExplorationalV4",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """v2/datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/createExplorational""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_LegacyApiController_taskListTasks52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/tasks/list")))
  )
  private[this] lazy val controllers_LegacyApiController_taskListTasks52_invoker = createInvoker(
    LegacyApiController_0.taskListTasks,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "taskListTasks",
      Nil,
      "POST",
      this.prefix + """v2/tasks/list""",
      """ Support changes to v4""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_LegacyApiController_projectRead53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_projectRead53_invoker = createInvoker(
    LegacyApiController_0.projectRead(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectRead",
      Seq(classOf[String]),
      "GET",
      this.prefix + """v2/projects/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:86
  private[this] lazy val controllers_LegacyApiController_projectDelete54_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_projectDelete54_invoker = createInvoker(
    LegacyApiController_0.projectDelete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectDelete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """v2/projects/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_LegacyApiController_projectUpdate55_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_projectUpdate55_invoker = createInvoker(
    LegacyApiController_0.projectUpdate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectUpdate",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """v2/projects/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:88
  private[this] lazy val controllers_LegacyApiController_projectTasksForProject56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_projectTasksForProject56_invoker = createInvoker(
    LegacyApiController_0.projectTasksForProject(fakeValue[String], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectTasksForProject",
      Seq(classOf[String], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v2/projects/""" + "$" + """name<[^/]+>/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_LegacyApiController_projectIncrementEachTasksInstances57_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/incrementEachTasksInstances")))
  )
  private[this] lazy val controllers_LegacyApiController_projectIncrementEachTasksInstances57_invoker = createInvoker(
    LegacyApiController_0.projectIncrementEachTasksInstances(fakeValue[String], fakeValue[Option[Long]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectIncrementEachTasksInstances",
      Seq(classOf[String], classOf[Option[Long]]),
      "PATCH",
      this.prefix + """v2/projects/""" + "$" + """name<[^/]+>/incrementEachTasksInstances""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_LegacyApiController_projectPause58_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/pause")))
  )
  private[this] lazy val controllers_LegacyApiController_projectPause58_invoker = createInvoker(
    LegacyApiController_0.projectPause(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectPause",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """v2/projects/""" + "$" + """name<[^/]+>/pause""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_LegacyApiController_projectResume59_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v2/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/resume")))
  )
  private[this] lazy val controllers_LegacyApiController_projectResume59_invoker = createInvoker(
    LegacyApiController_0.projectResume(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectResume",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """v2/projects/""" + "$" + """name<[^/]+>/resume""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] val prefixed_webknossos_latest_Routes_0_60 = Include(webknossos_latest_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v2/"))

  // @LINE:96
  private[this] lazy val controllers_LegacyApiController_annotationInfoV161_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/info")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationInfoV161_invoker = createInvoker(
    LegacyApiController_0.annotationInfoV1(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationInfoV1",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/info""",
      """ Support changes to v2 and v3, and v5""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_LegacyApiController_annotationFinishV162_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/finish")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationFinishV162_invoker = createInvoker(
    LegacyApiController_0.annotationFinishV1(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationFinishV1",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/finish""",
      """""",
      Seq()
    )
  )

  // @LINE:98
  private[this] lazy val controllers_LegacyApiController_annotationMergeV163_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/merge/"), DynamicPart("mergedTyp", """[^/]+""",true), StaticPart("/"), DynamicPart("mergedId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_annotationMergeV163_invoker = createInvoker(
    LegacyApiController_0.annotationMergeV1(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationMergeV1",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/merge/""" + "$" + """mergedTyp<[^/]+>/""" + "$" + """mergedId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_LegacyApiController_annotationEditV164_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationEditV164_invoker = createInvoker(
    LegacyApiController_0.annotationEditV1(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationEditV1",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:100
  private[this] lazy val controllers_LegacyApiController_annotationDuplicateV165_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/duplicate")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationDuplicateV165_invoker = createInvoker(
    LegacyApiController_0.annotationDuplicateV1(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationDuplicateV1",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/duplicate""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_LegacyApiController_annotationReopenV166_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reopen")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationReopenV166_invoker = createInvoker(
    LegacyApiController_0.annotationReopenV1(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationReopenV1",
      Seq(classOf[String], classOf[String]),
      "PATCH",
      this.prefix + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reopen""",
      """""",
      Seq()
    )
  )

  // @LINE:102
  private[this] lazy val controllers_LegacyApiController_annotationResetV167_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/annotations/"), DynamicPart("typ", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """[^/]+""",true), StaticPart("/reset")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationResetV167_invoker = createInvoker(
    LegacyApiController_0.annotationResetV1(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationResetV1",
      Seq(classOf[String], classOf[String]),
      "PUT",
      this.prefix + """v1/annotations/""" + "$" + """typ<[^/]+>/""" + "$" + """id<[^/]+>/reset""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_LegacyApiController_annotationListForCurrentUserV168_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/user/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationListForCurrentUserV168_invoker = createInvoker(
    LegacyApiController_0.annotationListForCurrentUserV1(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationListForCurrentUserV1",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v1/user/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:104
  private[this] lazy val controllers_LegacyApiController_annotationTasksV169_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/user/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationTasksV169_invoker = createInvoker(
    LegacyApiController_0.annotationTasksV1(fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationTasksV1",
      Seq(classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v1/user/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:105
  private[this] lazy val controllers_LegacyApiController_annotationListByUserV170_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationListByUserV170_invoker = createInvoker(
    LegacyApiController_0.annotationListByUserV1(fakeValue[String], fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationListByUserV1",
      Seq(classOf[String], classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v1/users/""" + "$" + """id<[^/]+>/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:106
  private[this] lazy val controllers_LegacyApiController_annotationTasksByUserV171_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/users/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationTasksByUserV171_invoker = createInvoker(
    LegacyApiController_0.annotationTasksByUserV1(fakeValue[String], fakeValue[Option[Boolean]], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationTasksByUserV1",
      Seq(classOf[String], classOf[Option[Boolean]], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v1/users/""" + "$" + """id<[^/]+>/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:107
  private[this] lazy val controllers_LegacyApiController_annotationsForTaskV172_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/tasks/"), DynamicPart("id", """[^/]+""",true), StaticPart("/annotations")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationsForTaskV172_invoker = createInvoker(
    LegacyApiController_0.annotationsForTaskV1(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationsForTaskV1",
      Seq(classOf[String]),
      "GET",
      this.prefix + """v1/tasks/""" + "$" + """id<[^/]+>/annotations""",
      """""",
      Seq()
    )
  )

  // @LINE:108
  private[this] lazy val controllers_LegacyApiController_annotationCreateExplorationalV173_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/datasets/"), DynamicPart("organizationName", """[^/]+""",true), StaticPart("/"), DynamicPart("datasetName", """[^/]+""",true), StaticPart("/createExplorational")))
  )
  private[this] lazy val controllers_LegacyApiController_annotationCreateExplorationalV173_invoker = createInvoker(
    LegacyApiController_0.annotationCreateExplorationalV1(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "annotationCreateExplorationalV1",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """v1/datasets/""" + "$" + """organizationName<[^/]+>/""" + "$" + """datasetName<[^/]+>/createExplorational""",
      """""",
      Seq()
    )
  )

  // @LINE:111
  private[this] lazy val controllers_LegacyApiController_taskListTasks74_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/tasks/list")))
  )
  private[this] lazy val controllers_LegacyApiController_taskListTasks74_invoker = createInvoker(
    LegacyApiController_0.taskListTasks,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "taskListTasks",
      Nil,
      "POST",
      this.prefix + """v1/tasks/list""",
      """ Support changes to v4""",
      Seq()
    )
  )

  // @LINE:112
  private[this] lazy val controllers_LegacyApiController_projectRead75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_projectRead75_invoker = createInvoker(
    LegacyApiController_0.projectRead(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectRead",
      Seq(classOf[String]),
      "GET",
      this.prefix + """v1/projects/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:113
  private[this] lazy val controllers_LegacyApiController_projectDelete76_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_projectDelete76_invoker = createInvoker(
    LegacyApiController_0.projectDelete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectDelete",
      Seq(classOf[String]),
      "DELETE",
      this.prefix + """v1/projects/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:114
  private[this] lazy val controllers_LegacyApiController_projectUpdate77_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/projects/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LegacyApiController_projectUpdate77_invoker = createInvoker(
    LegacyApiController_0.projectUpdate(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectUpdate",
      Seq(classOf[String]),
      "PUT",
      this.prefix + """v1/projects/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:115
  private[this] lazy val controllers_LegacyApiController_projectTasksForProject78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/tasks")))
  )
  private[this] lazy val controllers_LegacyApiController_projectTasksForProject78_invoker = createInvoker(
    LegacyApiController_0.projectTasksForProject(fakeValue[String], fakeValue[Option[Int]], fakeValue[Option[Int]], fakeValue[Option[Boolean]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectTasksForProject",
      Seq(classOf[String], classOf[Option[Int]], classOf[Option[Int]], classOf[Option[Boolean]]),
      "GET",
      this.prefix + """v1/projects/""" + "$" + """name<[^/]+>/tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:116
  private[this] lazy val controllers_LegacyApiController_projectIncrementEachTasksInstances79_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/incrementEachTasksInstances")))
  )
  private[this] lazy val controllers_LegacyApiController_projectIncrementEachTasksInstances79_invoker = createInvoker(
    LegacyApiController_0.projectIncrementEachTasksInstances(fakeValue[String], fakeValue[Option[Long]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectIncrementEachTasksInstances",
      Seq(classOf[String], classOf[Option[Long]]),
      "PATCH",
      this.prefix + """v1/projects/""" + "$" + """name<[^/]+>/incrementEachTasksInstances""",
      """""",
      Seq()
    )
  )

  // @LINE:117
  private[this] lazy val controllers_LegacyApiController_projectPause80_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/pause")))
  )
  private[this] lazy val controllers_LegacyApiController_projectPause80_invoker = createInvoker(
    LegacyApiController_0.projectPause(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectPause",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """v1/projects/""" + "$" + """name<[^/]+>/pause""",
      """""",
      Seq()
    )
  )

  // @LINE:118
  private[this] lazy val controllers_LegacyApiController_projectResume81_route = Route("PATCH",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("v1/projects/"), DynamicPart("name", """[^/]+""",true), StaticPart("/resume")))
  )
  private[this] lazy val controllers_LegacyApiController_projectResume81_invoker = createInvoker(
    LegacyApiController_0.projectResume(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "webknossos.versioned",
      "controllers.LegacyApiController",
      "projectResume",
      Seq(classOf[String]),
      "PATCH",
      this.prefix + """v1/projects/""" + "$" + """name<[^/]+>/resume""",
      """""",
      Seq()
    )
  )

  // @LINE:121
  private[this] val prefixed_webknossos_latest_Routes_0_82 = Include(webknossos_latest_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "v1/"))

  // @LINE:124
  private[this] val prefixed_webknossos_latest_Routes_0_83 = Include(webknossos_latest_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + ""))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:13
    case prefixed_webknossos_latest_Routes_0_0(handler) => handler
  
    // @LINE:16
    case controllers_LegacyApiController_assertValidNewNameV51_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_LegacyApiController_assertValidNewNameV51_invoker.call(LegacyApiController_0.assertValidNewNameV5(organizationName, datasetName))
      }
  
    // @LINE:18
    case prefixed_webknossos_latest_Routes_0_2(handler) => handler
  
    // @LINE:22
    case controllers_LegacyApiController_annotationInfoV43_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[Long]("timestamp", None)) { (typ, id, timestamp) =>
        controllers_LegacyApiController_annotationInfoV43_invoker.call(LegacyApiController_0.annotationInfoV4(typ, id, timestamp))
      }
  
    // @LINE:23
    case controllers_LegacyApiController_annotationFinishV44_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[Long]("timestamp", None)) { (typ, id, timestamp) =>
        controllers_LegacyApiController_annotationFinishV44_invoker.call(LegacyApiController_0.annotationFinishV4(typ, id, timestamp))
      }
  
    // @LINE:24
    case controllers_LegacyApiController_annotationMergeV45_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromPath[String]("mergedTyp", None), params.fromPath[String]("mergedId", None)) { (typ, id, mergedTyp, mergedId) =>
        controllers_LegacyApiController_annotationMergeV45_invoker.call(LegacyApiController_0.annotationMergeV4(typ, id, mergedTyp, mergedId))
      }
  
    // @LINE:25
    case controllers_LegacyApiController_annotationEditV46_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationEditV46_invoker.call(LegacyApiController_0.annotationEditV4(typ, id))
      }
  
    // @LINE:26
    case controllers_LegacyApiController_annotationDuplicateV47_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationDuplicateV47_invoker.call(LegacyApiController_0.annotationDuplicateV4(typ, id))
      }
  
    // @LINE:27
    case controllers_LegacyApiController_annotationReopenV48_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationReopenV48_invoker.call(LegacyApiController_0.annotationReopenV4(typ, id))
      }
  
    // @LINE:28
    case controllers_LegacyApiController_annotationResetV49_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationResetV49_invoker.call(LegacyApiController_0.annotationResetV4(typ, id))
      }
  
    // @LINE:29
    case controllers_LegacyApiController_annotationListForCurrentUserV410_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationListForCurrentUserV410_invoker.call(LegacyApiController_0.annotationListForCurrentUserV4(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:30
    case controllers_LegacyApiController_annotationTasksV411_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationTasksV411_invoker.call(LegacyApiController_0.annotationTasksV4(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:31
    case controllers_LegacyApiController_annotationListByUserV412_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationListByUserV412_invoker.call(LegacyApiController_0.annotationListByUserV4(id, isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:32
    case controllers_LegacyApiController_annotationTasksByUserV413_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationTasksByUserV413_invoker.call(LegacyApiController_0.annotationTasksByUserV4(id, isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:33
    case controllers_LegacyApiController_annotationsForTaskV414_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LegacyApiController_annotationsForTaskV414_invoker.call(LegacyApiController_0.annotationsForTaskV4(id))
      }
  
    // @LINE:34
    case controllers_LegacyApiController_annotationCreateExplorationalV415_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_LegacyApiController_annotationCreateExplorationalV415_invoker.call(LegacyApiController_0.annotationCreateExplorationalV4(organizationName, datasetName))
      }
  
    // @LINE:36
    case prefixed_webknossos_latest_Routes_0_16(handler) => handler
  
    // @LINE:39
    case controllers_LegacyApiController_annotationFinishV417_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[Long]("timestamp", None)) { (typ, id, timestamp) =>
        controllers_LegacyApiController_annotationFinishV417_invoker.call(LegacyApiController_0.annotationFinishV4(typ, id, timestamp))
      }
  
    // @LINE:40
    case controllers_LegacyApiController_annotationInfoV418_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromQuery[Long]("timestamp", None)) { (typ, id, timestamp) =>
        controllers_LegacyApiController_annotationInfoV418_invoker.call(LegacyApiController_0.annotationInfoV4(typ, id, timestamp))
      }
  
    // @LINE:41
    case controllers_LegacyApiController_annotationMergeV419_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromPath[String]("mergedTyp", None), params.fromPath[String]("mergedId", None)) { (typ, id, mergedTyp, mergedId) =>
        controllers_LegacyApiController_annotationMergeV419_invoker.call(LegacyApiController_0.annotationMergeV4(typ, id, mergedTyp, mergedId))
      }
  
    // @LINE:42
    case controllers_LegacyApiController_annotationEditV420_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationEditV420_invoker.call(LegacyApiController_0.annotationEditV4(typ, id))
      }
  
    // @LINE:43
    case controllers_LegacyApiController_annotationDuplicateV421_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationDuplicateV421_invoker.call(LegacyApiController_0.annotationDuplicateV4(typ, id))
      }
  
    // @LINE:44
    case controllers_LegacyApiController_annotationReopenV422_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationReopenV422_invoker.call(LegacyApiController_0.annotationReopenV4(typ, id))
      }
  
    // @LINE:45
    case controllers_LegacyApiController_annotationResetV423_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationResetV423_invoker.call(LegacyApiController_0.annotationResetV4(typ, id))
      }
  
    // @LINE:46
    case controllers_LegacyApiController_annotationListForCurrentUserV424_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationListForCurrentUserV424_invoker.call(LegacyApiController_0.annotationListForCurrentUserV4(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:47
    case controllers_LegacyApiController_annotationTasksV425_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationTasksV425_invoker.call(LegacyApiController_0.annotationTasksV4(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:48
    case controllers_LegacyApiController_annotationListByUserV426_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationListByUserV426_invoker.call(LegacyApiController_0.annotationListByUserV4(id, isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:49
    case controllers_LegacyApiController_annotationTasksByUserV427_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationTasksByUserV427_invoker.call(LegacyApiController_0.annotationTasksByUserV4(id, isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:50
    case controllers_LegacyApiController_annotationsForTaskV428_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LegacyApiController_annotationsForTaskV428_invoker.call(LegacyApiController_0.annotationsForTaskV4(id))
      }
  
    // @LINE:51
    case controllers_LegacyApiController_annotationCreateExplorationalV429_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_LegacyApiController_annotationCreateExplorationalV429_invoker.call(LegacyApiController_0.annotationCreateExplorationalV4(organizationName, datasetName))
      }
  
    // @LINE:54
    case controllers_LegacyApiController_taskListTasks30_route(params@_) =>
      call { 
        controllers_LegacyApiController_taskListTasks30_invoker.call(LegacyApiController_0.taskListTasks)
      }
  
    // @LINE:55
    case controllers_LegacyApiController_projectRead31_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectRead31_invoker.call(LegacyApiController_0.projectRead(name))
      }
  
    // @LINE:56
    case controllers_LegacyApiController_projectDelete32_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectDelete32_invoker.call(LegacyApiController_0.projectDelete(name))
      }
  
    // @LINE:57
    case controllers_LegacyApiController_projectUpdate33_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectUpdate33_invoker.call(LegacyApiController_0.projectUpdate(name))
      }
  
    // @LINE:58
    case controllers_LegacyApiController_projectTasksForProject34_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (name, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_projectTasksForProject34_invoker.call(LegacyApiController_0.projectTasksForProject(name, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:59
    case controllers_LegacyApiController_projectIncrementEachTasksInstances35_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Option[Long]]("delta", None)) { (name, delta) =>
        controllers_LegacyApiController_projectIncrementEachTasksInstances35_invoker.call(LegacyApiController_0.projectIncrementEachTasksInstances(name, delta))
      }
  
    // @LINE:60
    case controllers_LegacyApiController_projectPause36_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectPause36_invoker.call(LegacyApiController_0.projectPause(name))
      }
  
    // @LINE:61
    case controllers_LegacyApiController_projectResume37_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectResume37_invoker.call(LegacyApiController_0.projectResume(name))
      }
  
    // @LINE:63
    case prefixed_webknossos_latest_Routes_0_38(handler) => handler
  
    // @LINE:67
    case controllers_LegacyApiController_annotationInfoV239_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationInfoV239_invoker.call(LegacyApiController_0.annotationInfoV2(typ, id))
      }
  
    // @LINE:68
    case controllers_LegacyApiController_annotationFinishV240_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationFinishV240_invoker.call(LegacyApiController_0.annotationFinishV2(typ, id))
      }
  
    // @LINE:71
    case controllers_LegacyApiController_annotationMergeV441_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromPath[String]("mergedTyp", None), params.fromPath[String]("mergedId", None)) { (typ, id, mergedTyp, mergedId) =>
        controllers_LegacyApiController_annotationMergeV441_invoker.call(LegacyApiController_0.annotationMergeV4(typ, id, mergedTyp, mergedId))
      }
  
    // @LINE:72
    case controllers_LegacyApiController_annotationEditV442_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationEditV442_invoker.call(LegacyApiController_0.annotationEditV4(typ, id))
      }
  
    // @LINE:73
    case controllers_LegacyApiController_annotationDuplicateV443_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationDuplicateV443_invoker.call(LegacyApiController_0.annotationDuplicateV4(typ, id))
      }
  
    // @LINE:74
    case controllers_LegacyApiController_annotationReopenV444_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationReopenV444_invoker.call(LegacyApiController_0.annotationReopenV4(typ, id))
      }
  
    // @LINE:75
    case controllers_LegacyApiController_annotationResetV445_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationResetV445_invoker.call(LegacyApiController_0.annotationResetV4(typ, id))
      }
  
    // @LINE:76
    case controllers_LegacyApiController_annotationListForCurrentUserV446_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationListForCurrentUserV446_invoker.call(LegacyApiController_0.annotationListForCurrentUserV4(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:77
    case controllers_LegacyApiController_annotationTasksV447_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationTasksV447_invoker.call(LegacyApiController_0.annotationTasksV4(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:78
    case controllers_LegacyApiController_annotationListByUserV448_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationListByUserV448_invoker.call(LegacyApiController_0.annotationListByUserV4(id, isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:79
    case controllers_LegacyApiController_annotationTasksByUserV449_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationTasksByUserV449_invoker.call(LegacyApiController_0.annotationTasksByUserV4(id, isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:80
    case controllers_LegacyApiController_annotationsForTaskV450_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LegacyApiController_annotationsForTaskV450_invoker.call(LegacyApiController_0.annotationsForTaskV4(id))
      }
  
    // @LINE:81
    case controllers_LegacyApiController_annotationCreateExplorationalV451_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_LegacyApiController_annotationCreateExplorationalV451_invoker.call(LegacyApiController_0.annotationCreateExplorationalV4(organizationName, datasetName))
      }
  
    // @LINE:84
    case controllers_LegacyApiController_taskListTasks52_route(params@_) =>
      call { 
        controllers_LegacyApiController_taskListTasks52_invoker.call(LegacyApiController_0.taskListTasks)
      }
  
    // @LINE:85
    case controllers_LegacyApiController_projectRead53_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectRead53_invoker.call(LegacyApiController_0.projectRead(name))
      }
  
    // @LINE:86
    case controllers_LegacyApiController_projectDelete54_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectDelete54_invoker.call(LegacyApiController_0.projectDelete(name))
      }
  
    // @LINE:87
    case controllers_LegacyApiController_projectUpdate55_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectUpdate55_invoker.call(LegacyApiController_0.projectUpdate(name))
      }
  
    // @LINE:88
    case controllers_LegacyApiController_projectTasksForProject56_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (name, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_projectTasksForProject56_invoker.call(LegacyApiController_0.projectTasksForProject(name, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:89
    case controllers_LegacyApiController_projectIncrementEachTasksInstances57_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Option[Long]]("delta", None)) { (name, delta) =>
        controllers_LegacyApiController_projectIncrementEachTasksInstances57_invoker.call(LegacyApiController_0.projectIncrementEachTasksInstances(name, delta))
      }
  
    // @LINE:90
    case controllers_LegacyApiController_projectPause58_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectPause58_invoker.call(LegacyApiController_0.projectPause(name))
      }
  
    // @LINE:91
    case controllers_LegacyApiController_projectResume59_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectResume59_invoker.call(LegacyApiController_0.projectResume(name))
      }
  
    // @LINE:93
    case prefixed_webknossos_latest_Routes_0_60(handler) => handler
  
    // @LINE:96
    case controllers_LegacyApiController_annotationInfoV161_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationInfoV161_invoker.call(LegacyApiController_0.annotationInfoV1(typ, id))
      }
  
    // @LINE:97
    case controllers_LegacyApiController_annotationFinishV162_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationFinishV162_invoker.call(LegacyApiController_0.annotationFinishV1(typ, id))
      }
  
    // @LINE:98
    case controllers_LegacyApiController_annotationMergeV163_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None), params.fromPath[String]("mergedTyp", None), params.fromPath[String]("mergedId", None)) { (typ, id, mergedTyp, mergedId) =>
        controllers_LegacyApiController_annotationMergeV163_invoker.call(LegacyApiController_0.annotationMergeV1(typ, id, mergedTyp, mergedId))
      }
  
    // @LINE:99
    case controllers_LegacyApiController_annotationEditV164_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationEditV164_invoker.call(LegacyApiController_0.annotationEditV1(typ, id))
      }
  
    // @LINE:100
    case controllers_LegacyApiController_annotationDuplicateV165_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationDuplicateV165_invoker.call(LegacyApiController_0.annotationDuplicateV1(typ, id))
      }
  
    // @LINE:101
    case controllers_LegacyApiController_annotationReopenV166_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationReopenV166_invoker.call(LegacyApiController_0.annotationReopenV1(typ, id))
      }
  
    // @LINE:102
    case controllers_LegacyApiController_annotationResetV167_route(params@_) =>
      call(params.fromPath[String]("typ", None), params.fromPath[String]("id", None)) { (typ, id) =>
        controllers_LegacyApiController_annotationResetV167_invoker.call(LegacyApiController_0.annotationResetV1(typ, id))
      }
  
    // @LINE:103
    case controllers_LegacyApiController_annotationListForCurrentUserV168_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationListForCurrentUserV168_invoker.call(LegacyApiController_0.annotationListForCurrentUserV1(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:104
    case controllers_LegacyApiController_annotationTasksV169_route(params@_) =>
      call(params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationTasksV169_invoker.call(LegacyApiController_0.annotationTasksV1(isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:105
    case controllers_LegacyApiController_annotationListByUserV170_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationListByUserV170_invoker.call(LegacyApiController_0.annotationListByUserV1(id, isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:106
    case controllers_LegacyApiController_annotationTasksByUserV171_route(params@_) =>
      call(params.fromPath[String]("id", None), params.fromQuery[Option[Boolean]]("isFinished", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (id, isFinished, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_annotationTasksByUserV171_invoker.call(LegacyApiController_0.annotationTasksByUserV1(id, isFinished, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:107
    case controllers_LegacyApiController_annotationsForTaskV172_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LegacyApiController_annotationsForTaskV172_invoker.call(LegacyApiController_0.annotationsForTaskV1(id))
      }
  
    // @LINE:108
    case controllers_LegacyApiController_annotationCreateExplorationalV173_route(params@_) =>
      call(params.fromPath[String]("organizationName", None), params.fromPath[String]("datasetName", None)) { (organizationName, datasetName) =>
        controllers_LegacyApiController_annotationCreateExplorationalV173_invoker.call(LegacyApiController_0.annotationCreateExplorationalV1(organizationName, datasetName))
      }
  
    // @LINE:111
    case controllers_LegacyApiController_taskListTasks74_route(params@_) =>
      call { 
        controllers_LegacyApiController_taskListTasks74_invoker.call(LegacyApiController_0.taskListTasks)
      }
  
    // @LINE:112
    case controllers_LegacyApiController_projectRead75_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectRead75_invoker.call(LegacyApiController_0.projectRead(name))
      }
  
    // @LINE:113
    case controllers_LegacyApiController_projectDelete76_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectDelete76_invoker.call(LegacyApiController_0.projectDelete(name))
      }
  
    // @LINE:114
    case controllers_LegacyApiController_projectUpdate77_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectUpdate77_invoker.call(LegacyApiController_0.projectUpdate(name))
      }
  
    // @LINE:115
    case controllers_LegacyApiController_projectTasksForProject78_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Option[Int]]("limit", None), params.fromQuery[Option[Int]]("pageNumber", None), params.fromQuery[Option[Boolean]]("includeTotalCount", None)) { (name, limit, pageNumber, includeTotalCount) =>
        controllers_LegacyApiController_projectTasksForProject78_invoker.call(LegacyApiController_0.projectTasksForProject(name, limit, pageNumber, includeTotalCount))
      }
  
    // @LINE:116
    case controllers_LegacyApiController_projectIncrementEachTasksInstances79_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Option[Long]]("delta", None)) { (name, delta) =>
        controllers_LegacyApiController_projectIncrementEachTasksInstances79_invoker.call(LegacyApiController_0.projectIncrementEachTasksInstances(name, delta))
      }
  
    // @LINE:117
    case controllers_LegacyApiController_projectPause80_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectPause80_invoker.call(LegacyApiController_0.projectPause(name))
      }
  
    // @LINE:118
    case controllers_LegacyApiController_projectResume81_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_LegacyApiController_projectResume81_invoker.call(LegacyApiController_0.projectResume(name))
      }
  
    // @LINE:121
    case prefixed_webknossos_latest_Routes_0_82(handler) => handler
  
    // @LINE:124
    case prefixed_webknossos_latest_Routes_0_83(handler) => handler
  }
}
