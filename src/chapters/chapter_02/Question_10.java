package chapters.chapter_02;
//CalculatingEnergy
import java.util.*;
public class Question_10 {

	public static void main(String[] args) {
		 
		  Scanner input = new Scanner(System.in);
		 
		  System.out.println("Enter the amount of water in kilograms:");
		  double mass = input.nextDouble();
		  System.out.println("Enter the initial temperature in Celcius:");
		  double initialTemperature = input.nextDouble();
		  System.out.println("Enter the final temperature in Celcius:");
		  double finalTemperature = input.nextDouble();
		 
		  double energy = mass * (finalTemperature - initialTemperature) * 4184;
		  System.out.print("The energy needed is " + energy);
		 
		 }
		}

