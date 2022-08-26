package chapters.chapter_03;

// Science: day of the week
import java.util.*;

public class Exercise_21 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012):");
		int year = input.nextInt();
		System.out.println("Enter month: 1-12:");
		int month = input.nextInt();
		System.out.println("Enter the day of the month: 1-31:");
		int day = input.nextInt();
		// Christian Zeller Theory
		int k = year % 100; // k is the year of the century
		int j = year / 100;
		int h = (day + (26 * (month + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
		String days="";
		switch(h) {
		case 0:
			days="Saturday";
			break;
			
		case 1:
			days="Sunday";
			break;
		case 2:
			days="Monday";
			break;
		case 3:
			days="Tuesday";
			break;
		case 4:
			days="Wednesday";
			break;
		case 5:
			days="Thursday";
			break;
		case 6:
			days="Friday";
			break;
		
			
		}
		System.out.println("Day of the week is " + days);
	
		
	}

}

