
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

object emailBaseTemplate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<html>

<body>
  <style type="text/css">
    body,
    p,
    li,
    h2 """),format.raw/*9.8*/("""{"""),format.raw/*9.9*/("""
      """),format.raw/*10.7*/("""font-family: "Monospaced Number", -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto,
        "PingFang SC", "Hiragino Sans GB", "Microsoft YaHei", "Helvetica Neue", Helvetica, Arial,
        sans-serif;
      font-size: 14px;
      line-height: 1.5;
    """),format.raw/*15.5*/("""}"""),format.raw/*15.6*/("""
  """),format.raw/*16.3*/("""</style>
  <div style="margin-left: auto; margin-right: auto; max-width: 600px;">
    <p>
      <a href="https://webknossos.org"><img src="https://static.webknossos.org/mails/email-header.600.png"
          alt="WEBKNOSSOS" style="width: 100%; max-width: 600px;" /></a>
    </p>

    """),_display_(/*23.6*/content),format.raw/*23.13*/("""

    """),format.raw/*25.5*/("""<p style="text-align: center; padding-top: 30px;">
      <a href="https://webknossos.org"><img src="https://static.webknossos.org/mails/icon-webknossos.png"
          alt="WEBKNOSSOS" style="width: 50px; height: 50px;" /></a>
      &nbsp;
      <a href="https://docs.webknossos.org"><img src="https://static.webknossos.org/mails/icon-docs.png"
          alt="Documentation" style="width: 50px; height: 50px;" /></a>
      &nbsp;
      <a href="https://www.youtube.com/channel/UCVQqjQ50lJORCZuLxnEE-tA"><img
          src="https://static.webknossos.org/mails/icon-video.png" alt="YouTube Channel"
          style="width: 50px; height: 50px;" /></a>
      &nbsp;
      <a href="https://twitter.com/webknossos"><img src="https://static.webknossos.org/mails/icon-twitter.png"
          alt="Twitter Channel" style="width: 50px; height: 50px;" /></a>
    </p>

    <div style="height: 60px;">&nbsp;</div>
    <p style="color: #888; font-size: 0.6rem;">
      You are receiving this email because you signed up for an account on WEBKNOSSOS. You may
      cancel your account at any time.
    </p>
    <p style="color: #888; font-size: 0.6rem;">
      <a href="https://webknossos.org" style="color: #888;">webknossos.org</a> is a service by
      <a href="https://scalableminds.com">scalable minds</a> &bull; <a href="mailto:hello@webknossos.org" style="color: #888;">hello@webknossos.org</a>
    </p>
    <div style="height: 60px;">&nbsp;</div>
  </div>
</body>

</html>"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply()(content)

  def f:(() => (Html) => play.twirl.api.HtmlFormat.Appendable) = () => (content) => apply()(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/emailBaseTemplate.scala.html
                  HASH: 4af58861e027ecea39e17e338d54eaa6fea5ee89
                  MATRIX: 744->1|854->18|953->91|980->92|1014->99|1299->357|1327->358|1357->361|1668->646|1696->653|1729->659
                  LINES: 21->1|26->2|33->9|33->9|34->10|39->15|39->15|40->16|47->23|47->23|49->25
                  -- GENERATED --
              */
          