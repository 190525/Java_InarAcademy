package Chapter_01;
//Algebra: solve 2 * 2 linear equations

import java.util.*;
public class Exercise_13 {
	public static void main(String[] args) {
		
		//determining the coefficients of the equation
		double a = 15;
		double b = 8;
		double c = 9;
		double d = 7;
		double e = 150;
		double f = 165;
		
		double x =( e * d - b * f) / (a * d - b * c); 
		double y = (a * f - e *c) / (a * d - b * c);
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		
	}
	
}
