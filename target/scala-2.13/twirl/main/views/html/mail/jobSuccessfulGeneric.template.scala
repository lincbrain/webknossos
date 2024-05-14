
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

object jobSuccessfulGeneric extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, datasetName: String, jobLink: String, jobTitle: String, jobDescription: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p>Hi """),_display_(/*4.8*/{name}),format.raw/*4.14*/(""",</p>

<p>We wanted to let you know that WEBKNOSSOS has finished your background job for the dataset <i>"""),_display_(/*6.99*/{datasetName}),format.raw/*6.112*/("""</i>. 
<p>"""),_display_(/*7.5*/{jobDescription}),format.raw/*7.21*/("""</p>

<div style="text-align: center;">
  <a href=""""),_display_(/*10.13*/{jobLink}),format.raw/*10.22*/("""" style="
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

<p>With best regards,<br />the WEBKNOSSOS team</p>

<div style="text-align: center;">
  <img src="https://static.webknossos.org/mails/email-drawing-successful-job.png" 
    srcset="https://static.webknossos.org/mails/email-drawing-successful-job.svg" 
    alt="A person celebrating a successful WEBKNOSSOS job" 
    style="width: 460px; height: 307px; margin-top: 10px; margin-bottom: 20px;"/>
</div>
""")))}))
      }
    }
  }

  def render(name:String,datasetName:String,jobLink:String,jobTitle:String,jobDescription:String): play.twirl.api.HtmlFormat.Appendable = apply(name,datasetName,jobLink,jobTitle,jobDescription)

  def f:((String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,datasetName,jobLink,jobTitle,jobDescription) => apply(name,datasetName,jobLink,jobTitle,jobDescription)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/jobSuccessfulGeneric.scala.html
                  HASH: 13a45dd86927eec0da841c0477bf09812a450025
                  MATRIX: 777->1|965->96|992->98|1019->117|1058->119|1085->120|1117->127|1143->133|1274->238|1308->251|1344->262|1380->278|1459->330|1489->339
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|30->6|30->6|31->7|31->7|34->10|34->10
                  -- GENERATED --
              */
          