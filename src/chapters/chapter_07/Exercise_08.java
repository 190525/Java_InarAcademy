package chapter_07;

import java.util.Scanner;

// Average an array
//prompts the user to enter ten double values, invokes this
//method, and displays the average value.
public class Exercise_08 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        double[]integer =new double[10];//  the user to enter ten double values
        int []number=new int[integer.length]; // double array copy to this with method
        System.out.println("Enter ten double numbers :");
        for(int i=0;i<integer.length;i++){
            integer[i]=input.nextDouble();
        }
        System.out.println("Average in terms of double number is :"+average(integer));

        number=doubleArrayCopyToIntegerArray(integer);
        System.out.println("Average in terms of integer number is :"+average(number));



    }public static int average(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        int average=sum/array.length;
       return average;

    }
    public static double average(double[] array){
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
       double average=sum/array.length;
        return average;
    }
    public static int[] doubleArrayCopyToIntegerArray(double[]array){
        int [] integerArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            integerArray[i]=(int)array[i];
        }
        return integerArray;

    }

}

