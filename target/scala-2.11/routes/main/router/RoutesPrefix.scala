
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Asus/lightbend/play-java-fileupload/conf/routes
// @DATE:Mon Mar 06 22:25:27 SGT 2017


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
