package chapters.chapter_04;
// Decimal to hex
import java.util.*;

public class Exercise_11 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal value(0 to 15): ");
		int i = input.nextInt();
		if (i >= 0 && i <= 15) {
			System.out.println("The hex value is " + Integer.toHexString(i).toUpperCase());

		} else {
			System.out.println("Invalid input");
		}

	}
}

