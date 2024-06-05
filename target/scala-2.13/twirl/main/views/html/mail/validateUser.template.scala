
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

object validateUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( name: String, uri: String ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<p>Hi """),_display_(/*4.10*/name),format.raw/*4.14*/(""",</p>

  <p>
    Great news, your account is now activated and you are ready to share and annotate your large 3D datasets.
  </p>

  <p><a href=""""),_display_(/*10.16*/{uri}),format.raw/*10.21*/("""">Click here to get started with WEBKNOSSOS.</a></p>

  <p>With best regards,<br />your WEBKNOSSOS team</p>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(name:String,uri:String): play.twirl.api.HtmlFormat.Appendable = apply(name,uri)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,uri) => apply(name,uri)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/validateUser.scala.html
                  HASH: 5a060df0f03c1bd5d1297b3d2b00f59aafb5ec15
                  MATRIX: 748->1|871->31|898->33|925->52|964->54|993->57|1026->64|1050->68|1223->214|1249->219|1388->328
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|34->10|34->10|37->13
                  -- GENERATED --
              */
          