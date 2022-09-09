package chapters.chapter_05;

// Financial application: compare loans with various interest rates
import java.util.*;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter loan Amount : ");
		double loan = input.nextDouble();
		System.out.println("Enter number of years :");
		int year = input.nextInt();

		System.out.println("Interest Rate \tMonthly Payment \tTotal Payment");
		System.out.println();
		
			for (double i = 5; i <= 8; i = i + 0.125) {
				System.out.printf("%1.3f%11s", i, "%          ");

				// Calculate Monthly İnterest Rate and total payment
				double monthlyInterestRate = i / 1200;
				double monthlyPayment = loan * monthlyInterestRate
						/ (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
				double totalPayment = monthlyPayment * year * 12;
				System.out.printf("%.2f%18s%.2f", monthlyPayment, "          ", totalPayment);
				System.out.println();
			}

			
		

	}

}

