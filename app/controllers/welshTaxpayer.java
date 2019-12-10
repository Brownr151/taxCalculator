package controllers;

public class welshTaxpayer {

    public double calcWelshAfterTaxIncome(double income, int taxYear, boolean isBlind) {
        double taxDue = 0.0;
        double personalTaxAllowance = params.welshTaxBands[1][taxYear];
        double BASICRATETWENTYPERCENT = 0.2;
        double HIGHERRATEFORTYPERCENT = 0.4;
        double MAXFORCALCULATOR = 99999;

        if (isBlind == true) {
            if (income >= params.welshTaxBands[0][taxYear] && income <= (personalTaxAllowance + params.blindPersonsAllowanceAmounts[taxYear])) {
                taxDue = 0.0;
            } else if (income >= params.welshTaxBands[1][taxYear] && income <= params.englishTaxBands[2][taxYear]) {
                taxDue = (((income - params.blindPersonsAllowanceAmounts[taxYear]) - personalTaxAllowance) * BASICRATETWENTYPERCENT);
            } else if (income >= params.welshTaxBands[2][taxYear] && income <= params.welshTaxBands[3][taxYear] && income <= MAXFORCALCULATOR) {
                taxDue = (((income - params.blindPersonsAllowanceAmounts[taxYear]) - params.welshTaxBands[2][taxYear]) * HIGHERRATEFORTYPERCENT) + params.welshBasicHigher[0][taxYear];
            }
        }else {
            if (income >= params.welshTaxBands[0][taxYear] && income <= personalTaxAllowance) {
                taxDue = 0;
            } else if (income >= params.welshTaxBands[1][taxYear] && income <= params.welshTaxBands[2][taxYear]) {
                taxDue = (income - personalTaxAllowance) * BASICRATETWENTYPERCENT;
            } else if (income >= params.welshTaxBands[2][taxYear] && income <= params.welshTaxBands[3][taxYear] && income <= MAXFORCALCULATOR) {
                taxDue = ((income - params.welshTaxBands[2][taxYear]) * HIGHERRATEFORTYPERCENT) + params.welshBasicHigher[0][taxYear];
            }
        }
            return taxDue;
        }
    }



