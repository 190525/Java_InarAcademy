package chapters.chapter_05;

// Simulation : head or tail
public class Exercise_40 {

	public static void main(String[] args) {
		int headCounter = 0;
		int tailCounter = 0;
		for (int i = 0; i < 1000000; i++) {
			int number = (int) (Math.random() * 2); // generate 0 or 1
			if (number == 0) {
				headCounter++;
			} else {
				tailCounter++;
			}

		}System.out.println("Number of heads :"+headCounter+"\nNumber of tails :"+tailCounter);
	}

}

