package chapters.chapter_03;
//Game: multiply three numbers

import java.util.*;
public class Exercise_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 int number1 = (int)(Math.random()*10);
		 int number2 = (int)(Math.random()*10);
		 int number3 = (int)(Math.random()*10);

		 int multiply = number1 * number2 * number3;
		 System.out.println("What is " + number1 + " * " + number2 + " * " + number3);
		 int answer =input.nextInt();
		 System.out.println(number1 + " * " + number2 + " * " + number3 +" ="+ "" + answer + " is " +( multiply == answer));

		 
		
	}

}
