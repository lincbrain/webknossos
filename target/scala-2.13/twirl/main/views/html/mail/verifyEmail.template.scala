
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

object verifyEmail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( name: String, url: String, linkExpiry: String ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<p>Hi """),_display_(/*4.10*/name),format.raw/*4.14*/(""",</p>

  <p>
    To continue setting up your WEBKNOSSOS account, please verify that this is your email address.
  </p>
  <div style="text-align: center;">
    <a href=""""),_display_(/*10.15*/{url}),format.raw/*10.20*/("""" style="
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
      Verify email address
    </a>
  </div>
  <p>With best regards,<br />your WEBKNOSSOS team</p>
  <p style="margin-top: 20px; color: #888; font-size: 0.6rem;">
    """),_display_(/*29.6*/{linkExpiry}),format.raw/*29.18*/("""If you did not make this request, please disregard this email.
  </p>
""")))}),format.raw/*31.2*/("""

"""))
      }
    }
  }

  def render(name:String,url:String,linkExpiry:String): play.twirl.api.HtmlFormat.Appendable = apply(name,url,linkExpiry)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,url,linkExpiry) => apply(name,url,linkExpiry)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/verifyEmail.scala.html
                  HASH: 67f3b11a1afe89b1001a23e039752ffc595bc0b5
                  MATRIX: 754->1|897->51|924->53|951->72|990->74|1019->77|1052->84|1076->88|1272->257|1298->262|1840->778|1873->790|1974->861
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|34->10|34->10|53->29|53->29|55->31
                  -- GENERATED --
              */
          