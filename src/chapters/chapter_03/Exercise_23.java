package chapters.chapter_03;

// Geometry: point in a rectangle?
import java.util.*;

public class Exercise_23 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		//find the coordinates at which the sides of the rectangle extend.
		// Number 1 comes from center of triangle which is(1,1)
		double x1 = 1 + 5 / 2;
		double x2 = 1 - 5 / 2;
		double y1 = 1 + 10 / 2;
		double y2 = 1 - 10 / 2;

		if (x > x1 || x < x2 || y > y1 || y < y2) {
			System.out.println("Point (" + x + "," + y + ") is out of the rectangle");

		} else

			System.out.print("Point (" + x + ", " + y + ") is in the rectangle");

	}

}

