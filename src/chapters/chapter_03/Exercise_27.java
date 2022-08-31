package chapters.chapter_03;

//Geometry: points in triangle?
import java.util.*;

public class Exercise_27 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point’s x- and y-coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();

		// define the borders of the right triangle
		if if (x>=0 &&y>=0 && (x+2*y<=200)) { {
			System.out.println("Point (" + x + "," + y + ") is out of the right triangle");
		} else {
			System.out.println("Point (" + x + "," + y + ") is in the right triangle");

		}

	}

}

