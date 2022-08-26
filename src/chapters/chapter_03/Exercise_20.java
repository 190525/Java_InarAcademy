package chapters.chapter_03;

//wind-chill temperature
import java.util.*;

public class Exercise_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit between -58F and 41F:");
		double temparature = input.nextDouble();
		System.out.println("Enter the wind speed which must be greater than 2 in miles per hour:");
		double speed = input.nextDouble();
		if ((temparature <= -58 || temparature >= 41) && speed <= 2) {
			System.out.println("Temperature and wind speed are invalid");
		}

		else if (temparature <= -58 || temparature >= 41) {
			System.out.println("Temperature is invalid.");
		} else if (speed <= 2) {
			System.out.println(" Wind speed is invalid.");
		} else {
			double temparatureWind_Chill = 35.74 + 0.6215 * temparature - 35.75 * Math.pow(speed, 0.16)
					+ 0.4275 * temparature * Math.pow(speed, 0.16);

			System.out.print("The wind chill index is " + temparatureWind_Chill);

		}
	}
}

