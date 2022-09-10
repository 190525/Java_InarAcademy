package chapters.chapter_05;
// decimal convert to octal
import java.util.Scanner;

public class Exercise_38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal integer  to you want to covert binary value.");
		int number = input.nextInt();
		String octalNumber = "";
		while (number > 0) {
			int octal = number % 8;
			String octal1 = String.valueOf(octal);
			number = number / 8;
			octalNumber = octal1 + octalNumber;
		}
		System.out.println(octalNumber);

	}

}

