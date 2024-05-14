
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

object jobFailedGeneric extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, datasetName: String, jobTitle: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p>Hi """),_display_(/*4.8*/{name}),format.raw/*4.14*/(""",</p>

<p>
  oops, something unexpected went wrong when working on your WEBKNOSSOS """),_display_(/*7.74*/{jobTitle}),format.raw/*7.84*/(""" """),format.raw/*7.85*/("""job for the <i>"""),_display_(/*7.101*/{datasetName}),format.raw/*7.114*/("""</i> dataset.
  This should not have happened and we are sorry about the inconvenience. Our engineers will investigate and fix the problem as soon as possible. 
</p>
<p>
Feel free to contact us via email for assistance or please try again later.
</p>

<p>With best regards,<br />the WEBKNOSSOS team</p>

<div style="text-align: center;">
  <img src="https://static.webknossos.org/mails/email-drawing-failed-job.png"
    srcset="https://static.webknossos.org/mails/email-drawing-failed-job.svg"
    alt="A person dismayed about an unsuccessful WEBKNOSSOS job" 
    style="width: 460px; height: 258px; margin-top: 10px; margin-bottom: 20px" />
</div>

""")))}))
      }
    }
  }

  def render(name:String,datasetName:String,jobTitle:String): play.twirl.api.HtmlFormat.Appendable = apply(name,datasetName,jobTitle)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,datasetName,jobTitle) => apply(name,datasetName,jobTitle)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/jobFailedGeneric.scala.html
                  HASH: 16a53e21ffaebf4b07c77161f8dd1685a87c30bb
                  MATRIX: 759->1|906->55|933->57|960->76|999->78|1026->79|1058->86|1084->92|1194->176|1224->186|1252->187|1295->203|1329->216
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|31->7|31->7|31->7|31->7|31->7
                  -- GENERATED --
              */
          