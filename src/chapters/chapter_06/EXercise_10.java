public class Exercise_10 {
    //Use the isPrime Method
    public static void main(String[] args) {
        final int MAX_NUMBER_OF_PRIME_NUMBER=10000;
        int count=0; //counter used to decide when to move to the next line
        for(int i=2;i<=MAX_NUMBER_OF_PRIME_NUMBER;i++) {
            if (isPrime(i)) {
                System.out.printf("%6d",i);
                count++;
                if(count%10==0){
                    System.out.println();
                }
            }
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
}

