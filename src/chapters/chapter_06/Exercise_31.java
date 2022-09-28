import java.util.Scanner;

public class Exercise_31 {
    /* Financial: credit card number validation
     Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with:
   4 for Visa cards
   5 for Master cards
   37 for American Express cards
   6 for Discover cards
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  credit card number you want to check whether it is valid or not");
        long cardNumber=input.nextLong();
        if(isValid(cardNumber)){
            System.out.println("Entered card number which is "+cardNumber+" is valid");
        }else {
            System.out.println("Entered card number which is " + cardNumber + " is not valid");
        }

    }
    /** Return true if the card number is valid */
    public static boolean isValid(long number){
        String s = String.valueOf(number);
        if (s.length() < 13 || s.length() > 16) { // A credit card number must have between 13 and 16 digits
            return false;
        }
        else if (prefixMatched(number, 4) || prefixMatched(number, 6) || prefixMatched(number, 5) || prefixMatched(number, 37)) {
            int sumOfEven = sumOfDoubleEvenPlace(number);
            int sumOfOdd = sumOfOddPlace(number);
            int sumOfAllDigits = sumOfEven + sumOfOdd;
            if(sumOfAllDigits % 10 == 0){
                return true;
            }if(sumOfAllDigits % 10 != 0){
                return false;
            }

        }
        return false;
    }
    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number){
        int sum = 0;
        String sNumber = String.valueOf(number);
        int length=sNumber.length();
        for (int i = length- 2; i >= 0; i -= 2) {
            char ch=sNumber.charAt(i);
            int digit =Integer.parseInt(String.valueOf(ch));
            int timesOfDigit=2*digit;
            if (getSize(timesOfDigit) > 1) {// if numbers have two digits
                int d1 = timesOfDigit % 10;
                int d2 = timesOfDigit/ 10;
                timesOfDigit=d1+d2;
            }

            sum += timesOfDigit;
        }
        return sum;

    }
    /** Return this number if it is a single digit, otherwise,return the sum of the two digits */
    public static int getDigit(int number){
        if (getSize(number) > 1) {
            int d1 = number % 10;
            int d2 = number / 10;
            return d1 + d2;
        }
        return number;

    }
    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number){
        int sum = 0;
        String sNumber = String.valueOf(number);
        int length=sNumber.length();
        for (int i = length- 1; i >= 0; i -= 2) {
            char ch=sNumber.charAt(i);
            int x =Integer.parseInt(String.valueOf(ch));
            sum += x;
        }
        return sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d){
        String str = String.valueOf(number);
        if (str.startsWith(String.valueOf(d))) {
            return true;
        }
        return false;
    }

    /** Return the number of digits in d */
    public static int getSize(long d){
        String str = String.valueOf(d);
        return str.length();

    }
    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k){
        String s = String.valueOf(number);
        return Long.parseLong(s.substring(0, k));
    }

}

