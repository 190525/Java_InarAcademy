package chapters.chapter_05;

// Find the smallest n such that n^2>12,000) 
public class Exercise_12 {

	public static void main(String[] args) {
		for (int n = 0;; n++) {
			if (n * n > 12000) {
				System.out.println("The smallest number whose square is greater than 12000 is "+n);
				System.exit(0);
			}
		}

	}

}

