
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

object notifyAdminNewOrganization extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( organizationDisplayName: String, creatorMail: String, domain: String ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<p>Hi,</p>

  <p>
    we noticed that """),_display_(/*7.22*/creatorMail),format.raw/*7.33*/(""" """),format.raw/*7.34*/("""created a new WEBKNOSSOS organization named “"""),_display_(/*7.80*/organizationDisplayName),format.raw/*7.103*/("""” on <a href=""""),_display_(/*7.118*/domain),format.raw/*7.124*/("""">"""),_display_(/*7.127*/domain),format.raw/*7.133*/("""</a>.
  </p>

  <p>With best regards,<br />your WEBKNOSSOS team</p>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(organizationDisplayName:String,creatorMail:String,domain:String): play.twirl.api.HtmlFormat.Appendable = apply(organizationDisplayName,creatorMail,domain)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (organizationDisplayName,creatorMail,domain) => apply(organizationDisplayName,creatorMail,domain)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/notifyAdminNewOrganization.scala.html
                  HASH: c6420e553e88b666dab1c900c195fc18b28df9a1
                  MATRIX: 769->1|935->74|962->76|989->95|1028->97|1057->100|1122->139|1153->150|1181->151|1253->197|1297->220|1339->235|1366->241|1396->244|1423->250|1522->319
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|31->7|31->7|31->7|31->7|31->7|31->7|31->7|31->7|31->7|35->11
                  -- GENERATED --
              */
          