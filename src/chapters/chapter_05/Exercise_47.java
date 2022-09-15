package chapters.chapter_05;

// Business: check ISBN-13
import java.util.*;

public class Exercise_47 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 12 digits of  your ISBN number as a string : ");
		String stringIsbn_12 = input.nextLine();
		final String ISBN_12 = stringIsbn_12;

		int digit12Sum = 0;
		if (stringIsbn_12.length() == 12) {

			for (int i = 0; i < stringIsbn_12.length(); i++) {
				char ch = stringIsbn_12.charAt(i);
				String str = String.valueOf(ch);
				int digit = Integer.valueOf(str);

				if (i % 2 == 0) {
					digit12Sum = digit12Sum + digit;
				} else {
					digit12Sum = digit12Sum + 3 * digit;

				}

			}
			int d13 = 10 - (digit12Sum % 10);
			if (d13 != 10) {
				System.out.println("Your ISBN number is : " + ISBN_12 + d13);

			} else {
				System.out.println("Your ISBN number is : " + ISBN_12 + "0");

			}
		} else {
			System.out.println("Invalid input");
		}
	}

}

