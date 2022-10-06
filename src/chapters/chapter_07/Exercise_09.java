package chapter_07;

import java.util.Scanner;

// Find the smallest element
public class Exercise_09 {
     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         double[] numbers=new double[10];
         System.out.println("Enter ten double vaules yo want the smallest element");
         for(int i=0;i<numbers.length;i++){
             numbers[i]=input.nextDouble();
         }
         double min=min(numbers);
         System.out.println("The smallest number in the array is "+min);


     }
     public static double min(double[] array){
        double min=array[0];

         for(int i=1;i<array.length;i++){
           if(min>array[i]){
               min=array[i];
           }
         }
         return min;
     }
}

