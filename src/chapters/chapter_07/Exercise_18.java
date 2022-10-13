package chapter_07;
// Bubble sort(decreasing order)
//a test program that reads in ten double numbers, invokes the method, and displays the sorted numbers.
import java.util.Scanner;

public class Exercise_18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double []numbers= new double[10];
        System.out.println("Enter ten number :");
        for(int i=0;i<numbers.length;i++){
             numbers[i]=input.nextDouble();
        }
        double []sortedNumber=bubbleSort(numbers);
        printArray(sortedNumber);

    }



    public static double[] bubbleSort(double[] numbers) {
        for(int j=0;j< numbers.length;j++) {
            for (int i = 0; i < numbers.length - 1; i++) {

                if (numbers[i] < numbers[i + 1]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        return numbers;
    }
    public static void printArray(double[] sortedNumber) {
        for(int i=0;i< sortedNumber.length;i++){
            System.out.print(sortedNumber[i]+" ");
        }
    }
}
