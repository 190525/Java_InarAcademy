package chapters.chapter_02;
//Cost of driving
import java.util.*;
public class Question_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the driving distance in miles:");
		  double distance = input.nextDouble();
		  System.out.println("Enter miles per gallon:");
		  double milesPerGallon = input.nextDouble();
		  System.out.println("Enter price per gallon:");
		  double pricePerGallon = input.nextDouble();
		  double cost = distance / milesPerGallon * pricePerGallon;
		  System.out.print("The cost of driving is $" + cost);
		 
		 }
		
		
	}



