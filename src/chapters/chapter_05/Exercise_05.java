package chapters.chapter_05;
// Conversion from kilograms to pounds and pounds to kilograms
public class Exercise_05 {

	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds"+"  |   Pounds\tKilograms");
		System.out.println();
		for(double kg=1,pound=1;kg<200;kg++,pound++) {
			//kilograms convert to pounds
			double pounds=2.2 *kg*10000;
			pounds=(int)(pounds)/10000.0;
			//pounds convert to kilograms
			double kgs=pound*2.2*10000;
			kgs=(int)(kgs)/10000.;
			 
			
			System.out.printf("%8.2f    ",kg);
			System.out.printf("%8.2f    ",pounds);
			System.out.print("|");
			System.out.printf("%8.2f     ",pound);
			System.out.printf("%8.2f    \n",kgs);
			
		}

	}

}

