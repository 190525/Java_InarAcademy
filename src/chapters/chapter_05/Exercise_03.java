package chapters.chapter_05;
// Conversion from kilograms to pounds
public class Exercise_03 {

	public static void main(String[] args) {
		System.out.println("Kilograms\t\tPounds");
		for(int kg=1;kg<200;kg++) {
			//kilograms convert to pounds
			double pounds=2.2 *kg*1000;
			 pounds=(int)(pounds)/1000.0;
			
			System.out.println(kg+"\t\t\t"+pounds);
			
		}

	}

}

