package chapters.chapter_05;

import java.util.Scanner;

// Pattern a
public class Exercise_18a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines from 1 to 10:");
		int line = input.nextInt();
		for (int i = 1; i <= line; i++) {
			
			for (int j = 1; j <= i; j++) {

				System.out.print(j + " ");
			}
		

			System.out.println();
		}

	}

}

