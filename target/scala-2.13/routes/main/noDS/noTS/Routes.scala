// @GENERATOR:play-routes-compiler
// @SOURCE:conf/noDS.noTS.routes

package noDS.noTS

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  webknossos_versioned_Routes_0: webknossos.versioned.Routes,
  // @LINE:3
  Application_0: controllers.Application,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    webknossos_versioned_Routes_0: webknossos.versioned.Routes,
    // @LINE:3
    Application_0: controllers.Application
  ) = this(errorHandler, webknossos_versioned_Routes_0, Application_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    noDS.noTS.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, webknossos_versioned_Routes_0, Application_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_webknossos_versioned_Routes_0_0.router.documentation,
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """.well-known/security.txt""", """controllers.Application.getSecurityTxt"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:1
  private[this] val prefixed_webknossos_versioned_Routes_0_0 = Include(webknossos_versioned_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "api/"))

  // @LINE:3
  private[this] lazy val controllers_Application_getSecurityTxt1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart(".well-known/security.txt")))
  )
  private[this] lazy val controllers_Application_getSecurityTxt1_invoker = createInvoker(
    Application_0.getSecurityTxt,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "noDS.noTS",
      "controllers.Application",
      "getSecurityTxt",
      Nil,
      "GET",
      this.prefix + """.well-known/security.txt""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case prefixed_webknossos_versioned_Routes_0_0(handler) => handler
  
    // @LINE:3
    case controllers_Application_getSecurityTxt1_route(params@_) =>
      call { 
        controllers_Application_getSecurityTxt1_invoker.call(Application_0.getSecurityTxt)
      }
  }
}
