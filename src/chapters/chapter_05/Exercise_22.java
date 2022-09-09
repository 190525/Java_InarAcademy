package chapters.chapter_05;

import java.util.Scanner;

// Financial application: loan amortization schedule
public class Exercise_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter loan Amount : ");
		double loan = input.nextDouble();
		System.out.println("Enter number of years :");
		int year = input.nextInt();
		System.out.println("Enter annual interest rate");
		double rate = input.nextDouble();

		// Calculate Monthly İnterest Rate and total payment
		double monthlyInterestRate = rate / 1200;
		double monthlyPayment = loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
		double totalPayment = monthlyPayment * year * 12;
		System.out.println("tMontly payment : " + monthlyPayment);
		System.out.println("Total payment : " + totalPayment + "\n");
		System.out.println("Payment#\t Interest\t Principal\t Balance\n");

		for (int i = 1; i <= year * 12; i++) {

			double interest =(int)( monthlyInterestRate * loan*100)/100.;
			double principal = (int)((monthlyPayment - interest)*100)/100.;
			loan = (int)((loan - principal)*100)/100.;
			System.out.printf("%2d%20.2f%17.2f%17.2f" ,i,interest,principal,loan);
			System.out.println();
		}

	}

}

