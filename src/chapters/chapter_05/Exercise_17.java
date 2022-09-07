package chapters.chapter_05;
//Display pyramid

import java.util.*;

public class Exercise_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines from 1 to 15:");
		int line = input.nextInt();
		for (int i = line; i >= 1; i--) {
			//Prints spaces at the beginning of each row
			for (int j = 1; j <= i*3; j++) {

				System.out.print(" ");
			}
			for(int k=i;k<=line;k++) {
				System.out.printf("%3d",(line-k+1));
			}
			for(int l=line-1;l>=i;l--) {
				System.out.printf("%3d",(line-l+1));
				
			}
		

			System.out.println();
		}
	}

}

