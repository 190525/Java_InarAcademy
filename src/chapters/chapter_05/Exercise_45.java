package chapters.chapter_05;

// Statistics: compute mean and standard deviation
import java.util.*;

public class Exercise_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double deviationNumerator 
		= 0;

		System.out.println("Enter ten numbers : ");
		for (int i = 1; i <= 10; i++) {
			double integer = input.nextDouble();
			sum += integer;// mean equals to sum of all numbers and divided by number of integer
			deviationNumerator += integer * integer;// To be used in deviation calculation

		}
		double mean = sum / 10;// Average of 10 entered numbers
		double deviation = Math.pow((deviationNumerator - (sum * sum / 10)) / (10 - 1), 0.5);

		System.out.println("The mean is " + mean);
		System.out.println("The standard deviation is " + (int) (deviation * 1000) / 1000.);

	}

}

