package chapters.chapter_02;
//ComputeThevolumeOfEquilateralTriangle

import java.util.*;

public class Question_02 { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of the sides of the Equilateral");
		double length=  input.nextDouble();
		double area = Math.pow(length,2) * Math.pow(3, 0.5 ) /4;
		double volume = area * length;
	System.out.println("Area is " + area);
	System.out.println("Volume is " + volume);	
		
}

}
