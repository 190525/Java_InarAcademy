package chapters.chapter_05;

// Financial application: compound value
import java.util.*;

public class Exercise_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount :");
		double amount = input.nextDouble();
		System.out.println("Enter the annual interest rate (e.g., 5 for %5) :");
		double annualInterestRate = input.nextDouble();
		System.out.println("Enter the number of months :");
		int month = input.nextInt();
		double monthlyInterestRate = annualInterestRate / 1200;
		double savingAmount = 0;
		int monthsNumber = 1;
		while (monthsNumber <= month) {
			savingAmount = (amount + savingAmount) * (1 + monthlyInterestRate);
			monthsNumber++;
		}
		System.out.println(" The amount in the savings account :$" + (int) (savingAmount * 1000) / 1000.);
	}

}

