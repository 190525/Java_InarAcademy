package chapters.chapter_05;

//Occurrence of max numbers
import java.util.*;

public class Exercise_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0;
		int maxCounter = 0;

		System.out.println(
				"Enter the numbers you want to find maximum number and its occurence number(enter 0 to finish) : ");
		while (true) {
			int number = input.nextInt();

			if (number > max) { // Find new max number and reset maxcounter
				max = number;
				maxCounter = 0;
			}
			if (number == max) { // Find max number occurence
				maxCounter++;

			}

			if (number == 0) { // breakpoint of infinite while loop
				break;
			}

		}
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence count of the largest number is " + maxCounter);

	}

}

