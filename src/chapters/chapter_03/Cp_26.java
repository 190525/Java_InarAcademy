package chapters.chapter_03;
// boolean expression(weight- height)
import java.util.Scanner;

public class Cp_26 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter weight in pouds :");
		int weight=input.nextInt();
		System.out.println("Enter weight height in inches :");
		int height=input.nextInt();
		if(weight>50 && height>8) {
			System.out.println(weight>50 && height>60);
		}
		else
			System.out.println(weight>50 && height>60);

}
}

