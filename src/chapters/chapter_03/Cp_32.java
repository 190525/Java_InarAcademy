package chapters.chapter_03;
// switch case(finding day of week)
import java.util.*;

public class Cp_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 0 and 6 for finding day.");
		int h = input.nextInt();
		String days = "";
		switch (h) {

		case 0:
			days = "Sunday";
			break;
		case 1:
			days = "Monday";
			break;
		case 2:
			days = "Tuesday";
			break;
		case 3:
			days = "Wednesday";
			break;
		case 4:
			days = "Thursday";
			break;
		case 5:
			days = "Friday";
			break;
		case 6:
			days = "Saturday";
			break;

		}
		System.out.println(days);
	}

}

