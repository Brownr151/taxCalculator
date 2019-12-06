package controllers;

import play.mvc.*;

public class MainController extends Controller{

    int MAXFORCALCULATOR = 99999;
    int MINFORCALCULATOR = 1;
    double pretaxincome = 80000;

    public Result calculator(double pretaxincome,
                             int taxyear,
                             int country,
                             double taxpaidonearnings,
                             double interestpaidonsavings,
                             double taxpaidbankinterest,
                             double untaxedinterest,
                             double paidgiftaid,
                             boolean blind){
        //if (country  )
        //double finalamount = ((pretaxincome + otherincome) *.2);
        //return ok(views.html.resultspage.render(finalamount));
        return ok("DUMMY RETURN");
    }
}