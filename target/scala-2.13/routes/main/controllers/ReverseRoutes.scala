// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rob/Documents/tax-calculator-project/Java-calc-2/calculator_rob-master/conf/routes
// @DATE:Fri Feb 28 09:10:55 GMT 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:12
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseCalculatorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def calculator(pretaxincome:Double, taxyear:String, wheredoyoulive:String, blindperson:String, interestpaidbybank:Double, taxonbank:Double, untaxedinterest:Double, giftaid:Double): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "calculator" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("pretaxincome", pretaxincome)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("taxyear", taxyear)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("wheredoyoulive", wheredoyoulive)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("blindperson", blindperson)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("interestpaidbybank", interestpaidbybank)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("taxonbank", taxonbank)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("untaxedinterest", untaxedinterest)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("giftaid", giftaid)))))
    }
  
  }


}
