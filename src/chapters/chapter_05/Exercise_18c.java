package chapters.chapter_05;

//Pattern c
import java.util.Scanner;

public class Exercise_18c {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines from 1 to 10:");
		int line = input.nextInt();
		for (int i = line; i >= 1; i--) {
			
			//Prints spaces at the beginning of each row
			for (int j = 1; j < i*2 ; j++) {

				System.out.print(" ");
			}
			for (int k = i; k <= line; k++) {
				System.out.printf("%2d", (line - k + 1));
			}
			System.out.println();

		}
	}

}

