package chapters.chapter_05;
// Future tuition
public class Exercise_07 {
	public static void main(String[] args) {
		int tuitionPerYear = 10000;
		double totalCost10 =10000;//first year tuition
		double totalCost14 = 0;

		for (int year = 2; year <= 14; year++) {

			tuitionPerYear += tuitionPerYear * .05;

			if (year <= 10) {
				totalCost10 = totalCost10 + tuitionPerYear;
			}
			if (year > 10) {
				totalCost14 = totalCost14 + tuitionPerYear;
			}
		}
		System.out.println("The cost of tuition in 10 years is $" + totalCost10);
		System.out.println("The total cost of 4 years tuition after 10 years is $" + totalCost14);

	}
}
