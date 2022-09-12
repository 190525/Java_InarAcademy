package chapters.chapter_05;

//Math: combinations
import java.util.*;

public class Exercise_43 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a two number between 1 and 7 you want to find all combinations of these two numbers");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int counter = 0;
		if (number1 > number2) {
			int temporary = number1;
			number1 = number2;
			number2 = temporary;
		}
		for (int i = number1; i <= number2; i++) {
			for (int j = i + 1; j <= number2; j++) {
				System.out.println(i + "  " + j);
				counter++;

			}

		}
		System.out.println("The total number of all combinations is " + counter);

	}

}

