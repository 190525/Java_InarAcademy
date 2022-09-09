package chapters.chapter_05;

// Sum a series 

public class Exercise_24 {

	public static void main(String[] args) {
		double result = 1;
		// 1 + 1 / 3 + 1 / 5 + 1 / 7 ... 97 / 99
		for (double i = 1; i <= 97; i = i + 2) {
			result = +i / (i + 2);

		}
		System.out.println(result);

	}

}

