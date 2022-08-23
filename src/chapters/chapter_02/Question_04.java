package chapters.chapter_02;
//ConvertSqquareMeterIntoPing
import java.util.Scanner;

public class Question_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for squaremeters: ");
		double squaremeters = input.nextDouble();
		final double COEFFİCİENT = 0.3025;
		double pings = squaremeters*COEFFİCİENT;
		System.out.println(squaremeters + " equals to "+ pings + " pings ");
  }

}
