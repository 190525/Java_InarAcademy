package chapters.chapter_03;
// Random point
public class Exercise_16 {
	 public static void main(String[] args) {
		
		double x1 = Math.random() * 101 - 50;
		double y1 = Math.random() * 201 - 100;
		// editing form of x and y
		double x = (int) (x1 * 100) / 100.;
		double y = (int) (y1 * 100) / 100.;

		System.out.print("(" + x + "," + y + ")");
	}

}
