package chapters.chapter_03;

// Geometry: two rectangles
import java.util.*;

public class Exercise_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first rectangle center x-, y-coordinates, width, and height, respectively:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width_1 = input.nextDouble();
		double height_1 = input.nextDouble();
		System.out.println("Enter second rectangle center x-, y-coordinates, width, and height, respectively:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width_2 = input.nextDouble();
		double height_2 = input.nextDouble();
		// Since the rectangle extends the same length along the plus and minus axes,
		// its dimensions are divided into two.
		double width1 = width_1 / 2;
		double width2 = width_2 / 2;
		double height1 = height_1 / 2;
		double height2 = height_2 / 2;
		if (x1 == x2 && y1 == y2 && width1 == width2 && height1 == height2) {
			System.out.println("Two rectangle are the same.");
		}

		else if (x2 + height2 <= x1 + height1 && x2 - height2 >= x1 - height1 && y2 + width2 <= y1 + width1
				&& y2 - width2 >= y1 - width1) {
			System.out.println("The second rectangle is inside the first rectangle");

		} else if (x1 + height1 <= x2 + height2 && x1 - height1 >= x2 - height2 && y1 + width1 <= y2 + width2
				&& y1 - width1 >= y2 - width2) {
			System.out.println("The first rectangle is inside the second rectangle");
		}

		else if (x1 + height1 >= x2 - height2 && x1 - height1 <= x2 + height2 && y1 + width1 >= y2 - width2) {
			System.out.println("Rectangles  are overlap");
		}

		else {
			System.out.println("Rectangles are not overlap");
		}

	}
}

