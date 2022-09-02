package chapter_01;
// Approximate pi calculation
public class Exercise_07 {
	public static void main(String[] args) {
		double Pi1 = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
		double Pi2 = 4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);

		System.out.println(Pi1);
		System.out.println(Pi2);
		
	}

}
