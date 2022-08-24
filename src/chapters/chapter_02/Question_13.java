package chapters.chapter_02;
//CompoundValue
import java.util.*;
public class Question_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();
		final double ANNUAL_INTEREST_RATE = 3.75 / 100;
		final double MONTLY_INTEREST_RATE = ANNUAL_INTEREST_RATE / 12;
		
		double accountValue1 = savingAmount*(1+MONTLY_INTEREST_RATE);
		System.out.println("After the first month, the account value is " + accountValue1);
		double accountValue2 = (savingAmount+accountValue1)*(1+MONTLY_INTEREST_RATE);
		System.out.println("After the first month, the account value is " + accountValue2);
		double accountValue3 = (savingAmount+accountValue2)*(1+MONTLY_INTEREST_RATE);
		System.out.println("After the first month, the account value is " + accountValue3);
		double accountValue4 = (savingAmount+accountValue3)*(1+MONTLY_INTEREST_RATE);
		System.out.println("After the first month, the account value is " + accountValue4);
		double accountValue5 = (savingAmount+accountValue4)*(1+MONTLY_INTEREST_RATE);
		System.out.println("After the first month, the account value is " + accountValue5);
		double accountValue6 =(savingAmount+ accountValue5)*(1+MONTLY_INTEREST_RATE);
		System.out.println("After the first month, the account value is " + accountValue6);
		
		
		
	}

}

