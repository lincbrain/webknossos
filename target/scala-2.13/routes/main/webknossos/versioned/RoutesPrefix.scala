// @GENERATOR:play-routes-compiler
// @SOURCE:conf/webknossos.versioned.routes


package webknossos.versioned {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
