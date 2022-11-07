import java.util.Date;
import java.util.Scanner;

public class Listing_01 {
  // Test Loan Class
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("Enter annual interest rate (for example, 8.25): ");
         double annualInterestRate = input.nextDouble();
         System.out.print("Enter number of years as an integer: ");
         int numberOfYears = input.nextInt();
         System.out.print("Enter loan amount (for example, 120000.95): ");
         double loanAmount = input.nextDouble();
         Loan loan=new Loan(annualInterestRate,numberOfYears,loanAmount);
        System.out.println("The loan was created "+loan.getLoanDate());
        System.out.println("The monthly payment: "+loan.getMonthlyPayment()+ "\nThe total payment: "+loan.getTotalPayment());


    }
}
class Loan{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    Loan(){
      this(2.5,1,1000);
    }
    Loan(double annualInterestRate,int numberOfYears, double loanAmount){
        this.annualInterestRate=annualInterestRate;
        this.numberOfYears=numberOfYears;
        this.loanAmount=loanAmount;
        loanDate = new java.util.Date();
    }
    public double getMonthlyPayment() {
         double monthlyInterestRate = annualInterestRate / 1200;
         double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
         return monthlyPayment;
         }
    public double getTotalPayment() {
         double totalPayment = getMonthlyPayment() * numberOfYears * 12;
         return totalPayment;
         }



    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
         }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

}

