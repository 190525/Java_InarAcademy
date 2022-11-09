import java.math.BigInteger;

public class Listing_09 {
    public static void main(String[] args) {
        System.out.println("50! is: " + factorial(50));
    }

    public static BigInteger factorial(long factorial) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= factorial; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}

