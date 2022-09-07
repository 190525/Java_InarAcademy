package chapters.chapter_05;

// Palindrome sentence 
import java.util.Scanner;

public class E_07_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string you want to check for palindrome(without punctuation)");
		String palindrome = input.nextLine();
		String palindrome1 = palindrome.toLowerCase();
		String palindrome2 = palindrome1.replaceAll("\\s", "");

		int low = 0;
		int high = palindrome2.length() - 1;
		boolean isPalindrome2 = true;
		while (low < high) {

			if (palindrome2.charAt(low) != palindrome2.charAt(high)) {
				isPalindrome2 = false;
				break;
			}

			low++;
			high--;
		}

		if (isPalindrome2) {
			System.out.println("\"" + palindrome + "\"" + " is palindrome.");
		} else
			System.out.println("\"" + palindrome + "\"" + " is not palindrome.");

	}

}

