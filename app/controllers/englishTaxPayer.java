package controllers;

public class englishTaxPayer {

    public double calcEnglishAfterTaxIncome(double income, int taxYear, boolean blindpersonboolean) {
        double taxDue = 0.0;
        double personalTaxAllowance = params.englishTaxBands[1][taxYear];
        double BASICRATETWENTYPERCENT = 0.2;
        double HIGHERRATEFORTYPERCENT = 0.4;
        int MAXFORCALCULATOR = 99999;

        if (blindpersonboolean == true) {
            if (income >= params.englishTaxBands[0][taxYear] && income <= (personalTaxAllowance + params.blindPersonsAllowanceAmounts[taxYear])) {
                taxDue = 0.0;
            } else if (income >= params.englishTaxBands[1][taxYear] && income <= params.englishTaxBands[2][taxYear]) {
                taxDue = (((income - params.blindPersonsAllowanceAmounts[taxYear]) - personalTaxAllowance)  * BASICRATETWENTYPERCENT);
            } else if (income >= params.englishTaxBands[2][taxYear] && income <= params.englishTaxBands[3][taxYear] && income <= MAXFORCALCULATOR) {
                taxDue = (((income - params.blindPersonsAllowanceAmounts[taxYear]) - params.englishTaxBands[2][taxYear])  * HIGHERRATEFORTYPERCENT) + params.englishBasicHigherAdvanced[0][taxYear];
            }

            } else {
                if (income >= params.englishTaxBands[0][taxYear] && income <= personalTaxAllowance) {
                    taxDue = 0;
                } else if (income >= params.englishTaxBands[1][taxYear] && income <= params.englishTaxBands[2][taxYear]) {
                    taxDue = (income - personalTaxAllowance) * BASICRATETWENTYPERCENT;
                } else if (income >= params.englishTaxBands[2][taxYear] && income <= params.englishTaxBands[3][taxYear] && income <= MAXFORCALCULATOR) {
                    taxDue = ((income - params.englishTaxBands[2][taxYear]) * HIGHERRATEFORTYPERCENT) + params.englishBasicHigherAdvanced[0][taxYear];
                }
            }

            return taxDue;
        }

}

