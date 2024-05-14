
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

object newUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, enableAutoVerify: Boolean ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

  """),format.raw/*5.3*/("""<p>Hi """),_display_(/*5.10*/name),format.raw/*5.14*/(""",</p>

  """),_display_(if(!enableAutoVerify)/*7.25*/ {_display_(Seq[Any](format.raw/*7.27*/("""
    """),format.raw/*8.5*/("""<p>
      Welcome to your new WEBKNOSSOS account. You are almost ready to share and annotate your large 3D datasets.
    </p>
    <p>Your account is currently under review. An administrator will activate you soon.</p>
  """)))}else/*12.10*/{_display_(Seq[Any](format.raw/*12.11*/("""
    """),format.raw/*13.5*/("""<p>
      Welcome to your new WEBKNOSSOS account. Get ready to share and annotate your large 3D datasets.
    </p>
  """)))}),format.raw/*16.4*/("""

  """),format.raw/*18.3*/("""<p>With best regards,<br />your WEBKNOSSOS team</p>
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(name:String,enableAutoVerify:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(name,enableAutoVerify)

  def f:((String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (name,enableAutoVerify) => apply(name,enableAutoVerify)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/newUser.scala.html
                  HASH: 5054775517df6fb2cd333bcac7e81c868ccdae6d
                  MATRIX: 744->1|880->44|907->46|934->65|973->67|1003->71|1036->78|1060->82|1117->113|1156->115|1187->120|1431->347|1470->348|1502->353|1650->471|1681->475|1764->528
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|29->5|29->5|31->7|31->7|32->8|36->12|36->12|37->13|40->16|42->18|43->19
                  -- GENERATED --
              */
          