
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

object upgradePricingPlanUsers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( name: String, requestedUsers: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p>Hi """),_display_(/*4.8*/{name}),format.raw/*4.14*/("""</p>
<p>Thank you for requesting to upgrade your WEBKNOSSOS plan with more users. Our sales team will be in contact with
  you shortly with a formal offer.</p>

<p>Requested additional users: """),_display_(/*8.33*/{requestedUsers}),format.raw/*8.49*/("""</p>

<p>With best regards,<br />the WEBKNOSSOS team</p>
""")))}))
      }
    }
  }

  def render(name:String,requestedUsers:Int): play.twirl.api.HtmlFormat.Appendable = apply(name,requestedUsers)

  def f:((String,Int) => play.twirl.api.HtmlFormat.Appendable) = (name,requestedUsers) => apply(name,requestedUsers)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/upgradePricingPlanUsers.scala.html
                  HASH: 32ac692c957e4be6515353855e10ac2c0936f9fe
                  MATRIX: 756->1|886->38|913->40|940->59|979->61|1006->62|1038->69|1064->75|1283->268|1319->284
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|32->8|32->8
                  -- GENERATED --
              */
          