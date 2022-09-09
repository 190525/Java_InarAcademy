package chapters.chapter_05;
// Display prime numbers between 2 and 1,000
public class Exercise_20 {
	public static void main(String[] args) {
		int count = 0;
		int number = 2;

		while (number < 1000) {
			boolean isPrime = true;
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				count++;
				System.out.printf("%4d", number);
				if (count % 8 == 0) {
					System.out.println();
				}

			}
			number++;

		}

	}
}

