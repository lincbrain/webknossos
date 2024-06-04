
package views.html

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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[utils.WkConf,String,Option[String],Option[String],Option[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/( conf: utils.WkConf, selectedTheme: String, openGraphTitle: Option[String], openGraphDescription:
Option[String], openGraphImage: Option[String] ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />
    <meta name="commit-hash" content=""""),_display_(/*7.40*/(webknossos.BuildInfo.commitHash)),format.raw/*7.73*/("""" />
    <meta name="selected-theme" content=""""),_display_(/*8.43*/(selectedTheme)),format.raw/*8.58*/("""" />
    """),_display_(if(conf.GoogleAnalytics.trackingId.nonEmpty)/*9.50*/ {_display_(Seq[Any](format.raw/*9.52*/("""
    """),format.raw/*10.5*/("""<meta name="google-analytics-tracking-id" content=""""),_display_(/*10.57*/(conf.GoogleAnalytics.trackingId)),format.raw/*10.90*/("""" />
    """)))} else {null} ),format.raw/*11.6*/("""
    """),format.raw/*12.5*/("""<title>"""),_display_(/*12.13*/(conf.WebKnossos.tabTitle)),format.raw/*12.39*/("""</title>
    """),_display_(/*13.6*/openGraphTitle/*13.20*/.map/*13.24*/ { ogt =>_display_(Seq[Any](format.raw/*13.33*/("""
    """),format.raw/*14.5*/("""<meta property="og:title" content=""""),_display_(/*14.41*/ogt),format.raw/*14.44*/("""" />
    """)))}),format.raw/*15.6*/(""" """),_display_(/*15.8*/openGraphDescription/*15.28*/.map/*15.32*/ { ogd =>_display_(Seq[Any](format.raw/*15.41*/("""
    """),format.raw/*16.5*/("""<meta property="og:description" content=""""),_display_(/*16.47*/ogd),format.raw/*16.50*/("""" />
    """)))}),format.raw/*17.6*/(""" """),_display_(/*17.8*/openGraphImage/*17.22*/.map/*17.26*/ { ogi =>_display_(Seq[Any](format.raw/*17.35*/("""
    """),format.raw/*18.5*/("""<meta property="og:image" content=""""),_display_(/*18.41*/ogi),format.raw/*18.44*/("""" />
    """)))}),format.raw/*19.6*/(""" """),_display_(if(conf.Features.isWkorgInstance)/*19.41*/{_display_(Seq[Any](format.raw/*19.42*/("""
    """),format.raw/*20.5*/("""<meta
      name="description"
      content="Annotate and explore large 3D datasets with WEBKNOSSOS. Fast neurite skeletonization. 3D voxel painting. Collaboration, sharing and crowdsourcing."
    />
    <meta
      name="keywords"
      content="connectomics, data annotation, image segmentation, electron microscopy, light microscopy, fluorescence microscopy, skeletonization, webknossos"
    />
    """)))}else/*28.12*/{_display_(Seq[Any](format.raw/*28.13*/("""
    """),format.raw/*29.5*/("""<meta name="robot" content="noindex" />
    """)))}),format.raw/*30.6*/("""
    """),format.raw/*31.5*/("""<link rel="shortcut icon" type="image/png" href="/assets/images/favicon.ico" />
    <link
      rel="stylesheet"
      type="text/css"
      media="screen"
      href="/assets/bundle/vendors~main.css?nocache="""),_display_(/*36.54*/(webknossos.BuildInfo.commitHash)),format.raw/*36.87*/(""""
    />
    <link
      rel="stylesheet"
      type="text/css"
      media="screen"
      href="/assets/bundle/main.css?nocache="""),_display_(/*42.46*/(webknossos.BuildInfo.commitHash)),format.raw/*42.79*/(""""
    />
    <script
      data-airbrake-project-id=""""),_display_(/*45.34*/(conf.Airbrake.projectID)),format.raw/*45.59*/(""""
      data-airbrake-project-key=""""),_display_(/*46.35*/(conf.Airbrake.projectKey)),format.raw/*46.61*/(""""
      data-airbrake-environment-name=""""),_display_(/*47.40*/(conf.Airbrake.environment)),format.raw/*47.67*/(""""
    ></script>
    <script src="/assets/bundle/vendors~main.js?nocache="""),_display_(/*49.58*/(webknossos.BuildInfo.commitHash)),format.raw/*49.91*/(""""></script>
    <script src="/assets/bundle/main.js?nocache="""),_display_(/*50.50*/(webknossos.BuildInfo.commitHash)),format.raw/*50.83*/(""""></script>
    <script type="text/javascript" src="https://app.olvy.co/script.js" defer="defer"></script>
  </head>
  <body>
    <main id="main-container"></main>

    """),_display_(if(conf.GoogleAnalytics.trackingId.nonEmpty)/*56.50*/ {_display_(Seq[Any](format.raw/*56.52*/("""
    """),format.raw/*57.5*/("""<script
      async
      src="https://www.googletagmanager.com/gtag/js?id="""),_display_(/*59.57*/(conf.GoogleAnalytics.trackingId)),format.raw/*59.90*/(""""
    ></script>
    <script>
      const metaElement = document.querySelector("meta[name='google-analytics-tracking-id']");
      const googleAnalyticsTrackingId = metaElement ? metaElement.getAttribute("content") : null;
      window.dataLayer = window.dataLayer || [];
      function gtag() """),format.raw/*65.23*/("""{"""),format.raw/*65.24*/("""
        """),format.raw/*66.9*/("""dataLayer.push(arguments);
      """),format.raw/*67.7*/("""}"""),format.raw/*67.8*/("""
      """),format.raw/*68.7*/("""gtag("js", new Date());
      gtag("config", googleAnalyticsTrackingId, """),format.raw/*69.49*/("""{"""),format.raw/*69.50*/("""
        """),format.raw/*70.9*/("""anonymize_ip: true,
        cookie_expires: 0,
      """),format.raw/*72.7*/("""}"""),format.raw/*72.8*/(""");
    </script>
    """)))} else {null} ),format.raw/*74.6*/("""
  """),format.raw/*75.3*/("""</body>
</html>
"""))
      }
    }
  }

  def render(conf:utils.WkConf,selectedTheme:String,openGraphTitle:Option[String],openGraphDescription:Option[String],openGraphImage:Option[String]): play.twirl.api.HtmlFormat.Appendable = apply(conf,selectedTheme,openGraphTitle,openGraphDescription,openGraphImage)

  def f:((utils.WkConf,String,Option[String],Option[String],Option[String]) => play.twirl.api.HtmlFormat.Appendable) = (conf,selectedTheme,openGraphTitle,openGraphDescription,openGraphImage) => apply(conf,selectedTheme,openGraphTitle,openGraphDescription,openGraphImage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 4041300c3c67cfd70d5f881c317d7a821381025d
                  MATRIX: 786->1|1027->149|1229->325|1282->358|1355->405|1390->420|1470->474|1509->476|1541->481|1620->533|1674->566|1727->576|1759->581|1794->589|1841->615|1881->629|1904->643|1917->647|1964->656|1996->661|2059->697|2083->700|2123->710|2151->712|2180->732|2193->736|2240->745|2272->750|2341->792|2365->795|2405->805|2433->807|2456->821|2469->825|2516->834|2548->839|2611->875|2635->878|2675->888|2737->923|2776->924|2808->929|3235->1339|3274->1340|3306->1345|3381->1390|3413->1395|3649->1604|3703->1637|3860->1767|3914->1800|3995->1854|4041->1879|4104->1915|4151->1941|4219->1982|4267->2009|4368->2083|4422->2116|4510->2177|4564->2210|4805->2424|4845->2426|4877->2431|4980->2507|5034->2540|5356->2834|5385->2835|5421->2844|5481->2877|5509->2878|5543->2885|5643->2957|5672->2958|5708->2967|5788->3020|5816->3021|5881->3043|5911->3046
                  LINES: 21->1|27->3|31->7|31->7|32->8|32->8|33->9|33->9|34->10|34->10|34->10|35->11|36->12|36->12|36->12|37->13|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|52->28|52->28|53->29|54->30|55->31|60->36|60->36|66->42|66->42|69->45|69->45|70->46|70->46|71->47|71->47|73->49|73->49|74->50|74->50|80->56|80->56|81->57|83->59|83->59|89->65|89->65|90->66|91->67|91->67|92->68|93->69|93->69|94->70|96->72|96->72|98->74|99->75
                  -- GENERATED --
              */
          