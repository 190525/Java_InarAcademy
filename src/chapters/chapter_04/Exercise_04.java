package chapters.chapter_04;

// Geometry: area of a hexagon
import java.util.*;

public class Exercise_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the side:");
		double s = input.nextDouble();

		double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));

		area = Math.round(area * 1000) / 1000.;
		System.out.println("The area of the hexagon is " + area);
	}

}

