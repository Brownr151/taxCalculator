
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object errorpage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(finalamount: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/main("Results page")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
"""),_display_(/*5.2*/defining(play.core.PlayVersion.current)/*5.41*/ { version =>_display_(Seq[Any](format.raw/*5.54*/("""

"""),format.raw/*7.1*/("""<section id="content">
"""),_display_(/*8.2*/finalamount),format.raw/*8.13*/("""
"""),format.raw/*9.1*/("""</section>
""")))}),format.raw/*10.2*/("""
""")))}))
      }
    }
  }

  def render(finalamount:String): play.twirl.api.HtmlFormat.Appendable = apply(finalamount)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (finalamount) => apply(finalamount)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-26T15:34:15.708570
                  SOURCE: /home/rob/Documents/tax-calculator-project/Java-calc-2/calculator_rob-master/app/views/errorpage.scala.html
                  HASH: 953294e26635b6e62b296e114a0354db58bd368c
                  MATRIX: 952->1|1067->23|1095->26|1123->46|1162->48|1189->50|1236->89|1286->102|1314->104|1363->128|1394->139|1421->140|1463->152
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|38->7|39->8|39->8|40->9|41->10
                  -- GENERATED --
              */
          