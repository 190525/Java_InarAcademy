package chapters.chapter_02;
//Computing_BMI
import java.util.*;
public class Question_14 {
	public static void main(String[] args) {
		 
		  Scanner input = new Scanner(System.in);
		 
		  System.out.println("Enter weight in pounds:");
		  double weightInPounds = input.nextDouble();
		  double weightInKilogram = weightInPounds * 0.45359237;
		  System.out.println("Enter height in inches:");
		  double heightInInches = input.nextDouble();
		  double heightInMeters = heightInInches* 0.0254;
		  double BMI = weightInKilogram / Math.pow(heightInMeters, 2);
		 
		  System.out.print("BMI is " + BMI);

	}
}

