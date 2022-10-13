package chapter_07;

import java.util.Scanner;

// Computing gcd
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []numbers=new int[5];
        System.out.println("enter five integer: ");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        System.out.println("GCD of entered five integers is "+gcd(numbers));

    }
    public static int gcd(int... numbers){
        int min=numbers[0];
        int gcd=1;

        for(int i=1;i<numbers.length;i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        for(int i=0;i<numbers.length;i++) {

            for (int j = 2; j <= min; j++) {
                boolean isGcd=true;
                if (numbers[i] % j != 0) {
                    isGcd = false;
                }
                if (isGcd) {
                    gcd = j;
                }
            }

        }
        return gcd;
    }

}
