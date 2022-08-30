package chapters.chapter_04;

// Random points on a circle

public class Exercise_06 {

	public static void main(String[] args) {
		double r = 40;

		// 1st point
		double angle = Math.random() * 360;
		double x1 = r * Math.cos(Math.toRadians(angle));
		double y1 = r * Math.sin(Math.toRadians(angle));
		System.out.println("Three random points are ");
		System.out.println("(" + x1 + ", " + y1 + ")"+ " angle in degrees : " + angle);

		// 2nd point
		angle = Math.random() * 360;
		double x2 = r * Math.cos(Math.toRadians(angle));
		double y2 = r * Math.sin(Math.toRadians(angle));
		System.out.println("(" + x2 + ", " + y2 + ")" + " angle in degrees : " + angle);

		// 3rd point
		angle = Math.random() * 360;
		double x3 = r * Math.cos(Math.toRadians(angle));
		double y3 = r * Math.sin(Math.toRadians(angle));
		System.out.println("(" + x3 + ", " + y3 + ")"+ " angle in degrees : " + angle);

		
	}
}

