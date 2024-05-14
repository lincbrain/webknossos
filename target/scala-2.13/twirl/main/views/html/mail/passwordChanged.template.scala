
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

object passwordChanged extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( name: String, uri: String ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<p>Hi """),_display_(/*4.10*/name),format.raw/*4.14*/(""",</p>

  <p>
    The password for your WEBKNOSSOS account on <a href=""""),_display_(/*7.59*/{uri}),format.raw/*7.64*/("""">"""),_display_(/*7.67*/uri),format.raw/*7.70*/("""</a> has successfully been changed.
  </p>
  
  <p>
    If you did not initiate this change, please contact your administrator immediately.
  </p>

  <p>With best regards,<br />your WEBKNOSSOS team</p>
""")))}),format.raw/*15.2*/("""

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
                  SOURCE: app/views/mail/passwordChanged.scala.html
                  HASH: a225c45072fbe7e558f0f980866c1e2d6d2040cc
                  MATRIX: 751->1|874->31|901->33|928->52|967->54|996->57|1029->64|1053->68|1150->139|1175->144|1204->147|1227->150|1460->353
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|31->7|31->7|31->7|31->7|39->15
                  -- GENERATED --
              */
          