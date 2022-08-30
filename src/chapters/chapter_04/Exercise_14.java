package chapters.chapter_04;

//Convert letter grade to number
import java.util.*;

public class Exercise_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter grade (A-F) : ");
		String letter = input.nextLine();

		if (letter.length() != 1) {
			System.out.println("You must enter  one character");
			System.exit(0);
		}

		char ch = Character.toUpperCase(letter.charAt(0));

		int number = 0;
		switch (ch) {
		case 'A':
			number = 4;
			break;
		case 'B':
			number = 3;
			break;
		case 'C':
			number = 2;
			break;
		case 'D':
			number = 1;
			break;
		case 'F':
			number = 0;
			break;

		default:
			System.out.println("Invalid grade");
			System.exit(0);
			break;
		}

		System.out.println("The numeric value for grade " + letter + " is " + number);

	}

}

