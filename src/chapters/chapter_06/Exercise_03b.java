import java.util.*;

public class Exercise_03b {
    //Palindrome integer with two method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you want to number is palindrome or not");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Entered number is a palindrome");
        } else {
            System.out.println("Entered number is not a palindrome");
        }
    }

    // Return the reversal of an integer, i.e., reverse(456) returns 654
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
    //Return true if number is a palindrome
    public static boolean isPalindrome(int number){
        String n1 = String.valueOf(number);
        String n2 = String.valueOf(reverse(number));
        if(n1.equals(n2)){
            return true;
        }
        else{
            return false;
        }


        }

    }


