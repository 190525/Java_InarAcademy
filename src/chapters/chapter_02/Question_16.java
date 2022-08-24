package chapters.chapter_02;
//AreaOfAHexagon
import java.util.*;
public class Question_16 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		 
		  System.out.print("Enter the length of the side:");
		  double length = input.nextDouble();
		  double area = (3 * Math.sqrt(3) / 2) * Math.pow(length, 2);
		  System.out.print("The area of the hexagon is " + area);
		 
		 }

}

