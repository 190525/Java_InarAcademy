// Financial: the Tax class and Test Class
public class Exercise_08 {


    public static void main(String[] args) {
        double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
        int[][] brackets2001 = {{27050, 65550, 136750, 297350}, // Single filer
                {45200, 109250, 166500, 297350}, // Married jointly -or qualifying widow(er)
                {22600, 54620, 83250, 148675}, // Married separately
                {36250, 93650, 151650, 297350} // Head of household
        };

        double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets2009 = {{8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly  -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950}}; // Head of household

        //The tabular printing part is taken from the sample code.
        System.out.println("__________________________________ Tax Tables for 2001 __________________________________");
        System.out.println("Taxable Income |  Single Filer | Married jointly |  Married Separately |" + "  Head " + "Of House");
        for (int taxableIncome = 50_000; taxableIncome <= 60_000; taxableIncome += 1000) {

            System.out.printf("\t%d", taxableIncome);

            Tax taxHelper = new Tax(Tax.SINGLE_FILER, brackets2001, rates2001, taxableIncome);
            System.out.printf("\t\t\t %.2f", taxHelper.getTax());

            taxHelper.setFilingStatus(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER);
            System.out.printf("\t\t %.2f", taxHelper.getTax());

            taxHelper.setFilingStatus(Tax.MARRIED_SEPARATELY);
            System.out.printf("\t\t\t %.2f", taxHelper.getTax());

            taxHelper.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
            System.out.printf("\t\t\t %.2f" + "\n", taxHelper.getTax());


        }
        System.out.println("__________________________________ Tax Tables for 2009 __________________________________");
        System.out.println("Taxable Income |  Single Filer | Married jointly |  Married Separately |" + "  Head " + "Of House");
        for (int taxableIncome = 50_000; taxableIncome <= 60_000; taxableIncome += 1000) {

            System.out.printf("\t%d", taxableIncome);

            Tax taxHelper2 = new Tax(Tax.SINGLE_FILER, brackets2009, rates2009, taxableIncome);
            System.out.printf("\t\t\t %.2f", taxHelper2.getTax());

            taxHelper2.setFilingStatus(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER);
            System.out.printf("\t\t %.2f", taxHelper2.getTax());

            taxHelper2.setFilingStatus(Tax.MARRIED_SEPARATELY);
            System.out.printf("\t\t\t %.2f", taxHelper2.getTax());

            taxHelper2.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
            System.out.printf("\t\t\t %.2f" + "\n", taxHelper2.getTax());


        }

    }

}
class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double taxableIncome;
    private double[] rates;

    public Tax() {

    }

    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        int[] bracket = brackets[filingStatus];
        double tax = 0;
        if (taxableIncome <= bracket[0]) {
            tax = taxableIncome * rates[0];
        } else if (taxableIncome <= bracket[1]) {
            tax = bracket[0] * rates[0] + (taxableIncome - bracket[0]) * rates[1];
        } else if (taxableIncome <= bracket[2]) {
            tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] + (taxableIncome - bracket[1]) * rates[2];
        } else if (taxableIncome <= bracket[3]) {
            tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] + (bracket[2] - bracket[1]) * rates[2]
                    + (taxableIncome - bracket[2]) * rates[3];
        } else if (taxableIncome <= bracket[4]) {
            tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] + (bracket[2] - bracket[1]) * rates[2]
                    + (bracket[3] - bracket[2]) * rates[3] + (taxableIncome - bracket[4]) * rates[4];
        } else
            tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] + (bracket[2] - bracket[1]) * rates[2]
                    + (bracket[3] - bracket[2]) * rates[3] + (bracket[4] - bracket[3]) * rates[4] + (taxableIncome - bracket[4]) * rates[5];

        return tax;

    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }
}

