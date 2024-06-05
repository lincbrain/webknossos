
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

object upgradePricingPlanStorage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, requestedStorage: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<p>Hi """),_display_(/*4.8*/{name}),format.raw/*4.14*/("""</p>
<p>Thank you for requesting to upgrade your WEBKNOSSOS plan with more storage. Our sales team will be in contact with you shortly with a formal offer.</p>
  
<p>Requested additional storage: """),_display_(/*7.35*/{requestedStorage}),format.raw/*7.53*/("""TB</p>

<p>With best regards,<br />the WEBKNOSSOS team</p>
""")))}))
      }
    }
  }

  def render(name:String,requestedStorage:Int): play.twirl.api.HtmlFormat.Appendable = apply(name,requestedStorage)

  def f:((String,Int) => play.twirl.api.HtmlFormat.Appendable) = (name,requestedStorage) => apply(name,requestedStorage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/upgradePricingPlanStorage.scala.html
                  HASH: 571dae8df9ac4455ce4384e8ccb16b3a6eaf2cba
                  MATRIX: 758->1|889->39|916->41|943->60|982->62|1009->63|1041->70|1067->76|1290->273|1328->291
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|31->7|31->7
                  -- GENERATED --
              */
          