package chapters.chapter_03;

// Compute the perimeter of a triangle
import java.util.*;

public class Exercise_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of three edges  of the triangle");
		double length1 = input.nextDouble();
		double length2 = input.nextDouble();
		double length3 = input.nextDouble();

		if (length1 + length2 <= length3 || length2 + length3 <= length1 || length1 + length3 <= length2) {
			System.out.println("Input is invalid ");
		} else {
			double perimeter = length1 + length2 + length3;
			System.out.println("The perimeter of triangle is " + perimeter);
		}

	}

}

