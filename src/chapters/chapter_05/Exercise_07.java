package chapters.chapter_05;
// Palindrome

import java.util.*;

public class E_07 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the string you want to check for palindrome");
		String palindrome=input.nextLine();
		int low=0;
		int high=palindrome.length()-1;
		boolean isPalindrome=true;
		while(low<high) {
			if(palindrome.charAt(low)!=palindrome.charAt(high)) {
				isPalindrome=false;
				break;
			}
			low++;
			high--;
		}
		if(isPalindrome) {
			System.out.println(palindrome+" is palindrome");
		} else
			System.out.println(palindrome+" is not palindrome");
			
		
		

	}

}

