package chapters.chapter_03;

//Algebra: solve 2 * 2 linear equations
import java.util.*;

public class Exercise_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b ,c ,d ,e ,f : (ax + by = e , cx + dy = f)");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		if ((a * d - b * c) != 0) {
			double x= (e * d - b * c) / (a * d - b * c);
			double y= (a * f - b * f) / (a * d - b * c);
			System.out.println("x is " + x+" and y is " + y);
			}
		
			else {
				System.out.println("The equation has no solution");
			
		}
	}

}

