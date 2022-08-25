package chapters.chapter_03;

// Financial application: monetary units
import java.util.*;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an amount in double, e.g 25.25 ");
		double amount = input.nextDouble();

		int remainingAmount = (int) (amount * 100);

		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		// Find the number of quarters
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;

		// Find the number of dimes
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		// Find the number of nickels
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		// Find the number of pennies
		int numberOfPennies = remainingAmount;

		System.out.print("Your amount " + amount + " consists of ");
		if (numberOfOneDollars == 1) {
			System.out.print(numberOfOneDollars + " dollar ");
		} else if (numberOfOneDollars > 1) {
			System.out.print( numberOfOneDollars + " dollars ");
		}

		if (numberOfQuarters == 1) {
			System.out.print(numberOfQuarters + " quarter ");
		} else if (numberOfQuarters > 1) {
			System.out.print( numberOfQuarters + " quarters ");
		}

		if (numberOfDimes == 1) {
			System.out.print(numberOfDimes + " dime ");
		} else if (numberOfDimes > 1) {
			System.out.print(numberOfDimes + " dimes ");
		}

		if (numberOfDimes == 1) {
			System.out.print(numberOfNickels + " nickel ");
		} else if (numberOfDimes > 1) {
			System.out.print(numberOfNickels + " nickels ");
		}

		if (numberOfPennies == 1) {
			System.out.print(numberOfPennies + " penny");
		} else if (numberOfPennies > 1) {
			System.out.print(numberOfPennies + " pennies");
		}

	}

}

