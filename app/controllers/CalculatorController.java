package controllers;

import play.mvc.*;
import views.html.errorpage;
import views.html.resultspage;

public class CalculatorController extends Controller {
    public CalculatorController() {
    }

    public Result calculator(double pretaxincome, String taxyear, String wheredoyoulive, String blindperson, double interestpaidbybank, double taxonbank, double untaxedinterest, double giftaid) {

        double MINFORCALCULATOR = 0.0D;
        double MAXFORCALCULATOR = 99999.0D;
        int SCOTTISHOWNTAX = 3;
        int WELSHOWNTAX = 4;
        double taxDue = 0.0D;
        double GIFTAIDPERCENTAGEONE = 1.25D;
        double GIFTAIDPERCENTAGETWO = 0.25D;
        boolean blindpersonboolean;
        if (blindperson.strip().equals("yes")) {
            blindpersonboolean = true;
        } else {
            blindpersonboolean = false;
        }

        if (taxonbank > interestpaidbybank) {
            return ok(errorpage.render("Your 'Total tax paid on UK bank or building society interest' cannot exceed your 'Total interest paid on savings by UK bank or building society, after tax'."));
        } else {
            int txyr;
            if (taxyear.strip().equals("2015/2016")) {
                txyr = 0;
            } else if (taxyear.strip().equals("2016/2017")) {
                txyr = 1;
            } else if (taxyear.strip().equals("2017/2018")) {
                txyr = 2;
            } else if (taxyear.strip().equals("2018/2019")) {
                txyr = 3;
            } else if (taxyear.strip().equals("2019/2020")) {
                txyr = 4;
            } else {
                txyr = 4;
            }

            if (pretaxincome >= MINFORCALCULATOR && pretaxincome <= MAXFORCALCULATOR) {
                pretaxincome = pretaxincome + interestpaidbybank + untaxedinterest;
                if (wheredoyoulive.strip().equals("Scotland") && txyr >= SCOTTISHOWNTAX) {
                    scottishTaxPayer scotTax = new scottishTaxPayer();
                    taxDue = scotTax.CalcScotAfterTaxIncome(pretaxincome, txyr, blindpersonboolean);
                } else if (wheredoyoulive.strip().equals("Wales") && txyr >= WELSHOWNTAX) {
                    welshTaxpayer welshTax = new welshTaxpayer();
                    taxDue = welshTax.calcWelshAfterTaxIncome(pretaxincome, txyr, blindpersonboolean);
                } else {
                    englishTaxPayer englishTax = new englishTaxPayer();
                    taxDue = englishTax.calcEnglishAfterTaxIncome(pretaxincome, txyr, blindpersonboolean);
                }

                return ok(resultspage.render(Double.toString(taxDue)));
            } else {
                return ok(errorpage.render("Your total earnings before tax must be between £0 and £99999"));
            }
        }
    }
}