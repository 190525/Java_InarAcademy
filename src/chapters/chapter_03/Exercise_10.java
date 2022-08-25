package chapters.chapter_03;

// Game: multiplication quiz
import java.util.*;

public class Exercise_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = (int) (Math.random() * 1000);
		int number2 = (int) (Math.random() * 1000);

		System.out.print("What is " + number1 + " * " + number2 + "? ");

		int answer = input.nextInt();

		if (number1 * number2 == answer) {
			System.out.println("You are correct. Congratulations!");
		} else {
			System.out.println(
					"Your answer is wrong. " + number1 + " * " + number2 + " equals to " + (number1 * number2));
		}
	}
}

