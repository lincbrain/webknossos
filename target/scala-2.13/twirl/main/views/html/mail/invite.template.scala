
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

object invite extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(senderName: String, organizationDisplayName: String, inviteTokenValue: String, uri: String, autoVerify: Boolean ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

  """),format.raw/*5.3*/("""<p>Hello,</p>

  <p>
    You have been invited by """),_display_(/*8.31*/senderName),format.raw/*8.41*/(""" """),format.raw/*8.42*/("""to join their organization “"""),_display_(/*8.71*/organizationDisplayName),format.raw/*8.94*/("""” in WEBKNOSSOS.
  </p>
  <p>
    Please visit <a href=""""),_display_(/*11.28*/{uri}),format.raw/*11.33*/("""/invite/"""),_display_(/*11.42*/inviteTokenValue),format.raw/*11.58*/("""">"""),_display_(/*11.61*/{uri}),format.raw/*11.66*/("""/invite/"""),_display_(/*11.75*/inviteTokenValue),format.raw/*11.91*/("""</a> to sign up or join them with an existing WEBKNOSSOS account.
  </p>

  <p>With best regards,<br />your WEBKNOSSOS team</p>
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(senderName:String,organizationDisplayName:String,inviteTokenValue:String,uri:String,autoVerify:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(senderName,organizationDisplayName,inviteTokenValue,uri,autoVerify)

  def f:((String,String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (senderName,organizationDisplayName,inviteTokenValue,uri,autoVerify) => apply(senderName,organizationDisplayName,inviteTokenValue,uri,autoVerify)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/invite.scala.html
                  HASH: 729dec673e7a4dae55c90e71d6c29b4dafaae00f
                  MATRIX: 764->1|972->116|999->118|1026->137|1065->139|1095->143|1172->194|1202->204|1230->205|1285->234|1328->257|1412->314|1438->319|1474->328|1511->344|1541->347|1567->352|1603->361|1640->377|1799->506
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|32->8|32->8|32->8|32->8|32->8|35->11|35->11|35->11|35->11|35->11|35->11|35->11|35->11|39->15
                  -- GENERATED --
              */
          