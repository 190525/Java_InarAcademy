package chapters.chapter_05;
// Conversion from miles to kilometers
public class Exercise_06 {

	public static void main(String[] args) {
		System.out.println("    Miles\tKilometers"+"    |   Kilometers   Miles");
		System.out.println();
		for(double miles=1,kilometer=1;miles<20;miles++,kilometer++) {
			//kilograms convert to pounds
			double kilometers=1.609 *miles*10000;
			kilometers=(int)(kilometers)/10000.0;
			//pounds convert to kilograms
			double mile=kilometer*1.609*10000;
			mile=(int)(mile)/10000.;
			 
			
			System.out.printf("%8.2f    ",miles);
			System.out.printf("%8.2f    ",kilometers);
			System.out.print("      |");
			System.out.printf("%8.2f     ",kilometer);
			System.out.printf("%8.2f      \n",mile);
			
		}

	}

}

