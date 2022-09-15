package chapters.chapter_05;
// Reverse a string
import java.util.*;
public class Exercise_46 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a string you want  to reverse :");
		String str=input.nextLine();
		String reversedStr="";
		int  length=str.length();
		for(int i=length-1;i>=0;i--) {
			char letter=str.charAt(i);
			reversedStr=reversedStr+letter;
		}
		System.out.println("The reversed string :"+reversedStr);

	}

}

