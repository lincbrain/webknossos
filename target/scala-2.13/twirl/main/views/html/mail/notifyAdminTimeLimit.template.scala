
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

object notifyAdminTimeLimit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userName: String, projectName: String, taskId: String, annotationId: String, uri: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/emailBaseTemplate()/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
  """),format.raw/*4.3*/("""<p>Hi,</p>
  
  <p>
    We noticed a user reached the time limit for a project:
  </p>

  <p>
    <ul>
      <li>User: """),_display_(/*12.18*/{userName}),format.raw/*12.28*/("""</li>
      <li>Project: """),_display_(/*13.21*/{projectName}),format.raw/*13.34*/("""</li>
      <li>Task: """),_display_(/*14.18*/{taskId}),format.raw/*14.26*/("""</li>
    </ul>
    
  </p>
  <p>For more information visit <a href=""""),_display_(/*18.43*/{uri}),format.raw/*18.48*/("""/annotations/Task/"""),_display_(/*18.67*/{annotationId}),format.raw/*18.81*/("""">"""),_display_(/*18.84*/{uri}),format.raw/*18.89*/("""/annotations/Task/"""),_display_(/*18.108*/{annotationId}),format.raw/*18.122*/("""</a></p>

  <p>With best regards,<br />your WEBKNOSSOS team</p>
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(userName:String,projectName:String,taskId:String,annotationId:String,uri:String): play.twirl.api.HtmlFormat.Appendable = apply(userName,projectName,taskId,annotationId,uri)

  def f:((String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (userName,projectName,taskId,annotationId,uri) => apply(userName,projectName,taskId,annotationId,uri)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/mail/notifyAdminTimeLimit.scala.html
                  HASH: 9f4d64e8f317729201bbd82d807bb3c12a517e86
                  MATRIX: 777->1|961->92|988->94|1015->113|1054->115|1083->118|1230->238|1261->248|1314->274|1348->287|1398->310|1427->318|1524->388|1550->393|1596->412|1631->426|1661->429|1687->434|1734->453|1770->467|1865->532
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|36->12|36->12|37->13|37->13|38->14|38->14|42->18|42->18|42->18|42->18|42->18|42->18|42->18|42->18|45->21
                  -- GENERATED --
              */
          