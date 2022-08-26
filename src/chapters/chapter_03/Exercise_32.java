package chapters.chapter_03;

// Geometry: point position
import java.util.*;

public class Exercise_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the coordinates of the two points the line will pass through ,respectively.");
		double point1x1 = input.nextDouble();
		double point1y1 = input.nextDouble();
		double point2x1 = input.nextDouble();
		double point2y1 = input.nextDouble();

		System.out.println("Enter the coordinates of the point whose position you want to check.");
		double point3x1 = input.nextDouble();
		double point3y1 = input.nextDouble();

		double result = (point2x1 - point1x1) * (point3y1 - point1y1) - (point3x1 - point1x1) * (point2y1 - point1y1);

		if (result > 0) {
			System.out.println("The point is on the left side of the line");

		} else if (result == 0) {
			System.out.println("The point on the same line");
		} else {
			System.out.println("The point is on the right side of the line");

		}

	}

}

