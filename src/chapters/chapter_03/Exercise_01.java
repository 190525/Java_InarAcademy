package chapters.chapter_03;
//Algebra: solve quadratic equations

import java.util.*;

public class Exercise_01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter coefficients of the quadratic equation");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// finding discriminant of the quadratic equation
		double discriminant = b * b - 4 * a * c;
		if (discriminant > 0) {
			double root1 = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
			double root2 = (-b - Math.pow(discriminant, 0.5)) / 2 * a;
			System.out.println("The equation has two roots. \n 1:" + root1 + "\n 2: " + root2);
		} else if (discriminant == 0) {
			double root = (-b + Math.pow(discriminant, 0.5)) / 2 * a;
			System.out.println("The equation has one root which is " + root);

		} else
			System.out.println("The equation has no real roots");

	}
}

