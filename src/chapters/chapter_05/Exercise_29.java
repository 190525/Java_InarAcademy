package chapters.chapter_05;

import java.util.Scanner;

// Display calendar
public class Exercise_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year :");
		int year = input.nextInt();
		System.out.println("Enter the day(0 for Monday, 1 for Tuesday...) : ");
		int days = input.nextInt();
		int monthDay = 1;

		for (int i = 1; i <= 12; i++) {
			days = days % 7;
			String day = "";
			switch (days) {// What day is the first day of the year its determination

			case 0:
				day = "Monday";
				break;
			case 1:
				day = "Tuesday";
				break;
			case 2:
				day = "Wednesday";
				break;
			case 3:
				day = "Thursday";
				break;
			case 4:
				day = "Friday";
				break;
			case 5:
				day = "Saturday";
				break;
			case 6:
				day = "Sunday";
				break;

			default:
				System.out.println("Invalid day");
				break;
			}

			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {// Determination of months lasting 31 days and determination of their calendar
				if (i == 1) {// Determination of months
					System.out.println("\t\tJanuary \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				if (i == 3) {
					System.out.println("\t\tMarch \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				if (i == 5) {
					System.out.println("\t\tMay \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				if (i == 7) {
					System.out.println("\t\tJuly \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				if (i == 8) {
					System.out.println("\t\tAugust \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				if (i == 10) {
					System.out.println("\t\tOcotober \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				if (i == 12) {
					System.out.println("\t\tDecember \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				switch (days) {

				case 0:
					day = "Monday";
					break;
				case 1:
					day = "Tuesday";
					System.out.printf("%6s", " ");
					break;
				case 2:
					day = "Wednesday";
					System.out.printf("%6s%6s", " ", " ");
					break;
				case 3:
					day = "Thursday";
					System.out.printf("%6s%6s%6s", " ", " ", " ");
					break;
				case 4:
					day = "Friday";
					System.out.printf("%6s%6s%6s%6s", " ", " ", " ", " ");
					break;
				case 5:
					System.out.printf("%6s%6s%6s%6s%6s", " ", " ", " ", " ", " ");
					break;
				case 6:
					System.out.printf("%6s%6s%6s%6s%6s%6s", " ", " ", " ", " ", " ", " ");
					break;

				}

				if (days != 0) {// Since the index of Monday is 0, it was necessary to separate it.
					for (monthDay = 1; monthDay <= 31; monthDay++) {
						System.out.printf("%6d", monthDay);

						if (days % 7 == 6) {
							System.out.println();
						}
						days++;

					}
				} else { // Since the index of Monday is 0, it was necessary to separate it.

					for (int monthday = 1; monthday <= 31; monthday++) {
						System.out.printf("%6d", monthday);

						if (days % 7 == 6) {
							System.out.println();
						}
						days++;

					}
				}
				System.out.println();

			}

			else if (i == 2) {// Exception: February
				System.out.println("\t\tFebruary\t" + year);
				System.out.println("   ---------------------------------------");
				System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
				System.out.println();
				switch (days) {

				case 0:
					day = "Monday";
					break;
				case 1:
					day = "Tuesday";
					System.out.printf("%6s", " ");
					break;
				case 2:
					day = "Wednesday";
					System.out.printf("%6s%6s", " ", " ");
					break;
				case 3:
					day = "Thursday";
					System.out.printf("%6s%6s%6s", " ", " ", " ");
					break;
				case 4:
					day = "Friday";
					System.out.printf("%6s%6s%6s%6s", " ", " ", " ", " ");
					break;
				case 5:
					System.out.printf("%6s%6s%6s%6s%6s", " ", " ", " ", " ", " ");
					break;
				case 6:
					System.out.printf("%6s%6s%6s%6s%6s%6s", " ", " ", " ", " ", " ", " ");
					break;

				}

				if (days != 0) {

					for (monthDay = 1; monthDay <= 28; monthDay++) {

						System.out.printf("%6d", monthDay);

						if (days % 7 == 6) {
							System.out.println();
						}
						days++;
					}

				} else {

					for (int monthday = 1; monthday <= 28; monthday++) { // Determination of leap years
						System.out.printf("%6d", monthday);

						if (days % 7 == 6) {
							System.out.println();
						}
						days++;

					}
				}
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					System.out.printf("%6d", monthDay);
					days++;

				}

				System.out.println();

			} else {//Determination of months lasting 30 days and determination of their calendar
				if (i == 4) {
					System.out.println("\t\tApril \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				if (i == 6) {
					System.out.println("\t\tJune \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				if (i == 9) {
					System.out.println("\t\tSeptember \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				if (i == 11) {
					System.out.println("\t\tNovember \t" + year);
					System.out.println("   ---------------------------------------");
					System.out.printf("%6s%6s%6s%6s%6s%6s%6s", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
					System.out.println();
				}
				switch (days) {

				case 0:
					day = "Monday";
					break;
				case 1:
					day = "Tuesday";
					System.out.printf("%6s", " ");
					break;
				case 2:
					day = "Wednesday";
					System.out.printf("%6s%6s", " ", " ");
					break;
				case 3:
					day = "Thursday";
					System.out.printf("%6s%6s%6s", " ", " ", " ");
					break;
				case 4:
					day = "Friday";
					System.out.printf("%6s%6s%6s%6s", " ", " ", " ", " ");
					break;
				case 5:
					System.out.printf("%6s%6s%6s%6s%6s", " ", " ", " ", " ", " ");
					break;
				case 6:
					System.out.printf("%6s%6s%6s%6s%6s%6s", " ", " ", " ", " ", " ", " ");
					break;

				}

				if (days != 0) {
					for (monthDay = 1; monthDay <= 31; monthDay++) {
						System.out.printf("%6d", monthDay);

						if (days % 7 == 6) {
							System.out.println();
						}
						days++;

					}
				} else {

					for (int monthday = 1; monthday <= 31; monthday++) {
						System.out.printf("%6d", monthday);

						if (days % 7 == 6) {
							System.out.println();
						}
						days++;

					}
				}
				System.out.println();

			}
		}

	}

}

