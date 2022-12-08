 package set;

import java.util.HashSet;
import java.util.Set;

// PrimeNumber
public class Exercise_07_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME_NUMBER=50;
        Set<Integer>primeNumber=new HashSet<>();
        int count=0;
        int number=2;
        while(count<NUMBER_OF_PRIME_NUMBER){
            if(isPrimesqrt(number)){
                primeNumber.add(number);
                count++;
            }
            number ++;
        }
        int line=0;
        for(int i=0;i< primeNumber.size();i++){
            System.out.printf("%4d",primeNumber.toArray()[i]);
            line++;
            if(line%10==0){
                System.out.println();
            }
        }
    }

    public static boolean isPrimesqrt(int number) {
        for(int i=2;i<=(int)(Math.sqrt(number));i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }


}

