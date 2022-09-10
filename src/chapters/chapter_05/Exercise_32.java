package chapters.chapter_05;
// Game: lottery
import java.util.Scanner;

public class Exercise_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lottery1 = (int) (Math.random() * 10);
		int lottery2 = (int) (Math.random() * 10);

		while (lottery1 == lottery2) {
			lottery2 = (int) (Math.random() * 10);
			if (lottery1 != lottery2) {
				break;

			}
		}
		System.out.println("Enter your lottery pick (two digits),respectively: ");
		int guess1 = input.nextInt();
		int guess2 = input.nextInt();
		if (guess1 == lottery1 && guess2 == lottery2)
			System.out.println("Exact match: you win $10,000");
		else if (guess2 == lottery1 && guess1 == lottery2)
			System.out.println("Match all digits: you win $3,000");
		else if (guess1 == lottery1 || guess1 == lottery2 || guess2 == lottery1 || guess2 == lottery2)
			System.out.println("Match one digit: you win $1,000");
	}

}

