
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

      <div class="govuk-form-group">
        <fieldset class="govuk-fieldset">
          <legend class="govuk-fieldset__legend govuk-fieldset__legend--l">
            <h1 class="govuk-fieldset__heading">
              Which tax year are you checking?
            </h1>
          </legend>
          <div class="govuk-radios">
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="taxyear" name="taxyear" type="radio" value="2015/2016">
              <label class="govuk-label govuk-radios__label" for="taxyear">
                2015/2016
              </label>
            </div>
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="taxyear" name="taxyear" type="radio" value="2016/2017">
              <label class="govuk-label govuk-radios__label" for="taxyear">
                2016/2017
              </label>
            </div>
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="taxyear" name="taxyear" type="radio" value="2017/2018">
              <label class="govuk-label govuk-radios__label" for="taxyear">
                2017/2018
              </label>
            </div>
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="taxyear" name="taxyear" type="radio" value="2018/2019">
              <label class="govuk-label govuk-radios__label" for="taxyear">
                2018/2019
              </label>
            </div>
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="taxyear" name="taxyear" type="radio" value="2019/2020">
              <label class="govuk-label govuk-radios__label" for="taxyear">
                2019/2020
              </label>
            </div>
          </div>
        </fieldset>
      </div>

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

      <div class="govuk-form-group">
        <label class="govuk-label" for="pretaxincome">
          Total earnings before tax taken off <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="pretaxincome" name="pretaxincome" type="number" value="80000">
      </div>

      <div class="govuk-form-group">
        <label class="govuk-label" for="pretaxincome">
          Other income <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="otherincome" name="otherincome" type="number" value="0">
      </div>

      <div class="govuk-form-group">
        <label class="govuk-label" for="taxpaidonearnings">
          Total tax paid on earnings <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="taxpaidonearnings" name="taxpaidonearnings" type="number">
      </div>

      <div class="govuk-form-group">
        <label class="govuk-label" for="interestonbank">
          Total interest paid on savings by UK bank or building society, after tax <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="interestonbank" name="interestonbank" type="number">
      </div>

      <div class="govuk-form-group">
        <label class="govuk-label" for="taxonbank">
          Total tax paid on UK bank or building society interest <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="taxonbank" name="taxonbank" type="number">
      </div>

      <div class="govuk-form-group">
        <label class="govuk-label" for="untaxedinterest">
          UK interest that has not been taxed <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="untaxedinterest" name="untaxedinterest" type="number">
      </div>

      <div class="govuk-form-group">
        <label class="govuk-label" for="giftaid">
          Gift Aid donations during year <span class="govuk-visually-hidden">line 1 of 2</span>
        </label>
        <input class="govuk-input" id="giftaid" name="giftaid" type="number">
      </div>

      <div class="govuk-form-group">
        <fieldset class="govuk-fieldset" aria-describedby="blindpersonallowance">
          <legend class="govuk-fieldset__legend govuk-fieldset__legend--l">
            <h1 class="govuk-fieldset__heading">
              Receiving blind person's allowance
            </h1>
          </legend>
          <div class="govuk-radios govuk-radios--inline">
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="blindperson" name="blindperson" type="radio" value="yes">
              <label class="govuk-label govuk-radios__label" for="blindperson">
                Yes
              </label>
            </div>
            <div class="govuk-radios__item">
              <input class="govuk-radios__input" id="notblind" name="notblind" type="radio" value="no">
              <label class="govuk-label govuk-radios__label" for="notblind">
                No
              </label>
            </div>
          </div>
        </fieldset>
      </div>




      <button class="govuk-button govuk-!-margin-right-1" data-module="govuk-button">
        Submit
      </button>
      <button class="govuk-button govuk-button--secondary" data-module="govuk-button">
        Reset
      </button>


    </fieldset>
  </form>
</section>
""")))}),format.raw/*176.2*/("""
""")))}),format.raw/*177.2*/("""
"""),format.raw/*178.1*/("""</body>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-12-06T12:17:06.530991
                  SOURCE: /home/rob/Documents/Java-calc-2/calculator_rob-master/app/views/index.scala.html
                  HASH: f2222e5fc19cb6b09fbc9e75505a431fa643de06
                  MATRIX: 941->1|1037->4|1065->7|1095->29|1134->31|1161->33|1208->72|1258->85|1285->86|8450->7220|8483->7222|8512->7223
                  LINES: 28->1|33->2|35->4|35->4|35->4|36->5|36->5|36->5|37->6|207->176|208->177|209->178
                  -- GENERATED --
              */
          