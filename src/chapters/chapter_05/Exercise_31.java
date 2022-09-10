package chapters.chapter_05;
// Financial application: compute CD value
import java.util.*;
public class Exercise_31 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the initial deposit amount :");
		double cdValue = input.nextDouble();
		System.out.println("Enter the  annual percentage yield (e.g., 5 for %5) :");
		double annualPercentageYield = input.nextDouble();
		System.out.println("Enter the number of months :");
		int month = input.nextInt();
		double monthlyPercentageRate = annualPercentageYield / 1200;
		
		int monthsNumber = 1;
		System.out.println("Month\t\tCD Value");
		System.out.println();
		while(monthsNumber<=month) {
			cdValue = cdValue  * (1 + monthlyPercentageRate);
			System.out.print(monthsNumber+"\t\t"+(int)(cdValue*1000)/1000.);
			System.out.println();
			monthsNumber++;
		}

	}

}

