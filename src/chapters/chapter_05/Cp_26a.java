package chapters.chapter_05;
// Rewrite Testbreak
public class Cp_26a {

	public static void main(String[] args) {
		int sum=0;
		int number=0;
		while(sum<=100) {
			number++;
			sum+=number;
		}
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}

}

