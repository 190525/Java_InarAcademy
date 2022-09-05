package chapters.chapter_05;
// Convert miles to kilometers
public class Exercise_04 {

	public static void main(String[] args) {
		System.out.println("Miles\t\t\tKilometers");
		for(int miles=1;miles<10;miles++) {
			//miles convert to kilometers
			double kilometers=miles*1.609*1000;
			 kilometers=(int)(kilometers)/1000.0;
			
			System.out.println(miles+"\t\t\t"+kilometers);
			
		}
	}

}

