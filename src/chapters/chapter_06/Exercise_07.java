import java.util.*;
public class Exercise_07 {
    //Financial application: compute the future investment value
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int numberOfYears = 30;

        System.out.println("Enter investment amount:");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage (e.g., 3 for 3%):");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 12;

        System.out.println("Years \t\tFuture value");
        for (int years = 1; years <= numberOfYears; years++) {
            System.out.printf("%2d",years);
            System.out.printf("             %.2f", futureInvestmentValue(investmentAmount,monthlyInterestRate,years));
            System.out.println();


        }
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {

OAOAOA        return investmentAmount * Math.pow((1 + monthlyInterestRate / 100),(years * 12));
    }
}

