package controllers;

import play.mvc.*;

public class CalculatorController extends Controller {
    public Result calculator(double pretaxincome, double otherincome, String taxyear,
    String wheredoyoulive, double blindpersonallowance) {

        int txyr = 0;
        double MINFORCALCULATOR = 0;
        double MAXFORCALCULATOR = 99999;
        int SCOTTISHOWNTAX = 1;
        int WELSHOWNTAX = 4;
        double afterTax = 0.0;


        if (taxyear == "2015/2016") {
            txyr = 1;
        } else if (taxyear == "2016/2017") {
            txyr = 2;
        } else if (taxyear == "2017/2018") {
            txyr = 3;
        } else if (taxyear == "2018/2019") {
            txyr = 4;
        } else if (taxyear == "2019/2020") {
            txyr = 5;
        }
        while (pretaxincome <= MINFORCALCULATOR || pretaxincome > MAXFORCALCULATOR) {
            return ok(views.html.errorpage.render("Your total earnings before tax must be between £0 and £99999"));
        }
        if (wheredoyoulive == "Scotland" && txyr > SCOTTISHOWNTAX){
            scottishTaxPayer scotTax = new scottishTaxPayer();
            afterTax = scotTax.CalcScotAfterTaxIncome(pretaxincome, txyr, blindpersonallowance);
        } else if (wheredoyoulive == "Wales" && txyr > WELSHOWNTAX){
            welshTaxpayer welshTax = new welshTaxpayer();
            afterTax = welshTax.calcWelshAfterTaxIncome(pretaxincome,  txyr, blindpersonallowance);
        }else {

        }
    







        return ok(views.html.resultspage.render(afterTax));
    }
}