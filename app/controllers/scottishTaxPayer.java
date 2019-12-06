package com.robert;

public class scottishTaxPayer {


    //Class Public Method
    public double CalcScotAfterTaxIncome(double income, int taxYear, boolean isBlind) {
        double taxDue = 0.0;
        double personalTaxAllowance = params.scottishTaxBands[1][taxYear];
        double STARTERRATENINETEENPERCENT = 0.19;
        double BASICRATETWENTYPERCENT = 0.2;
        double INTERMEDIATERATETWENTYONE = 0.21;
        double HIGHERRATEFORTYONEPERCENT = 0.41;
        double taxForIntermediateBand = params.scottishTaxSteps[0][taxYear] + params.scottishTaxSteps[1][taxYear];
        double taxForHigherBand = taxForIntermediateBand + params.scottishTaxSteps[2][taxYear];

        if (isBlind == true) {
            if (income > params.scottishTaxBandsBlind[0][taxYear] && income <= params.scottishTaxBandsBlind[1][taxYear]) {
                taxDue = 0.0;
            } else if (income > params.scottishTaxBandsBlind[1][taxYear] && income <= params.scottishTaxBandsBlind[2][taxYear]) {
                taxDue = (income - params.scottishTaxBandsBlind[1][taxYear]) * STARTERRATENINETEENPERCENT;
            } else if (income > params.scottishTaxBandsBlind[2][taxYear] && income <= params.scottishTaxBandsBlind[3][taxYear]) {
                taxDue = ((income - params.scottishTaxBandsBlind[2][taxYear]) * BASICRATETWENTYPERCENT) + params.scottishTaxPlusBlindSteps[0][taxYear];
            } else if (income > params.scottishTaxBandsBlind[3][taxYear] && income <= params.scottishTaxBandsBlind[4][taxYear]) {
                taxDue = ((income - params.scottishTaxBandsBlind[3][taxYear]) * INTERMEDIATERATETWENTYONE)
                        +  params.scottishTaxPlusBlindSteps[1][taxYear];
            } else if (income > params.scottishTaxBandsBlind[4][taxYear]) {
                taxDue = ((income - params.scottishTaxBandsBlind[4][taxYear] ) * HIGHERRATEFORTYONEPERCENT)
                        + (params.scottishTaxPlusBlindSteps[2][taxYear]);
            }
        } else {
                if (income <= params.scottishTaxBands[1][taxYear]) {
                    taxDue = 0.0;
                } else if (income > params.scottishTaxBands[1][taxYear] && income <= params.scottishTaxBands[2][taxYear]) {
                    taxDue = (income - personalTaxAllowance) * STARTERRATENINETEENPERCENT;
                } else if (income > params.scottishTaxBands[2][taxYear] && income <= params.scottishTaxBands[3][taxYear]) {
                    taxDue = ((income - params.scottishTaxBands[2][taxYear]) * BASICRATETWENTYPERCENT) + params.scottishTaxSteps[0][taxYear];
                } else if (income > params.scottishTaxBands[3][taxYear] && income <= params.scottishTaxBands[4][taxYear]) {
                    taxDue = (((income - params.scottishTaxBands[3][taxYear]) * INTERMEDIATERATETWENTYONE) + taxForIntermediateBand);
                } else {
                    taxDue = (((income - params.scottishTaxBands[4][taxYear]) * HIGHERRATEFORTYONEPERCENT) + taxForHigherBand);
                }
            }
        return taxDue;
    }


}



