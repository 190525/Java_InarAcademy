// Approximate e
import java.math.*;
public class Exercise_20 {
    public static void main(String[] args) {
        BigDecimal eValue = BigDecimal.valueOf(1.0);
        for (int i = 1; i <= 1000; i++) {
            BigDecimal numerator = BigDecimal.valueOf(1.0);
            BigDecimal denominator = new BigDecimal(factorial(i));
            BigDecimal result = numerator.divide(denominator,7);
            eValue = eValue.add(result);
            if (i % 100 == 0) {
                System.out.println(eValue);
            }
        }
    }

    public static BigInteger factorial(int number) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= number; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}

