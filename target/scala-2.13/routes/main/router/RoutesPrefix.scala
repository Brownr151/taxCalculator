// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rob/Documents/Java-calc-2/calculator_rob-master/conf/routes
// @DATE:Fri Dec 06 12:18:53 GMT 2019


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
