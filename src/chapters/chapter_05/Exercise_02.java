package chapters.chapter_05;

//Repeat Addition Quiz
import java.util.*;

public class Exercise_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int correctCount=0;
		int sum = 0;
		long startTime = System.currentTimeMillis();
		while (count < 5) {
			int number1 = (int) (Math.random() * 16);
			int number2 = (int) (Math.random() * 16);
			sum = number1 + number2;
			System.out.println("What is " + number1 + " + " + number2 + " =?");
			int answer = input.nextInt();

			if (number1 + number2 == answer) {
				correctCount++;
			} 
			System.out.println("Sum of two integers " + sum);
			count++;
		}
		long finishTime = System.currentTimeMillis();
		long testTime = finishTime - startTime;
		System.out.println("\nYour correct answer is "+correctCount+".");
		System.out.println("Your test time is " + testTime / 1000 + " seconds.");
	}

}

