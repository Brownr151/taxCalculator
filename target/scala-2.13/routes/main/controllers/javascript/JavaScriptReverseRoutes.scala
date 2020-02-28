// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rob/Documents/tax-calculator-project/Java-calc-2/calculator_rob-master/conf/routes
// @DATE:Fri Feb 28 09:10:55 GMT 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseCalculatorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def calculator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalculatorController.calculator",
      """
        function(pretaxincome0,taxyear1,wheredoyoulive2,blindperson3,interestpaidbybank4,taxonbank5,untaxedinterest6,giftaid7) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calculator" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("pretaxincome", pretaxincome0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("taxyear", taxyear1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("wheredoyoulive", wheredoyoulive2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("blindperson", blindperson3), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("interestpaidbybank", interestpaidbybank4), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("taxonbank", taxonbank5), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("untaxedinterest", untaxedinterest6), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("giftaid", giftaid7)])})
        }
      """
    )
  
  }


}
