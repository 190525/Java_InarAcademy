package chapters.chapter_04;
// Geometry: area of a regular polygon
import java.util.*;

public class Exercise_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  System.out.println("Enter the number of sides:");
		  double n = input.nextDouble();
		   
		  System.out.print("Enter the side length:");
		  double s = input.nextDouble();
		   
		  double area = (n *s*s) / (4 * Math.tan(Math.PI / n));
		  area =(int)(area *1000) / 1000.;
		 
		  System.out.println("The area of the polygon is " + area);

	}

}

