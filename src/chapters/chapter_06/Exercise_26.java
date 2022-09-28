public class Exercise_26 {
    // Palindromic prime
    public static void main(String[] args) {
        final int NUMBER_OF_PALINDROMIC_PRIME=1000;
        final int NUMBER_OF_PALINDROMIC_NUMBER_PER_LINE=10;
        int count=0; //which use to find number of palindromic number after every step
        int number=2; //the smallest value of prime number
        while(count<=NUMBER_OF_PALINDROMIC_PRIME) {

            if (isPrime(number) && isPalindrome(number)){
                System.out.print(number +" ");
                count ++;
                if(count%NUMBER_OF_PALINDROMIC_NUMBER_PER_LINE==0){
                    System.out.println();
                }

            }
            number++;
        }

    }
    public static boolean isPalindrome(int number){
        // method which use to determine number is palindrome or not
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
    public static boolean isPrime(int number){
        // method which use to determine number is prime or not
        int i = 2; // the smallest number to check prime number
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;

    }
}

