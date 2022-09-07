package chapters.chapter_05;
// Pattern d

import java.util.*;

public class Exercise_18d {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines from 1 to 10:");
		int line = input.nextInt();
		int n = 1;// Variable assigned to store k value in 3-digit places
		for (int i = 0; i <= line; i++) {
			// Prints spaces at the beginning of each row
			for (int j = 0; j < i + (2 * n - 1); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= line - i; k++) {
				System.out.printf("%3d", k);

			}
			System.out.println();
			n++;
		}
	}
}

