// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rob/Documents/Java-calc-2/calculator_rob-master/conf/routes
// @DATE:Tue Dec 10 09:44:32 GMT 2019

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

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseRobController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def rob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RobController.rob",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rob"})
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
        function(pretaxincome0,taxyear1,wheredoyoulive2,blindperson3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "calculator" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("pretaxincome", pretaxincome0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("taxyear", taxyear1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("wheredoyoulive", wheredoyoulive2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("blindperson", blindperson3)])})
        }
      """
    )
  
  }


}
