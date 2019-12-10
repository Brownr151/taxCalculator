
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/main("Tax calculator")/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
"""),_display_(/*5.2*/defining(play.core.PlayVersion.current)/*5.41*/ { version =>_display_(Seq[Any](format.raw/*5.54*/("""
"""),format.raw/*6.1*/("""<body>
<section id="content">
  <form action="/calculator" method="GET">
    <fieldset class="govuk-fieldset">
      <legend class="govuk-fieldset__legend govuk-fieldset__legend--xl">
        <h1 class="govuk-fieldset__heading">
          Income tax calculator

        </h1>
      </legend>
// Tax year radio
      <div class="govuk-form-group">
        <fieldset class="govuk-fieldset">
          <legend class="govuk-fieldset__legend govuk-fieldset__legend--l">
            <h1 class="govuk-fieldset__heading">
              Which tax year are you checking?
            </h1>
          </legend>
          <div class="govuk-radios">
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="taxyear0" name="taxyear" type="radio" value="2015/2016">
              <label class="govuk-label govuk-radios__label" for="taxyear0">
                2015/2016
              </label>
            </div>
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="taxyear1" name="taxyear" type="radio" value="2016/2017">
              <label class="govuk-label govuk-radios__label" for="taxyear1">
                2016/2017
              </label>
            </div>
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="taxyear2" name="taxyear" type="radio" value="2017/2018">
              <label class="govuk-label govuk-radios__label" for="taxyear2">
                2017/2018
              </label>
            </div>
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="taxyear3" name="taxyear" type="radio" value="2018/2019">
              <label class="govuk-label govuk-radios__label" for="taxyear3">
                2018/2019
              </label>
            </div>
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="taxyear4" name="taxyear" type="radio" value="2019/2020">
              <label class="govuk-label govuk-radios__label" for="taxyear4">
                2019/2020
              </label>
            </div>
          </div>
        </fieldset>
      </div>
//country radio
      <div class="govuk-form-group">
            <fieldset class="govuk-fieldset">
              <legend class="govuk-fieldset__legend govuk-fieldset__legend--l">
                <h1 class="govuk-fieldset__heading">
                  In which country do you pay your tax?
                </h1>
              </legend>
              <div class="govuk-radios">
                <div class="govuk-radios__item">
                  <input class="govuk-radios__input" id="wheredoyoulive" name="wheredoyoulive" type="radio" value="england">
                  <label class="govuk-label govuk-radios__label" for="wheredoyoulive">
                    England
                  </label>
                </div>
                <div class="govuk-radios__item">
                  <input class="govuk-radios__input" id="wheredoyoulive2" name="wheredoyoulive" type="radio" value="scotland">
                  <label class="govuk-label govuk-radios__label" for="wheredoyoulive2">
                    Scotland
                  </label>
                </div>
                <div class="govuk-radios__item">
                  <input class="govuk-radios__input" id="wheredoyoulive3" name="wheredoyoulive" type="radio" value="wales">
                  <label class="govuk-label govuk-radios__label" for="wheredoyoulive3">
                    Wales
                  </label>
                </div>
              </div>
            </fieldset>
          </div>
// total earnings input
      <div class="govuk-form-group">
        <label class="govuk-label" for="pretaxincome">
          Total earnings before tax taken off <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="pretaxincome" name="pretaxincome" type="number" value="80000">
      </div>
// tax paid on earnings input
      <div class="govuk-form-group">
        <label class="govuk-label" for="taxpaidonearnings">
          Total tax paid on earnings <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="taxpaidonearnings" name="taxpaidonearnings" type="number">
      </div>
// interest paid on savings input
      <div class="govuk-form-group">
        <label class="govuk-label" for="interestonbank">
          Total interest paid on savings by UK bank or building society, after tax <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="interestonbank" name="interestonbank" type="number">
      </div>
// tax paid on bank input
      <div class="govuk-form-group">
        <label class="govuk-label" for="taxonbank">
          Total tax paid on UK bank or building society interest <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="taxonbank" name="taxonbank" type="number">
      </div>
// interest not taxed input
      <div class="govuk-form-group">
        <label class="govuk-label" for="untaxedinterest">
          UK interest that has not been taxed <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="untaxedinterest" name="untaxedinterest" type="number">
      </div>
// gift aid donations input
      <div class="govuk-form-group">
        <label class="govuk-label" for="giftaid">
          Gift Aid donations during year <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="giftaid" name="giftaid" type="number">
      </div>
// blind person radio
      <div class="govuk-form-group">
        <fieldset class="govuk-fieldset" aria-describedby="bpa">
          <legend class="govuk-fieldset__legend govuk-fieldset__legend--l">
            <h1 class="govuk-fieldset__heading">
              Are you eligible for Blind Persons Allowance?
            </h1>
          </legend>
          <div class="govuk-radios govuk-radios--inline">
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="blind-yes" name="blindperson" type="radio" value="yes">
              <label class="govuk-label govuk-radios__label" for="blind-yes">
                Yes
              </label>
            </div>
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="blind-no" name="blindperson" type="radio" value="no">
              <label class="govuk-label govuk-radios__label" for="blind-no">
                No
              </label>
            </div>
          </div>
        </fieldset>
      </div>
// submit and reset buttons
      <button class="govuk-button govuk-!-margin-right-1" data-module="govuk-button">
        Submit
      </button>
      <button class="govuk-button govuk-button--secondary" data-module="govuk-button">
        Reset
      </button>


    </fieldset>
  </form>
</section>
""")))}),format.raw/*166.2*/("""
""")))}),format.raw/*167.2*/("""
"""),format.raw/*168.1*/("""</body>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-10T09:59:32.445351
                  SOURCE: /home/rob/Documents/Java-calc-2/calculator_rob-master/app/views/index.scala.html
                  HASH: e3807c47fe9dc1090f126edd018b7ecc5fb51ebb
                  MATRIX: 941->1|1037->4|1065->7|1095->29|1134->31|1161->33|1208->72|1258->85|1285->86|8397->7167|8430->7169|8459->7170
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|37->6|197->166|198->167|199->168
                  -- GENERATED --
              */
          