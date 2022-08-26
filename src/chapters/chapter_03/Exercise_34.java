package chapters.chapter_03;

//Geometry: point on line segment
import java.util.Scanner;

public class Exdercise_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the coordinates of the two points the line will pass through ,respectively.");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		System.out.println("Enter the coordinates of the point whose position you want to check.");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double result = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);

		if (result > 0) {
			System.out.println("The point is on the left side of the line");

		} else if (result == 0) {
			
			if ((x1 < x3 && x3 < x2 && y1 < y3 && y3 < y2) || (x2 < x3 && x3 < x1 && y2 < y3 && y3 < y1) ) {
				
				System.out.println("("+x3+","+ y3+") is on the line segment from first point to second point" );


			}
			else if((x1 > x3 && x3 > x2 && y1 > y3 && y3 > y2) || (x2 > x3 && x3 > x1 && y2 > y3 && y3 > y1)) {
				System.out.println("("+x3+","+ y3+") is on the line segment from second point to first point" );

				
			}
			else {
				System.out.println("("+x3+","+ y3+") is not on the line segment from first point to second point" );

			}

		} else {
			System.out.println("The point is on the right side of the line");

		}

	}

}

