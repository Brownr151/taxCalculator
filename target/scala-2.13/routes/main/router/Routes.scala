// @GENERATOR:play-routes-compiler
// @SOURCE:/home/rob/Documents/Java-calc-2/calculator_rob-master/conf/routes
// @DATE:Tue Dec 10 09:44:32 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:7
  CalculatorController_0: controllers.CalculatorController,
  // @LINE:8
  RobController_2: controllers.RobController,
  // @LINE:16
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:7
    CalculatorController_0: controllers.CalculatorController,
    // @LINE:8
    RobController_2: controllers.RobController,
    // @LINE:16
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_3, CalculatorController_0, RobController_2, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, CalculatorController_0, RobController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """calculator""", """controllers.CalculatorController.calculator(pretaxincome:Double, taxyear:String, wheredoyoulive:String, blindperson:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rob""", """controllers.RobController.rob"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_CalculatorController_calculator1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("calculator")))
  )
  private[this] lazy val controllers_CalculatorController_calculator1_invoker = createInvoker(
    CalculatorController_0.calculator(fakeValue[Double], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "calculator",
      Seq(classOf[Double], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """calculator""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_RobController_rob2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rob")))
  )
  private[this] lazy val controllers_RobController_rob2_invoker = createInvoker(
    RobController_2.rob,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RobController",
      "rob",
      Nil,
      "GET",
      this.prefix + """rob""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:7
    case controllers_CalculatorController_calculator1_route(params@_) =>
      call(params.fromQuery[Double]("pretaxincome", None), params.fromQuery[String]("taxyear", None), params.fromQuery[String]("wheredoyoulive", None), params.fromQuery[String]("blindperson", None)) { (pretaxincome, taxyear, wheredoyoulive, blindperson) =>
        controllers_CalculatorController_calculator1_invoker.call(CalculatorController_0.calculator(pretaxincome, taxyear, wheredoyoulive, blindperson))
      }
  
    // @LINE:8
    case controllers_RobController_rob2_route(params@_) =>
      call { 
        controllers_RobController_rob2_invoker.call(RobController_2.rob)
      }
  
    // @LINE:16
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
