package chapters.chapter_05;

//Financial application: find the sales amount
import java.util.*;

public class Exercise_39 {

	public static void main(String[] args) {
		final double TARGET = 30000;
		double comission = 0;
		double sales = 0;

		while (comission < TARGET) {

			comission = 0;
			if (sales > 0) {
				if (sales > 5000) {
					comission += 5000 * 0.08;
				} else {
					comission += sales * 0.08;
				}

			}
			if (sales > 5000) {
				if (sales > 0000) {
					comission += 5000 * 0.1;
				} else {
					comission += (sales - 5000) * 0.1;
				}

			}
			if (sales > 10000) {
				comission += ((sales - 10000) * 0.12);

			}

			sales += 0.01;

		}

		System.out.printf("Sales required to earn $30,000 of commission is $%.3f", sales);
	}

}

