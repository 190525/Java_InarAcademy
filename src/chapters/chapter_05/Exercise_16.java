package chapters.chapter_05;
//Find the factors of an integer

import java.util.*;

public class Exercise_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number you want to find all its smallest factors in increasing order.");
		int number = input.nextInt();
		int factor = 2;
		while (factor <= number) {
			if (number % factor == 0) {
				if (number == factor) {
					System.out.print(factor);
				} else {

					System.out.print(factor + ", ");
					number = number / factor;
					continue;
				}
			}
			factor++;

		}
	}

}

