package chapters.chapter_05;
// Pattern 2
import java.util.*;
public class Exercise_18b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines from 1 to 10:");
		int line = input.nextInt();
		for (int i = line; i >0; i--) {
			for (int j =1; j <=i; j++) {

				System.out.print(j + " ");
				
			}
		
			System.out.println();
			
		}
		
	}

}

