
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html lang="en" class="govuk-template ">
​

<head>
  <meta charset="utf-8" />
  <title>"""),_display_(/*8.11*/title),format.raw/*8.16*/("""</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, viewport-fit=cover">
  <meta name="theme-color" content="#0b0c0c" />
  ​
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  ​
  <link rel="shortcut icon" sizes="16x16 32x32 48x48" href='"""),_display_(/*14.62*/routes/*14.68*/.Assets.versioned("images/favicon.ico")),format.raw/*14.107*/("""'
    type="image/x-icon" />
  <link rel="mask-icon" href='"""),_display_(/*16.32*/routes/*16.38*/.Assets.versioned("govuk-mask-icon.svg")),format.raw/*16.78*/("""' color="#0b0c0c">
  <link rel="apple-touch-icon" sizes="180x180" href='"""),_display_(/*17.55*/routes/*17.61*/.Assets.versioned("govuk-apple-touch-icon-180x180.png")),format.raw/*17.116*/("""'>
  <link rel="apple-touch-icon" sizes="167x167" href='"""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("govuk-apple-touch-icon-167x167.png")),format.raw/*18.116*/("""'>
  <link rel="apple-touch-icon" sizes="152x152" href='"""),_display_(/*19.55*/routes/*19.61*/.Assets.versioned("govuk-apple-touch-icon-152x152.png")),format.raw/*19.116*/("""'>
  <link rel="apple-touch-icon" href='"""),_display_(/*20.39*/routes/*20.45*/.Assets.versioned("govuk-apple-touch-icon.png")),format.raw/*20.92*/("""'>
  ​
  <!--[if !IE 8]><!-->
  <link href='"""),_display_(/*23.16*/routes/*23.22*/.Assets.versioned("stylesheets/govuk-frontend-3.3.0.min.css")),format.raw/*23.83*/("""' rel="stylesheet" />
  <!--<![endif]-->
  ​
  <!--[if IE 8]-->
    <link href="/govuk-frontend/all-ie8.css" rel="stylesheet" />
  <!--[endif]-->
  ​
  <!--[if lt IE 9]-->
    <script src="/html5-shiv/html5shiv.js"></script>
  <!--[endif]-->
  ​
  <meta property="og:image" content='"""),_display_(/*34.39*/routes/*34.45*/.Assets.versioned("govuk-opengraph-image.png")),format.raw/*34.91*/("""'>
</head>
​

