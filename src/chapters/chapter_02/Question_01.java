package chapters.chapter_02;
//ConvertMileToKilometer

import java.util.Scanner;

public class Question_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter miles: ");
		double miles = input.nextDouble();
		final double COEFFİCİENT = 1.6;
		double kilometers = COEFFİCİENT * miles;
		System.out.println(miles + " equals to "+ kilometers + " kilometers ");
	}

}
