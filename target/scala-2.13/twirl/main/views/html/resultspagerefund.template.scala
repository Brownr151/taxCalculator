
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

object resultspagerefund extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(finalamount: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/main("Results page")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
"""),_display_(/*5.2*/defining(play.core.PlayVersion.current)/*5.41*/ { version =>_display_(Seq[Any](format.raw/*5.54*/("""

"""),format.raw/*7.1*/("""<section id="content">

"""),_display_(/*9.2*/finalamount),format.raw/*9.13*/("""
"""),format.raw/*10.1*/("""</section>
""")))}),format.raw/*11.2*/("""
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
                  DATE: 2020-02-26T16:14:08.158136
                  SOURCE: /home/rob/Documents/tax-calculator-project/Java-calc-2/calculator_rob-master/app/views/resultspagerefund.scala.html
                  HASH: 08e6cdf373b15d045e6311f909b34d7fde91efe5
                  MATRIX: 960->1|1075->23|1103->26|1131->46|1170->48|1197->50|1244->89|1294->102|1322->104|1372->129|1403->140|1431->141|1473->153
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|38->7|40->9|40->9|41->10|42->11
                  -- GENERATED --
              */
          