
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

object jobSuccessfulUploadConvert extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, datasetName: String, jobLink: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p>Hi """),_display_(/*4.8*/{name}),format.raw/*4.14*/(""",</p>

<p>
  Your dataset """),_display_(/*7.17*/{datasetName}),format.raw/*7.30*/(""" """),format.raw/*7.31*/("""is ready for exploration. 
  WEBKNOSSOS has successfully uploaded and converted the dataset. 
  Click the button below to open the dataset or find it amongst your other datasets in the WEBKNOSSOS dashboard.
</p>

<div style="text-align: center;">
  <a href=""""),_display_(/*13.13*/{jobLink}),format.raw/*13.22*/("""" style="
      color: #fff;
      padding: 4px 15px;
      height: 32px;
      background: #5660ff;
      border: 1px solid #808cff;
      text-align: center;
      font-weight: 400;
      font-size: 14px;
      line-height: 2.1;
      text-decoration: none;
      border-radius: 4px;
      display: inline-block;
    ">
    Open in WEBKNOSSOS
  </a>
</div>

<p>
  Did you know that we offer services for <a href="https://webknossos.org/services/alignment">dataset alignment & stitching</a> and <a href="https://webknossos.org/services/automated-segmentation">AI image segmentation</a> to kickstart your research?
</p>
<div style="text-align: center; margin-top: 10px; margin-bottom: 6px;">
  <img src="https://static.webknossos.org/mails/email-alignment-preview.600.jpg"
    alt="A preview of the alignment services for a WEBKNOSSOS dataset" 
    style="width: 300px; height: 150px;" />
</div>

<div style="text-align: center; margin-bottom: 20px;">
  <img src="https://static.webknossos.org/mails/email-segmentation-preview.600.jpg"
    alt="A preview of a full, automated segmentation of a WEBKNOSSOS dataset" 
    style="width: 300px; height: 150px;" />
</div>

<p>With best regards,<br />the WEBKNOSSOS team</p>
""")))}))
      }
    }
  }

  def render(name:String,datasetName:String,jobLink:String): play.twirl.api.HtmlFormat.Appendable = apply(name,datasetName,jobLink)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,datasetName,jobLink) => apply(name,datasetName,jobLink)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/jobSuccessfulUploadConvert.scala.html
                  HASH: fdca87d427d6ed8dc9c3f40827baf82094a4d182
                  MATRIX: 769->1|915->54|942->56|969->75|1008->77|1035->78|1067->85|1093->91|1146->118|1179->131|1207->132|1493->391|1523->400
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|31->7|31->7|31->7|37->13|37->13
                  -- GENERATED --
              */
          