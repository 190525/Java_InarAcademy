// Large prime numbers

import java.math.*;
public class Exercise_18 {
    public static void main(String[] args) {
        BigInteger number = BigInteger.valueOf((long) Math.sqrt(Long.MAX_VALUE));
        final int NUMBER_OF_PRIMES = 1;
        BigInteger[] numbers = new BigInteger[NUMBER_OF_PRIMES];
        int count = 0;
        while (count < NUMBER_OF_PRIMES) {
            number = number.add(new BigInteger("1"));
            if (isPrime(number)){
                count++;
                System.out.println(number);
            }

        }
    }
    public static boolean isPrime(BigInteger bigInteger) {
        for (BigInteger d = new BigInteger("2"); d.compareTo(bigInteger.divide(new BigInteger("2"))) <= 0; d = d.add(new BigInteger("1"))) {
            if (bigInteger.remainder(d).compareTo(new BigInteger("0")) == 0) {
                return false;
            }
        }
        return true;
    }
}

