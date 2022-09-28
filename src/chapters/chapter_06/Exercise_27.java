public class Exercise_27 {
    //Emirp
    public static void main(String[] args) {
        final int NUMBER_OF_PALINDROMIC_PRIME = 100;
        final int NUMBER_OF_PALINDROMIC_NUMBER_PER_LINE = 10;
        int count = 0; //which use to find number of emirp number after every step
        int number = 10; //the smallest value of emirp number must consist of two digit
         // which use to determine reversal number whether  prime or not.

        while (count <= NUMBER_OF_PALINDROMIC_PRIME) {
            int reversedNumber=reversedNumber(number);
            if(number==reversedNumber){//if number and reversed number are identical,it must be ignored according to example output at question
                number++;
                continue;
            }

            if(isPrime(number)&&isPrime(reversedNumber)){

                System.out.print(number+" ");
                count++;
                if(count%NUMBER_OF_PALINDROMIC_NUMBER_PER_LINE==0){
                    System.out.println();
                }
            }
            number++;
        }

    }

    public static boolean isPrime(int number) {
        // method which use to determine number is prime or not
        int i = 2; // the smallest number to check prime number
        for (i = 2; i < number; i++) {
            if (number % i == 0) {

                return false;
            }


        }
        return true;

    }

    public static int reversedNumber(int number) {
        // method which use to find reversal of number
        String str = "";
        String number1 = String.valueOf(number);
        int length = number1.length();
        for (int i = length-1; i>=0; i--) {
            char ch = number1.charAt(i);
            str+=ch;

        }
        number=Integer.parseInt(str);
        return number;
    }
}

