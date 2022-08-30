package chapters.chapter_04;

// Find the Unicode of a character
import java.util.*;

public class Exercise_09 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a character: ");
		String characther = input.nextLine();
		char ch = characther.charAt(0);

		System.out.print("The Unicode for the character " + ch + " is " + (int) ch);

	}
}

