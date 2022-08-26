package chapters.chapter_03;
// boolean expression with if
import java.util.*;
public class Cp_25 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter age :");
		int age=input.nextInt();
		if(age>13 && age<18) {
			System.out.println(age>13 && age<18);
		}
		else 
		System.out.println(age>13 && age<18);
	}
	

}

