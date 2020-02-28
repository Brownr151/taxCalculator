// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rob/Documents/tax-calculator-project/Java-calc-2/calculator_rob-master/conf/routes
// @DATE:Fri Feb 28 09:10:55 GMT 2020


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
