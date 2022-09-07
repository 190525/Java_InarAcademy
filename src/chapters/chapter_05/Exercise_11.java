package chapters.chapter_05;
//Find numbers divisible by 5 or 6, but not both
public class Exercise_11 {

	public static void main(String[] args) {
		int countPerLine=0;
		for (int i = 100; i < 1000; i++) {
			if (i % 5 == 0 ^ i % 6 == 0) {
				System.out.printf("%4d",i);
				countPerLine++;
				if(countPerLine%10==0) {
					System.out.println();
				}

			}
		}


	}

}

