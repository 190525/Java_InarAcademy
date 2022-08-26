package chapters.chapter_03;
// Geometry: intersecting point

/*Cramer's Equation
 * ax + by = e
   cx + dy = f
x = (ed - bf) / (ad - bc)
y = (af - ec) / (ad - bc)
 */
import java.util.*;

public class Exercise_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  two points of first line , respectively");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		System.out.println("Enter  two points of second line, respectively");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		/*
		 * Applying Cramer's Rule (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
		 * (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3 This linear equation can
		 * be solved using Cramer’s rule. The equation has no solutions, the two lines
		 * are parallel.
		 */
		double a = y1 - y2;
		double b = -(x1 - x2);
		double c = (y3 - y4);
		double d = -(x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		// Finding x and y
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		if (a * d - b * c == 0) {
			System.out.println("The two lines are parallel.");
		} else {
			System.out.print("The intersecting point is at (" + x + ", " + y + ")");
		}

	}

}
//2 2 7 6.0 4.0 2.0 -1.0 -2.0

