
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

object resetPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( name: String, uri: String, token: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<p>Hi """),_display_(/*4.10*/name),format.raw/*4.14*/(""",</p>
  <p>
    You received this mail because you requested to change your password.
    To change your password <a href=""""),_display_(/*7.39*/{uri}),format.raw/*7.44*/("""/auth/finishResetPassword?token="""),_display_(/*7.77*/token),format.raw/*7.82*/("""">click here</a> (or go to """),_display_(/*7.110*/{uri}),format.raw/*7.115*/("""/auth/finishResetPassword?token="""),_display_(/*7.148*/token),format.raw/*7.153*/(""") and reset your password.
  </p>

  <p>With best regards,<br />your WEBKNOSSOS team</p>
""")))}))
      }
    }
  }

  def render(name:String,uri:String,token:String): play.twirl.api.HtmlFormat.Appendable = apply(name,uri,token)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,uri,token) => apply(name,uri,token)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/resetPassword.scala.html
                  HASH: faf74d02aa6506ad38124dac5dd8ec84c049195e
                  MATRIX: 756->1|893->45|920->47|947->66|986->68|1015->71|1048->78|1072->82|1222->206|1247->211|1306->244|1331->249|1386->277|1412->282|1472->315|1498->320
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|31->7|31->7|31->7|31->7|31->7|31->7|31->7|31->7
                  -- GENERATED --
              */
          