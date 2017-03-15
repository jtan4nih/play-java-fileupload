
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/temp/play-java-fileupload/conf/routes
// @DATE:Wed Mar 15 18:41:26 SGT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
