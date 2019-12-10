package controllers;

public class params {
    public static String taxYear[] = {"2015/2016", "2016/2017", "2017/2018", "2018/2019", "2019/2020"};

    public static double englishTaxBands [][] = {
            { 0, 0, 0, 0, 0 },
            { 10600, 11000, 11500, 11850, 12500 }, // 20% tax over this amount
            { 42385, 43000, 45000, 46350, 50000 }, // 40% tax over this amount
            { 150000, 150000, 150000, 150000, 150000 } // 45% tax over this amount
    };
    public static double englishBasicHigherAdvanced [][] = {
            {6357, 6400, 6700, 6900, 7500 }, // higher rate minus basic rate for each year
            {43046, 42800, 42000, 41460, 40000} // advanced minus higher rate for each year
    };
    public static double welshTaxBands [][] = {
            { 0, 0, 0, 0, 0 },
            { 10600, 11000, 11500, 11850, 12500 },
            { 31785, 32000, 33500, 34500, 50000 },
            { 150000, 150000, 150000, 150000, 150000 }
    };
    public static double welshBasicHigher[][] = {
            {6357, 6400, 6700, 6900, 7500 },
            {43046, 42800, 42000, 41460, 40000}
    };

    public static double scottishTaxBands [][] = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 11850, 12500}, // personal allowance
            {0, 0, 0, 13850, 14549}, // starter 19%
            {0, 0, 0, 24000, 24944}, // Basic rate 20%
            {0, 0, 0, 43430, 43430}, // intermediate rate 21%
            {0, 0, 0, 150000, 150000} // Higher rate 41%
    };
    public static double scottishTaxBandsBlind [][] = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 14240, 14950}, // personal allowance
            {0, 0, 0, 16240, 16999}, // starter 19%
            {0, 0, 0, 26390, 27394}, // Basic rate 20%
            {0, 0, 0, 45820, 45880}, // intermediate rate 21%
            {0, 0, 0, 150000, 150000} // Higher rate 41%
    };
    public static double scottishTaxSteps [][] = {
            {0, 0, 0, 380, 389.31},
            {0, 0, 0, 2030, 2079},
            {0, 0, 0, 4080.30, 3882.06},
            {0, 0, 0, 43693.70, 43693.70}
    };
    public static double scottishTaxPlusBlindSteps [][] = {
            {0, 0, 0, 380, 389.31},
            {0, 0, 0, 2410, 2468.31},
            {0, 0, 0, 6490.30, 6350.37},
            {0, 0, 0, 28703.69, 28539.16}
    };
    public static double [] blindPersonsAllowanceAmounts = {2348, 2320, 2290, 2390, 2450};

};

