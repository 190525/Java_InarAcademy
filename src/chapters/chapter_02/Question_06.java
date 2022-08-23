package chapters.chapter_02;
//MultiplicationDigitsİnİntegers
import java.util.*;

public class Question_06 {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
  System.out.println("Enter a number between 0 and 1000:");
    int  number = input.nextInt();
    int onesDigits = number % 10;
    int temporaryNumber = number / 10; 
    int tensDigits = temporaryNumber % 10;
    int  hundredsDigits = temporaryNumber / 10;
    int multiplication = onesDigits * tensDigits * hundredsDigits; 
  System.out.println("The multiplication of all digits in " +number+" is " + multiplication  );
  
  }

}

