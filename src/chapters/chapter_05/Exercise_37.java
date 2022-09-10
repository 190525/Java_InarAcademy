package chapters.chapter_05;
// decimal convert to binary value
import java.util.*;
public class Exercise_37 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a decimal integer  to you want to covert binary value.");
		int number=input.nextInt();
		String binaryNumber="";
		while(number>0) {
			int binary=number%2;
			String binary1=String.valueOf(binary);
			number=number/2;
			binaryNumber=binary1+binaryNumber;
		}
		System.out.println(binaryNumber);
		
	}

}

