package chapters.chapter_05;

//Find the highest 2 score
import java.util.*;

public class Exercise_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name1 = "";// Variables to use to find the highest score's name
		double score1 = 0;// Variables to use to find the highest score
		String name2 = "";// Variables to use to find the 2.highest score's name
		double score2 = 0;// Variables to use to find the 2.highest score's 
		int i = 1;
		
		System.out.println("Enter number of students.");
		int number = input.nextInt();
		
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
			
			//Finding 2. highest score
			if (score > score1) {
				score = score1;
				score2 = score;
				String tempname = name2;
				name2 = name;
				name = tempname;
			} else if (score > score2) {
				score2 = score;
				String tempname = name2;
				name2 = name;
				name = tempname;
			}
			i++;

		}
		System.out.println("The highest score's name \"" + name1 + "\" and the highest score : \"" + score1 + "\"");
		System.out.println("The highest score's name \"" + name2 + "\" and the highest score : \"" + score2 + "\"");

	}

OAOAOA}

