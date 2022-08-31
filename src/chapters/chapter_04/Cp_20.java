package chapters.chapter_04;

// String Comparison
public class Cp_20 {

	public static void main(String[] args) {

		String s1 = " Welcome ";
		String s2 = " welcome ";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		int x = s1.compareTo(s2);
		System.out.println(x);

		x = s1.compareToIgnoreCase(s2);
		System.out.println(x);

		boolean b = s1.startsWith("AAA");
		System.out.println(b);

		b = s1.endsWith("AAA");
		System.out.println(b);

		x = s1.length();
		System.out.println(x);

		char y = s1.charAt(0);
		System.out.println(y);

		String s3 = s1 + s2;
		System.out.println(s3);

		String sub = s1.substring(1);
		System.out.println(sub);

		sub = s1.substring(1, 4);
		System.out.println(sub);

		s3 = s1.toLowerCase();
		System.out.println(s3);

		s3 = s1.toUpperCase();
		System.out.println(s3);

		s3 = s1.trim();
		System.out.println(s3);

		x = s1.indexOf('e');
		System.out.println(x);

		x = s1.lastIndexOf("abc");
		System.out.println(x);

	}

}

