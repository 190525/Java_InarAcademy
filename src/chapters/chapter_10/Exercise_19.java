
import java.math.BigInteger;

// Mersenne Prime
public class Exercise_19 {
    public static void main(String[] args) {

        System.out.print("p     2^p - 1");

        int numberOfMersenne=0;

        for(int i=2;numberOfMersenne<=100;i++){
            if (isPrime(i)) {
                System.out.print("\n" + i + "     " + isMersennePrime(i));
                System.out.println();
                numberOfMersenne++;
            }
        }
    }
    public static boolean isPrime(int n) {

        long square = (long) Math.sqrt(n);
        for (int i = 2; i <= square; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static BigInteger isMersennePrime( int i) {

        return new BigInteger(String.valueOf(2)).pow(i).subtract(BigInteger.ONE);
    }

}

