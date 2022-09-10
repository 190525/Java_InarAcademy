package chapters.chapter_05;
// Find and display leap year

public class Exercise_27 {

	public static void main(String[] args) {
		int year = 101;
		int count = 1;
		while (year < 2100) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				// There are 3-digit and 4-digit numbers in the table.
				// In order for the table to appear properly, the one-unit gap requirement has
				// been adjusted for 4-digit numbers.

				System.out.printf("%5d", year);

				if (count % 10 == 0) {
					System.out.println();

				}
				count++;

			}
			year++;

		}

	}

}

