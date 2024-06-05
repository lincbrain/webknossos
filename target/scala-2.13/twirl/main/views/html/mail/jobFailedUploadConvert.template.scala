
package views.html.mail

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object jobFailedUploadConvert extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, datasetName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p>Hi """),_display_(/*4.8*/{name}),format.raw/*4.14*/(""",</p>

<p>
  oops, unfortunately WEBKNOSSOS could not upload and convert your dataset <i>"""),_display_(/*7.80*/{datasetName}),format.raw/*7.93*/("""</i> automatically. 
  This should not have happened and we are sorry about the inconvenience. Our engineers will investigate and fix the
  problem as soon as possible.
</p>

<p>Here are some tips for uploading and converting datasets:
<ul>
  <li><a href="https://docs.webknossos.org/webknossos/data_formats.html">See the document on supported files formats</a></li>
  <li><a href="https://docs.webknossos.org/webknossos-py/index.html">Try our Python library for uploading datasets</a></li>
  <li><a href="https://docs.webknossos.org/webknossos/datasets.html#working-with-zarr-neuroglancer-precomputed-and-n5-datasets">Try streaming your data as Zarr, Neuroglancer, or N5 files instead of uploading</a></li>
</ul>
</p>

<p>
  Feel free to <a href="mailto://hello@webknossos.com">contact us for assistance</a> or please try again later.
</p>


<p>With best regards,<br />the WEBKNOSSOS team</p>

<div style="text-align: center;">
  <img src="https://static.webknossos.org/mails/email-drawing-failed-job.png"
    srcset="https://static.webknossos.org/mails/email-drawing-failed-job.svg"
    alt="A person dismayed about an unsuccessful WEBKNOSSOS dataset upload job"
    style="width: 460px; height: 258px; margin-top: 10px; margin-bottom: 20px" />
</div>
""")))}))
      }
    }
  }

  def render(name:String,datasetName:String): play.twirl.api.HtmlFormat.Appendable = apply(name,datasetName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,datasetName) => apply(name,datasetName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/jobFailedUploadConvert.scala.html
                  HASH: b05836af576afffb73009517087ee2e472ba5890
                  MATRIX: 758->1|887->37|914->39|941->58|980->60|1007->61|1039->68|1065->74|1181->164|1214->177
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|31->7|31->7
                  -- GENERATED --
              */
          