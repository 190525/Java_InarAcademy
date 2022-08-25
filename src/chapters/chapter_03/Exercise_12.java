package chapters.chapter_03;
//Palindrome integer
import java.util.*;
public class Exercise_12 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter a three-digit integer:");
		  int number = input.nextInt();
		  
		  if(number>=100 && number<1000) {
		 
		  int first = number % 10;
		  int last = number / 100;
		  
		  if (first == last) {
		   System.out.print(number + " is a palindrome number");
		  } else {
		   System.out.print(number + " is not a palindrome number");
		  }
		 
		 }
		  else {
			  System.out.print("You entered wrong number. Enter a three-digit integer:");
		  }
	}

}

