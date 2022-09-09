package chapters.chapter_05;
// Display numbers in a pyramid pattern
import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines from 1 to 15:");
		int line = input.nextInt();
		int n = line;// Variable assigned to store k value in 4-digit places
		for (int i = 1; i <=line; i++) {

			for (int j = i; j <=line+3*n; j++) {

				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.printf("%4d",(int)Math.pow(2, k));
			}
			for(int k=i;k>1;k--) {
				System.out.printf("%4d",(int)Math.pow(2, k-2));
			}

			
			System.out.println();
			n--;
		}
	}

}

