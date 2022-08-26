package chapters.chapter_03;
// Financials: currency exchange
import java.util.*;
public class Exercise_31 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the exchange rate from dollars to RMB:");
		double exchangeRate= input.nextDouble();
		System.out.println("Enter 0 to convert dollars to RMB and 1 to convert RBM to dollars");
		int number= input.nextInt();
		if(number==0) {
			System.out.println("Enter the dollars amount:");
			double dollars=input.nextDouble();
			double rbm =dollars * exchangeRate;
			System.out.println(dollars + " equal to RBM "+rbm);
			
		}
		else if(number==1) {
			System.out.println("Enter the RBMs amount:");
			double rbm=input.nextDouble();
			double dollars =rbm / exchangeRate;
			System.out.println(rbm + " equal to dollars "+dollars);
			
		}
		else {
			System.out.println("you entered wrong number");
		}
		
	}

}

