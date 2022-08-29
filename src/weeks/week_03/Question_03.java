package week_03;
// Reverse number
import java.util.*;

public class Question_03 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter four digits number :");
		int number = input.nextInt();
		int digits1 = number % 10;
		int remainingAmount = number / 10;
		int digits2 = remainingAmount % 10;
		remainingAmount = remainingAmount / 10;
		int digits3 = remainingAmount % 10;
		int digits4 = remainingAmount /10;
		
		System.out.println("Reversed number : " + digits1 + digits2 + digits3 + digits4);

	}
}

