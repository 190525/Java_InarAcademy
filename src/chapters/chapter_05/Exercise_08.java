package chapters.chapter_05;

// Find the highest score
import java.util.*;

public class Exercise_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name1 = "";//Variables to use to find the highest score's name
		double score1 = 0;//Variables to use to find the highest score
		
		System.out.println("Enter number of students.");
		int number = input.nextInt();
		int i = 1;
		while (i <= number) {
			System.out.println("Enter student's name :");
			String name = input.next();
			System.out.println("Enter " + name + "'s score :");
			double score = input.nextDouble();
			if (score > score1) {
				double temp = score1;
				score1 = score;
				score = temp;
				String tempname = name1;
				name1 = name;
				name = tempname;

			}
			i++;

		}
		System.out.println("The highest score's name \"" + name1 + "\" and the highest score : \"" + score1 + "\"");

	}

}

