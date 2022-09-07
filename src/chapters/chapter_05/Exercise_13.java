package chapters.chapter_05;

//Find the largest n such that n^3<12,000)
public class Exercise_13 {

	public static void main(String[] args) {
		int n = 1;
		while (n * n * n < 12000) {
			n++;

		}
		System.out.println("The greatest number whose square is smaller than 12000 is " + (n - 1));

	}

}

