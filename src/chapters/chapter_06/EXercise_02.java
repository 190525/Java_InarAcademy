import java.util.*;

public class Exercise_02 {
    //Sum the digits in an integer
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number you want to sum of its digit");
       int number=input.nextInt();
        System.out.println("Sum of numbers digit is "+sumDigits(number));

    }
    public static int sumDigits(long n){
        int sum=0;
        while( n>0){
           long digit=n%10;
           n=n/10;
            sum+=digit;
        }
        return sum;
    }
}

