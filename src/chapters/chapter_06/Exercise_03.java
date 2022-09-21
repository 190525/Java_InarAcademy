import java.util.*;
public class Exercise_03 {
    //Palindrome integer with just one method(public static boolean isPalindrome(int number))
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number you want to number is palindrome or not");
        int number=input.nextInt();

       if(isPalindrome( number)){
           System.out.println("Entered number is palindrome.");
       }
       else{
           System.out.println("Entered number is not palindrome.");
       }

    }


    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number) {
        String number1=String.valueOf(number);
        int length=number1.length();
        String reversedNumber="";
        for(int i=0;i<length;i++) {
            char ch1 = number1.charAt(i);
            reversedNumber+=ch1;
        }
        int numberReversed=Integer.parseInt(reversedNumber);
        return numberReversed;


    }
    //Return true if number is a palindrome
     public static boolean isPalindrome(int number){
        String number1=String.valueOf(number);
         int length=number1.length();
         for(int i=0;i<length;i++){
             char ch1=number1.charAt(i);
             char ch2=number1.charAt((length-1)-i);
             if(ch1!=ch2) {
                 return false;
             }

         }
         return true;


    }
}
