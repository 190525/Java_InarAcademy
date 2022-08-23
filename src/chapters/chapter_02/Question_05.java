package chapters.chapter_02;
//CalculateTips
import java.util.*;
public class Question_05 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter your subtotal and the gratuity rate: ");

        double subTotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subTotal * (gratuityRate / 100);

        double total = subTotal + gratuity;

        System.out.println("The gratuity is: $" +(int)(gratuity*1000) / 1000.0 );
        
        System.out.println("Total is: $" + total);


	}
}

