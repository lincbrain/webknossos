
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

object jobSuccessfulSegmentation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, datasetName: String, jobLink: String, jobTitle: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p>Hi """),_display_(/*4.8*/{name}),format.raw/*4.14*/(""",</p>

<p>
  Your """),_display_(/*7.9*/{jobTitle}),format.raw/*7.19*/(""" """),format.raw/*7.20*/("""is ready for exploration. 
  WEBKNOSSOS sucessfully applied our machine learning models on the specific subset of the <i>"""),_display_(/*8.96*/{datasetName}),format.raw/*8.109*/("""</i> dataset. 
  Click the button below to open the dataset or find it amongst your other dataset in the WEBKNOSSOS dashboard.
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
  Do you like what you see? Expand the segmentation to the whole dataset. <a href="mailto://hello@webknossos.com">Contact us to get a quote. We can also fine-tune the segmentation models for higher quality results.</a>.
</p>
<div style="text-align: center; margin-top: 10px; margin-bottom: 6px;">
  <img src="https://static.webknossos.org/mails/email-expand-segmentation-preview.600.jpg"
    alt="A preview of a full, automated segmentation of a WEBKNOSSOS dataset"
    style="width: 600px; height: 300px;"/>
</div>

<p>
  Do you want to make corrections to the automated segmentation? Use the easy-to-use, built-in <a href="https://docs.webknossos.org/webknossos/proof_reading.html#proofreading-tool">proof-reading tools in WEBKNOSSOS</a> (requires Power plan).
</p>
<div style="text-align: center; margin-bottom: 20px;">
  <img src="https://static.webknossos.org/mails/email-proofreading-preview.600.jpg" 
    alt="A preview of the proofreading tools for a segmentation of a WEBKNOSSOS dataset"
    style="width: 600px; height: 300px;" />
</div>

<p>With best regards,<br />the WEBKNOSSOS team</p>
""")))}))
      }
    }
  }

  def render(name:String,datasetName:String,jobLink:String,jobTitle:String): play.twirl.api.HtmlFormat.Appendable = apply(name,datasetName,jobLink,jobTitle)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,datasetName,jobLink,jobTitle) => apply(name,datasetName,jobLink,jobTitle)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/jobSuccessfulSegmentation.scala.html
                  HASH: dc1e6e927a1a74fee75df7a45698db96febad893
                  MATRIX: 775->1|939->72|966->74|993->93|1032->95|1059->96|1091->103|1117->109|1161->128|1191->138|1219->139|1367->261|1401->274|1607->453|1637->462
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|31->7|31->7|31->7|32->8|32->8|37->13|37->13
                  -- GENERATED --
              */
          