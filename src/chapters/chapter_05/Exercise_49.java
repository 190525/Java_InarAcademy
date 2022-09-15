package chapters.chapter_05;

// Count vowels and consonants
import java.util.*;

public class Exercise_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = input.nextLine();
		str = str.toLowerCase();
		int vovel = 0;
		int consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int digit = (int) ch;
			if (digit >= 97 && digit <= 122) {
				if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
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

