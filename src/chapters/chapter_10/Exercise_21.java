import java.math.BigDecimal;

// Divisible by 5 or 6
public class Exercise_21 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(Long.MAX_VALUE));
        BigDecimal[] numbers = new BigDecimal[10];
        int counter = 0;

        while (counter < 10) {
            // check if  number if divisible by 5 of 6
            BigDecimal remainder5 = bigDecimal.remainder(new BigDecimal(5));
            BigDecimal remainder6 = bigDecimal.remainder(new BigDecimal(6));
            if (remainder5.equals(BigDecimal.ZERO)) {
                numbers[counter] = bigDecimal;
                counter++;
            }
            else if (remainder6.equals(BigDecimal.ZERO)) {
                numbers[counter] =bigDecimal;
                counter++;
            }
            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }
        System.out.println("Maximum value of long number is "+Long.MAX_VALUE+"\n");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}

