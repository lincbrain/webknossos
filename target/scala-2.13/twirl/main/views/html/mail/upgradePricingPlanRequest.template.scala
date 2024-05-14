
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

object upgradePricingPlanRequest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, organizationDisplayName: String, messageBody: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p>Hi WEBKNOSSOS sales team</p>
<p>There is a new request to upgrade a WEBKNOSSOS organization with additional plan/features.</p>
<p>User: """),_display_(/*6.11*/{name}),format.raw/*6.17*/("""</p> 
<p>Organization: """),_display_(/*7.19*/{organizationDisplayName}),format.raw/*7.44*/("""</p>
<p>Request: """),_display_(/*8.14*/{messageBody}),format.raw/*8.27*/("""</p>

<p>With best regards,<br/>WEBKNOSSOS</p>
""")))}))
      }
    }
  }

  def render(name:String,organizationDisplayName:String,messageBody:String): play.twirl.api.HtmlFormat.Appendable = apply(name,organizationDisplayName,messageBody)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,organizationDisplayName,messageBody) => apply(name,organizationDisplayName,messageBody)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/upgradePricingPlanRequest.scala.html
                  HASH: 2b3b82274936565d1b0f2e08a50e2817f57cb279
                  MATRIX: 768->1|930->70|957->72|984->91|1023->93|1050->94|1216->234|1242->240|1292->264|1337->289|1381->307|1414->320
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|30->6|30->6|31->7|31->7|32->8|32->8
                  -- GENERATED --
              */
          