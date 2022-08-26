package chapters.chapter_03;
// Geometry: point in a circle?
import java.util.*;

public class Exercise_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius =10;
		System.out.println("Enter a point with two coordinates:");
		double x= input.nextDouble();
		double y= input.nextDouble();
		double distance =Math.sqrt(x*x+y*y);
		if(distance<=10) {
			System.out.println("Point ("+x+","+y+") in the circle.");
		}
		else {
			System.out.println("Point ("+x+","+y+") out of  the circle.");
			
		}
		
	}

}

