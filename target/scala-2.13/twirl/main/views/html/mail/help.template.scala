
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

object help extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( name: String, organizationDisplayName: String, message: String, currentUrl: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p>Hi WEBKNOSSOS team</p>
<p>I have a question or feedback for you:</p>
<p>
  """),_display_(/*7.4*/{message}),format.raw/*7.13*/("""
"""),format.raw/*8.1*/("""</p>

<p>Current URL: """),_display_(/*10.18*/{currentUrl}),format.raw/*10.30*/("""</p>

<p>With best regards,<br />"""),_display_(/*12.29*/{name}),format.raw/*12.35*/(""" """),format.raw/*12.36*/("""from """),_display_(/*12.42*/{organizationDisplayName}),format.raw/*12.67*/("""</p>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(name:String,organizationDisplayName:String,message:String,currentUrl:String): play.twirl.api.HtmlFormat.Appendable = apply(name,organizationDisplayName,message,currentUrl)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,organizationDisplayName,message,currentUrl) => apply(name,organizationDisplayName,message,currentUrl)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/help.scala.html
                  HASH: 08ad08311529c572acd2808ca22300cb98e38c03
                  MATRIX: 754->1|933->87|960->89|987->108|1026->110|1053->111|1157->190|1186->199|1213->200|1263->223|1296->235|1357->269|1384->275|1413->276|1446->282|1492->307|1528->313
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|31->7|31->7|32->8|34->10|34->10|36->12|36->12|36->12|36->12|36->12|37->13
                  -- GENERATED --
              */
          