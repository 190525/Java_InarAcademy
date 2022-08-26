package chapters.chapter_03;

// Geometry: two circles
import java.util.*;

public class Exercise_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first circle center x-, y-coordinates, and radius, respectively:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();

		System.out.println("Enter second circle center x-, y-coordinates, and radius, respectively:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();

		double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		if (x1 == x1 && y1 == y2 && radius1 == radius2) {
			System.out.println("Two circles are the same ");
		}
		if (d <= Math.abs(radius2 - radius1)) {
			if (radius1 > radius2) {
				System.out.println("Circle2 is inside circle1");
			} else {
				System.out.println("Circle1 is inside circle2");
			}

		} else if (d <= radius2 + radius1) {
			System.out.print("circle2 overlaps circle1 ");
		} else {
			System.out.print("circle2 does not overlaps circle1 ");
		}

	}

}

