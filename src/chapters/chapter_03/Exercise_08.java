package chapters.chapter_03;
//Sort three integers
import java.util.*;

public class Exercise_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three numbers you want to sort");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		if (number1<number2) {
			double temporaryNumber = number1;
			number1=number2;
			number2=temporaryNumber;
			
			
		}
		if (number1<number3) {
			double temporaryNumber = number1;
			number1=number3;
			number3=temporaryNumber;
			
			
		}		if (number2<number3) {
			double temporaryNumber = number2;
			number2=number3;
			number3=temporaryNumber;			
			
		}
		System.out.println("The integers in descending order is " + number1 + " " + number2 +" "+ number3);
	}

}

