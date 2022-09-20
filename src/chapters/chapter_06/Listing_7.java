public class Listing_7 {
    //PrimeNumberMethod
    public static void main(String[] args) {
        System.out.println("The first prime numbers are  ");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE=10;
        int count=0;
        int number=2;
        while(count<numberOfPrimes){
            if(isPrime(number)){
                if(count%NUMBER_OF_PRIMES_PER_LINE==0){
                    System.out.printf("\n%4d",number);
                }else
                System.out.printf("%4d",number);
                count++;
            }

            number++;
        }

    }

    public static boolean isPrime(int number) {
        for(int divisior=2;divisior<=number/2;divisior++){
            if(number%divisior==0){
                return false;
            }

        }return true;
    }
}

