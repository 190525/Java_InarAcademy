package chapter_07;
// PrimeNumber
public class Exercise_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME_NUMBER=50;
        int []primeNumber=new int[NUMBER_OF_PRIME_NUMBER];
        int count=0;
        int number=2;
        while(count<NUMBER_OF_PRIME_NUMBER){
            if(isPrimesqrt(number)){
                primeNumber[count]=number;
                count++;
            }
            number ++;
        }
        for(int i=0;i< primeNumber.length;i++){
            System.out.print(primeNumber[i]+" ");
        }
    }

    public static boolean isPrimesqrt(int number) {
        for(int i=2;i<=number;i++){
            if(isPrime(i) && Math.pow(i,2)<=number){
                return true;
            }

        }
        return false;
    }

    public static boolean isPrime(int i) {
        for(int j=2;j<=i;j++){
            if(i%j!=0){
                return true;
            }
        }
        return false;
    }

}

