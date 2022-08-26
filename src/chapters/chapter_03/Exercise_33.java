package chapters.chapter_03;

// Financial: compare costs
import java.util.*;

public class Exercise_33 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight and price for package 1, respectively:");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.println("Enter weight and price for package 2, respectively:");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		double effectivePrice1 = price1 / weight1;
		double effectivePrice2 = price2 / weight2;
		if (effectivePrice1 > effectivePrice2) {
			System.out.println("Package 1 has a better price.");
		} else if (effectivePrice1 < effectivePrice2) {
			System.out.println("Package 2 has a better price.");
		} else
			System.out.println("Two packages have same price.");

	}

}

