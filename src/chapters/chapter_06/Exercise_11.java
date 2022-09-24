public class Exercise_11 {
    //Financial application: compute commissions
    public static void main(String[] args) {
        System.out.println("  Sales     Commission Amount :");
        for (int sales = 10000; sales <= 100000; sales += 5000) {
            System.out.printf("%6d", sales);
            System.out.print("    ");
            System.out.printf("%6.1f\n", computeCommission(sales));
        }

    }

    public static double computeCommission(double salesAmount) {
        double commission=0;
             //Commission amount calculation equations
        commission = 0;
        if (salesAmount > 0) {
            if (salesAmount > 5000) {
                commission += 5000 * 0.08;
            } else {
                commission += salesAmount * 0.08;
            }

        }
        if (salesAmount > 5000) {
            if (salesAmount > 0000) {
                commission += 5000 * 0.1;
            } else {
                commission += (salesAmount - 5000) * 0.1;
            }

        }
        if (salesAmount > 10000) {
            commission += ((salesAmount - 10000) * 0.12);

        }

        salesAmount += 500;


        salesAmount +=500;

        return commission;
    }
}




