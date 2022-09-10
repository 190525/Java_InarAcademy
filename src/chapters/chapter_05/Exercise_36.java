package chapters.chapter_05;

// Checking ISBN number
import java.util.*;

public class Exercise_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 9 digits of  your ISBN number : ");
		int isbn_9 = input.nextInt();
		final int ISBN_9 = isbn_9;
		int digit10Sum = 0;
		int i = 9;
		while (i > 0) {

			int digit = isbn_9 % 10;
			isbn_9 = isbn_9 / 10;
			digit10Sum += digit * i;
			i--;

		}
		int d10 = digit10Sum % 11;
		if (d10 != 10) {
			System.out.println("Your ISBN number is : " + ISBN_9 + d10);

		}
		else {
			System.out.println("Your ISBN number is : " + ISBN_9 +"X");
			
		}
	}

}

