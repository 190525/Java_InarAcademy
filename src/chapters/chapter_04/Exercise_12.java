package chapters.chapter_04;
// Hex to binary
import java.util.*;
public class Exercise_12 {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter a hex digit: ");
		  String hex = input.next();
		
		  if (hex.length() != 1) {
		   System.out.println("You must enter  one character");
		   System.exit(0);
		  }
	
		  char ch = Character.toUpperCase(hex.charAt(0));
		  int value = 0;
		  if (ch <= 'F' && ch >= 'A') {
		   value = ch - 'A' + 10;
		   
		  } else if (Character.isDigit(ch)) {
		   value = ch;
		  } else {
		   System.out.println(ch + " is an invalid input");
		   System.exit(0);
		  }
		 
		  System.out.println("The binary value  " + ch + " is " + Integer.toBinaryString(value));
		 
		 }

	}



