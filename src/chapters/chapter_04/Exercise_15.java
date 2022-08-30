package chapters.chapter_04;

// Phone key pads
import java.util.*;

public class Exercise_15 {

	public static void main(String[] args) {

		System.out.print("Enter a letter:");
		Scanner input = new Scanner(System.in);
		String letter = input.next();

		char c = letter.toLowerCase().charAt(0);
		int number=0;

		switch (c) {
		case 'a':
		case 'b':
		case 'c':
			number = 2;
			break;

		case 'd':
		case 'e':
		case 'f':
			number = 3;
			break;

		case 'g':
		case 'h':
		case 'i':
			number = 4;
			break;

		case 'j':
		case 'k':
		case 'l':
			number = 5;
			break;

		case 'm':
		case 'n':
		case 'o':
			number = 6;
			break;

		case 'p':
		case 'q':
		case 'r':
		case 's':
			number = 7;
			break;

		case 't':
		case 'u':
		case 'v':
			number = 8;
			break;

		case 'w':
		case 'x':
		case 'y':
		case 'z':
			number = 9;
			break;
			
		default:
			System.out.println("Invalid input");
			System.exit(0);
			break;
		}
		System.out.println("The corresponding number is " + number);

	}

}

