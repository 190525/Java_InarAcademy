package chapters.chapter_05;

// Perfect number
public class Exercise_33 {

	public static void main(String[] args) {

		int divisor = 1;
		int i = 1;
		System.out.println("The perfect numbers less than 10000 is :");
		for (i = 1; i < 10000; i++) {
			int sum = 0;
			for (divisor = 1; divisor <= i; divisor++) {
				if (i % divisor == 0) {
					sum += divisor;

				}

			}
			if ((sum - i == i)) {
				System.out.println(i);
			}

		}
	}

}

