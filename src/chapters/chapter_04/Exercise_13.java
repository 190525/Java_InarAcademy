package chapters.chapter_04;
// vowel or consonant
import java.util.*;
public class Exercise_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter a letter: ");
		  String letter = input.next();
		 
		
		  if (letter.length() != 1) {
		   System.out.println("You must enter exactly one character");
		   System.exit(0);
		  }
		 
		  char ch = Character.toLowerCase(letter.charAt(0));
		  if (ch > 'z' || ch < 'a') {
		   System.out.println("Invalid input");
		   System.exit(0);
		  }
		 
		  if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		   System.out.println(letter + " is a vowel");
		  }
		  else {
		  System.out.println(letter + " is a consonant");
		  }
	}

}

