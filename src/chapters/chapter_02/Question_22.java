package chapters.chapter_02;
// monetary units
import java.util.*;
public class Question_22 {
	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		 
		  System.out.println("Enter the input as an integer whose last two digits represent the cents:(For example, the input 1156 represents 11 dollars and 56 cents.) ");
		  int amount = input.nextInt();
		 
		  int remainingAmount = amount;
		 
		  
		  int numberOfOneDollars = remainingAmount / 100;
		  remainingAmount = remainingAmount % 100;
		 
		  int numberOfQuarters = remainingAmount / 25;
		  remainingAmount = remainingAmount % 25;
		 
		  int numberOfDimes = remainingAmount / 10;
		  remainingAmount = remainingAmount % 10;
		 
		  int numberOfNickels = remainingAmount / 5;
		  remainingAmount = remainingAmount % 5;
		 
		  int numberOfPennies = remainingAmount;
		 
	
		  System.out.println("Your amount " + amount + " consists of");
		  System.out.println("    " + numberOfOneDollars + " dollars");
		  System.out.println("    " + numberOfQuarters + " quarters ");
		  System.out.println("    " + numberOfDimes + " dimes");
		  System.out.println("    " + numberOfNickels + " nickels");
		  System.out.println("    " + numberOfPennies + " pennies");
		 }
		}


