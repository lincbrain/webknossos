
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

object extendPricingPlan extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p>Hi """),_display_(/*4.8*/{name}),format.raw/*4.14*/("""</p>
<p>Thank you for requesting to extend your current WEBKNOSSOS plan. Our sales team will be in contact with
  you shortly with a formal offer.</p>

<p>With best regards,<br />the WEBKNOSSOS team</p>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/extendPricingPlan.scala.html
                  HASH: bb780a9b9385f4be291599cb4ca19ab2e5068c6a
                  MATRIX: 746->1|855->17|882->19|909->38|948->40|975->41|1007->48|1033->54
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4
                  -- GENERATED --
              */
          