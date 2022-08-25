package chapters.chapter_03;

// Game: heads or tails
import java.util.*;

public class Exercise_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = (int)(Math.random() * 2); // generate 0 or 1
		
		System.out.print("Enter a  guess 0 for head or 1 for tail:");
		int answer = input.nextInt();

		if (number == answer) {
			System.out.print("Your guess is right. Congratulations!!");
		} else {
			System.out.print("Your guess is incorrect!");
		}

	}
}

