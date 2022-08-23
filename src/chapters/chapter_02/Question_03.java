package chapters.chapter_02;
//ConvertMetersIntoFeet
import java.util.Scanner;

public class Question_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for meter: ");
		double meters = input.nextDouble();
		final double COEFFİCİENT = 3.2786;
		double feets = COEFFİCİENT * meters;
		System.out.println(meters + " equals to "+ feets + " feets ");
  }
}

