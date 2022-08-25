package chapters.chapter_03;

//Business: check ISBN-10
import java.util.*;

public class Exercise_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
		
		/* The number type double was chosen because it will be warned when it gives an incorrect value.
		 * but it converts to integer inside if statement */
		 
		double isbn_9 = input.nextDouble();
		if (isbn_9 >= 100000000 && isbn_9 <= 999999999) {
			int isbn =(int)isbn_9;
			int d9 = isbn % 10;

			int remainingAmount = isbn / 10;
			int d8 = remainingAmount % 10;

			remainingAmount = remainingAmount / 10;
			int d7 = remainingAmount % 10;

			remainingAmount = remainingAmount / 10;
			int d6 = remainingAmount % 10;

			remainingAmount = remainingAmount / 10;
			int d5 = remainingAmount % 10;

			remainingAmount = remainingAmount / 10;
			int d4 = remainingAmount % 10;

			remainingAmount = remainingAmount / 10;
			int d3 = remainingAmount % 10;

			remainingAmount = remainingAmount / 10;
			int d2 = remainingAmount % 10;

			remainingAmount = remainingAmount / 10;
			int d1 = remainingAmount % 10;

			int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
			if (d10 == 10) {

				System.out.println("your ISBN number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + ""
						+ d7 + "" + d8 + "" + d9 + "" + "X");
			} else {
				System.out.println("your ISBN number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + ""
						+ d7 + "" + d8 + "" + d9 + "" + d10);

			}
		} else {
			System.out.println("You entered wrong number");
		}
	}

}

