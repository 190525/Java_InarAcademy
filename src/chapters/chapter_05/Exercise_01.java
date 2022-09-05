package chapters.chapter_05;

//Count positive and negative numbers and compute the average of numbers
import java.util.*;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0:");
		int number = input.nextInt();
		int count = 0;
		int positiveCount = 0;
		int negativeCount = 0;
		double total = 0;
		if(number==0) {
			System.out.println("Numbers are entered except 0");
			System.exit(0);
		}
		while (number != 0) {
			
			if (number > 0) {

				positiveCount++;
			} else {
OAOAOA				negativeCount++;
			}
			total += number;
OAOAOA			count++;
OAOAOA			System.out.println("Enter an integer, the input ends if it is 0:");
			number = input.nextInt();

		}
		System.out.println("The number of positives : " + positiveCount);
		System.out.println("The number of negatives : " + negativeCount);
		System.out.println("Total is " + total);
		System.out.println("Average is " + total / count);

	}

}

