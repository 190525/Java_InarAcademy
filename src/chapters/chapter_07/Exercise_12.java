package chapter_07;

import java.util.Scanner;

// Reverse an array
public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers you want to reverse");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double []reversedNumber=reverseArray(numbers);
        printReverseArray(reversedNumber);
    }

    public static double[] reverseArray(double[] numbers) {
        double [] reversedArray=new double[numbers.length];
        int j=0;
        for(int i=numbers.length-1;i>=0;i--){
            reversedArray[j]=numbers[i];
            j++;

        }
        return reversedArray;
    }
    public static void printReverseArray(double [] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