<body class="govuk-template__body " style="margin: 20px; font-size: 80%>



  <header class="govuk-header " role="banner" data-module="govuk-header">
    <div class="govuk-header__container govuk-width-container">
      <div class="govuk-header__logo">
        <a href="#" class="govuk-header__link govuk-header__link--homepage">
          <span class="govuk-header__logotype">
            <svg role="presentation" focusable="false" class="govuk-header__logotype-crown"
              xmlns="http://www.w3.org/2000/svg" viewbox="0 0 132 97" height="30" width="36">
              <path fill="currentColor" fill-rule="evenodd"
                d="M25 30.2c3.5 1.5 7.7-.2 9.1-3.7 1.5-3.6-.2-7.8-3.9-9.2-3.6-1.4-7.6.3-9.1 3.9-1.4 3.5.3 7.5 3.9 9zM9 39.5c3.6 1.5 7.8-.2 9.2-3.7 1.5-3.6-.2-7.8-3.9-9.1-3.6-1.5-7.6.2-9.1 3.8-1.4 3.5.3 7.5 3.8 9zM4.4 57.2c3.5 1.5 7.7-.2 9.1-3.8 1.5-3.6-.2-7.7-3.9-9.1-3.5-1.5-7.6.3-9.1 3.8-1.4 3.5.3 7.6 3.9 9.1zm38.3-21.4c3.5 1.5 7.7-.2 9.1-3.8 1.5-3.6-.2-7.7-3.9-9.1-3.6-1.5-7.6.3-9.1 3.8-1.3 3.6.4 7.7 3.9 9.1zm64.4-5.6c-3.6 1.5-7.8-.2-9.1-3.7-1.5-3.6.2-7.8 3.8-9.2 3.6-1.4 7.7.3 9.2 3.9 1.3 3.5-.4 7.5-3.9 9zm15.9 9.3c-3.6 1.5-7.7-.2-9.1-3.7-1.5-3.6.2-7.8 3.7-9.1 3.6-1.5 7.7.2 9.2 3.8 1.5 3.5-.3 7.5-3.8 9zm4.7 17.7c-3.6 1.5-7.8-.2-9.2-3.8-1.5-3.6.2-7.7 3.9-9.1 3.6-1.5 7.7.3 9.2 3.8 1.3 3.5-.4 7.6-3.9 9.1zM89.3 35.8c-3.6 1.5-7.8-.2-9.2-3.8-1.4-3.6.2-7.7 3.9-9.1 3.6-1.5 7.7.3 9.2 3.8 1.4 3.6-.3 7.7-3.9 9.1zM69.7 17.7l8.9 4.7V9.3l-8.9 2.8c-.2-.3-.5-.6-.9-.9L72.4 0H59.6l3.5 11.2c-.3.3-.6.5-.9.9l-8.8-2.8v13.1l8.8-4.7c.3.3.6.7.9.9l-5 15.4v.1c-.2.8-.4 1.6-.4 2.4 0 4.1 3.1 7.5 7 8.1h.2c.3 0 .7.1 1 .1.4 0 .7 0 1-.1h.2c4-.6 7.1-4.1 7.1-8.1 0-.8-.1-1.7-.4-2.4V34l-5.1-15.4c.4-.2.7-.6 1-.9zM66 92.8c16.9 0 32.8 1.1 47.1 3.2 4-16.9 8.9-26.7 14-33.5l-9.6-3.4c1 4.9 1.1 7.2 0 10.2-1.5-1.4-3-4.3-4.2-8.7L108.6 76c2.8-2 5-3.2 7.5-3.3-4.4 9.4-10 11.9-13.6 11.2-4.3-.8-6.3-4.6-5.6-7.9 1-4.7 5.7-5.9 8-.5 4.3-8.7-3-11.4-7.6-8.8 7.1-7.2 7.9-13.5 2.1-21.1-8 6.1-8.1 12.3-4.5 20.8-4.7-5.4-12.1-2.5-9.5 6.2 3.4-5.2 7.9-2 7.2 3.1-.6 4.3-6.4 7.8-13.5 7.2-10.3-.9-10.9-8-11.2-13.8 2.5-.5 7.1 1.8 11 7.3L80.2 60c-4.1 4.4-8 5.3-12.3 5.4 1.4-4.4 8-11.6 8-11.6H55.5s6.4 7.2 7.9 11.6c-4.2-.1-8-1-12.3-5.4l1.4 16.4c3.9-5.5 8.5-7.7 10.9-7.3-.3 5.8-.9 12.8-11.1 13.8-7.2.6-12.9-2.9-13.5-7.2-.7-5 3.8-8.3 7.1-3.1 2.7-8.7-4.6-11.6-9.4-6.2 3.7-8.5 3.6-14.7-4.6-20.8-5.8 7.6-5 13.9 2.2 21.1-4.7-2.6-11.9.1-7.7 8.8 2.3-5.5 7.1-4.2 8.1.5.7 3.3-1.3 7.1-5.7 7.9-3.5.7-9-1.8-13.5-11.2 2.5.1 4.7 1.3 7.5 3.3l-4.7-15.4c-1.2 4.4-2.7 7.2-4.3 8.7-1.1-3-.9-5.3 0-10.2l-9.5 3.4c5 6.9 9.9 16.7 14 33.5 14.8-2.1 30.8-3.2 47.7-3.2z">
              </path>
              <image src="/assets/images/govuk-logotype-crown.png" xlink:href=""
                class="govuk-header__logotype-crown-fallback-image" width="36" height="32"></image>
            </svg>
            <span class="govuk-header__logotype-text">
              GOV.UK
            </span>
          </span>
        </a>
      </div>
      <div class="govuk-header__content">
        <a href="#" class="govuk-header__link govuk-header__link--service-name">
          Tax Checker
        </a>
        <button type="button" class="govuk-header__menu-button govuk-js-header-toggle" aria-controls="navigation"
          aria-label="Show or hide Top Level Navigation">Menu</button>
        <nav>
          <ul id="navigation" class="govuk-header__navigation " aria-label="Top Level Navigation">
            <li class="govuk-header__navigation-item govuk-header__navigation-item--active">
              <a class="govuk-header__link" href="#1">
                About us
              </a>
            </li>
            <li class="govuk-header__navigation-item">
              <a class="govuk-header__link" href="#2">
                Contact us
              </a>
            </li>
            <li class="govuk-header__navigation-item">
              <a class="govuk-header__link" href="#3">
                Online services
              </a>
            </li>
            <li class="govuk-header__navigation-item">
              <a class="govuk-header__link" href="#4">
                Site map
              </a>
            </li>
            <li class="govuk-header__navigation-item">
              <a class="govuk-header__link" href="#4">
                Help
              </a>
            </li>
            <li class="govuk-header__navigation-item">
              <a class="govuk-header__link" href="#4">
                Practitioner Zone
              </a>
            </li>
          </ul>
        </nav>
      </div>
    </div>
  </header>

  <!--Main Content goes here-->
  """),_display_(/*106.4*/content),format.raw/*106.11*/("""


  """),format.raw/*109.3*/("""<footer class="govuk-footer " role="contentinfo">
    <div class="govuk-width-container ">
      <div class="govuk-footer__meta">
        <div class="govuk-footer__meta-item govuk-footer__meta-item--grow">

          <svg role="presentation" focusable="false" class="govuk-footer__licence-logo"
            xmlns="http://www.w3.org/2000/svg" viewbox="0 0 483.2 195.7" height="17" width="41">
            <path fill="currentColor"
              d="M421.5 142.8V.1l-50.7 32.3v161.1h112.4v-50.7zm-122.3-9.6A47.12 47.12 0 0 1 221 97.8c0-26 21.1-47.1 47.1-47.1 16.7 0 31.4 8.7 39.7 21.8l42.7-27.2A97.63 97.63 0 0 0 268.1 0c-36.5 0-68.3 20.1-85.1 49.7A98 98 0 0 0 97.8 0C43.9 0 0 43.9 0 97.8s43.9 97.8 97.8 97.8c36.5 0 68.3-20.1 85.1-49.7a97.76 97.76 0 0 0 149.6 25.4l19.4 22.2h3v-87.8h-80l24.3 27.5zM97.8 145c-26 0-47.1-21.1-47.1-47.1s21.1-47.1 47.1-47.1 47.2 21 47.2 47S123.8 145 97.8 145" />
          </svg>
          <span class="govuk-footer__licence-description">
            All content is available under the
            <a class="govuk-footer__link"
              href="https://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/" rel="license">Open
              Government Licence v3.0</a>, except where otherwise stated
          </span>
        </div>
        <div class="govuk-footer__meta-item">
          <a class="govuk-footer__link govuk-footer__copyright-logo"
            href="https://www.nationalarchives.gov.uk/information-management/re-using-public-sector-information/uk-government-licensing-framework/crown-copyright/">©
            Crown copyright</a>
        </div>
      </div>
    </div>
  </footer>
  ​

  ​

</body>
​

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-26T15:34:15.691166
                  SOURCE: /home/rob/Documents/tax-calculator-project/Java-calc-2/calculator_rob-master/app/views/main.scala.html
                  HASH: 9c49d2002c1db171ee250f5477aff219383347c6
                  MATRIX: 952->1|1076->32|1103->33|1217->121|1242->126|1544->401|1559->407|1620->446|1707->506|1722->512|1783->552|1883->625|1898->631|1975->686|2059->743|2074->749|2151->804|2235->861|2250->867|2327->922|2395->963|2410->969|2478->1016|2550->1061|2565->1067|2647->1128|2958->1412|2973->1418|3040->1464|7704->6101|7733->6108|7766->6113
                  LINES: 28->1|33->2|34->3|39->8|39->8|45->14|45->14|45->14|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->23|54->23|54->23|65->34|65->34|65->34|137->106|137->106|140->109
                  -- GENERATED --
              */
          