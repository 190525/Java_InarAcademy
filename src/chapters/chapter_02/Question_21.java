package chapters.chapter_02;
// : calculate future investment value
import java.util.*;
public class Question_21 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		 
		  System.out.println("Enter investment amount:");
		  double investmentAmount = input.nextDouble();
		  System.out.println("Enter annual interest rate in percentage (e.g., 3 for 3%):");
		  double annualInterestRate = input.nextDouble();
		 
		  System.out.println("Enter number of years:");
		  double numberOfYears = input.nextDouble();
		  double monthlyInterestRate = annualInterestRate / 12;
		  double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate / 100),(numberOfYears * 12));
		  System.out.print("Future value is $" + futureInvestmentValue);
		 
		 }
}

