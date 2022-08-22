package chapters.chapter_02;
// miles convert to kilometers
public class Exercise_01 {
	public static void main(String[] args) {
		double miles =100;
		final double  KILOMETERS_PER_MILE = 1.609;
		double kilometers = miles * KILOMETERS_PER_MILE;
		System.out.println(miles  + " miles equals to "+ kilometers+ " kilometers..");
	}
}
