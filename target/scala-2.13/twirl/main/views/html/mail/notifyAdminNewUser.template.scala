
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

object notifyAdminNewUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( username: String, uri: String, autoActivate: Boolean ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<p>Hi,</p>

  <p>A new user - """),_display_(/*6.20*/username),format.raw/*6.28*/(""" """),format.raw/*6.29*/("""- just registered a WEBKNOSSOS account for your <a href=""""),_display_(/*6.87*/uri),format.raw/*6.90*/("""">organization.</a></p>
  <p>
    """),_display_(if(autoActivate)/*8.22*/ {_display_(Seq[Any](format.raw/*8.24*/("""
    """),format.raw/*9.5*/("""As this user joined via invite link, they are automatically activated. To manage their permissions and assign them to a team within your organization, visit  <a href=""""),_display_(/*9.173*/{uri}),format.raw/*9.178*/("""/users">"""),_display_(/*9.187*/{uri}),format.raw/*9.192*/("""/users</a>.
    """)))}else/*10.12*/{_display_(Seq[Any](format.raw/*10.13*/("""
    """),format.raw/*11.5*/("""Please, remember to activate and verify new user accounts and assign them to a team within your organization. Visit  <a href=""""),_display_(/*11.132*/{uri}),format.raw/*11.137*/("""/users">"""),_display_(/*11.146*/{uri}),format.raw/*11.151*/("""/users</a> to activate the account.
    """)))}),format.raw/*12.6*/("""
  """),format.raw/*13.3*/("""</p>

  <p>With best regards,<br />your WEBKNOSSOS team</p>
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(username:String,uri:String,autoActivate:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(username,uri,autoActivate)

  def f:((String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (username,uri,autoActivate) => apply(username,uri,autoActivate)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/notifyAdminNewUser.scala.html
                  HASH: fb827326a82ddbfbb129b4cc4b4ba8043a821a20
                  MATRIX: 762->1|912->58|939->60|966->79|1005->81|1034->84|1091->115|1119->123|1147->124|1231->182|1254->185|1331->236|1370->238|1401->243|1596->411|1622->416|1658->425|1684->430|1724->453|1763->454|1795->459|1950->586|1977->591|2014->600|2041->605|2112->646|2142->649|2233->710
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|30->6|30->6|30->6|30->6|30->6|32->8|32->8|33->9|33->9|33->9|33->9|33->9|34->10|34->10|35->11|35->11|35->11|35->11|35->11|36->12|37->13|40->16
                  -- GENERATED --
              */
          