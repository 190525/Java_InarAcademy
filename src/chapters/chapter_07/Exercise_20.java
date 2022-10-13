package chapter_07;

import java.util.Scanner;

// Revise selection sort
// finding the largest number and swapping it with the last
// a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
public class Exercise_20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double []numbers=new double[10];

        System.out.println("Enter ten double number :");
        for ( int i=0;i<numbers.length;i++){
            numbers[i]=input.nextDouble();
        }
        double []sortedArray=selectionSort(numbers);
        printArray(sortedArray);

    }

    public static double[] selectionSort(double[] numbers) {
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j< numbers.length;j++) {
                if (numbers[i] < numbers[j]) {
                    double temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers;
    }
    public static void printArray(double[] array){
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
