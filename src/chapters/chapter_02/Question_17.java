package chapters.chapter_02;
// Calculation of wind-chill temperature

import java.util.*;
public class Question_17 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		 
		  System.out.println("Enter the temperature in Fahrenheit between -58F and 41F:");
		  double temparature = input.nextDouble();
		  System.out.println("Enter the wind speed which must be greater than 2 in miles per hour:");
		  double speed = input.nextDouble();
		  double temparatureWind_Chill = 35.74 + 0.6215 * temparature - 35.75 * Math.pow(speed, 0.16) + 0.4275
		    * temparature * Math.pow(speed, 0.16);
		 
		  System.out.print("The wind chill index is " + temparatureWind_Chill);
		 
		 }

}

