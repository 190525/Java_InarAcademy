package chapters.chapter_02;
//Population projection

import java.util.*;
public class Question_11 {
	public static void main(String[] args) {
		 
	      double  currentPopulation = 312032486;
	      double NewCurrentPopulation = 0;
		 
		  Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the number of years:");
		  double years = input.nextDouble();
		 
		  for (int i = 1; i <= years; i++) {
			  
		   // Convert time to second
		   int secondsInYears = 60 * 60 * 24 * 365;
		   double time = i * secondsInYears; // for avoiding integer overflow
		   
		   // Calculating population increase
		  double birth = time / 7;
		  double death = time / 13;
		  double immigrant = time / 45;
		  
		  NewCurrentPopulation = currentPopulation + birth - death + immigrant;
		  
		   
		  }
		  
			 
		  System.out.println("The population in " + years + "years is " + NewCurrentPopulation);
		 }

}

