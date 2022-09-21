//Display an integer reversed
import java.util.*;
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number :");
        int number= input.nextInt();

        System.out.println("Reversed number is "+reverse(number));

    }


    public static int reverse(int number) {
        String number1=String.valueOf(number);
        int length=number1.length();
        String reversedNumber="";
        for(int i=0;i<length;i++) {
            char ch1 = number1.charAt((length-1)-i);
            reversedNumber+=ch1;
        }
        int numberReversed=Integer.parseInt(reversedNumber);

        return numberReversed;
    }
}
