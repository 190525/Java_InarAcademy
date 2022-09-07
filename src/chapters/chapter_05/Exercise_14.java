package chapters.chapter_05;

//Compute the greatest common divisor
import java.util.*;

public class Exercise_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int d = 0;

		System.out.println("Enter you want to find the greatest common divisor of two integers");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		if (number1 > number2) {
			d = number2;
			number2 = number1;
			number1 = d;
		} else {
			d = number1;
		}
		for (int i = d; i > 1; i--) {
			if (number2 % i == 0 && number1 % i == 0) {
				int greatestCommonDivisior = i;
				System.out.println("The greatest common divisor of " + number1 + " and " + number2 + " is " + greatestCommonDivisior);
				System.exit(0);

			}

		}
	}

}

