package chapters.chapter_04;
// Find the character of an ASCII code
import java.util.*;
public class Exercise_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ASCII code:");
		int number = input.nextInt();
		char value =(char)number;

		System.out.print("The character for ASCII code " + number + " is " + value);
	}

}

