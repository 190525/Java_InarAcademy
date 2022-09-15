package chapters.chapter_05;

// Count vowels and consonants
import java.util.*;

public class Exercise_50 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = input.nextLine();
		str = str.toUpperCase();
		int vovel = 0;
		int consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int digit = (int) ch;
			if (digit >= 65 && digit <= 90) {
				if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
					vovel++;

				} else {
					consonant++;
				}

			}

		}
		System.out.println("The number of vowels is " + vovel);
		System.out.println("The number of consonants is " + consonant);

	}

}

