package chapter_07;

import java.util.Scanner;

// Find the index of the smallest element
public class Exercise_10 {
    public static void main(String[] args) {


    Scanner input =new Scanner(System.in);
    double[] numbers=new double[10];
         System.out.println("Enter ten double vaules yo want the smallest element");
         for(int i=0;i<numbers.length;i++){
        numbers[i]=input.nextDouble();
    }
        System.out.println("The index of the smallest number in the array is "+ indexOfSmallestElement(numbers));

}

    public static int indexOfSmallestElement(double[] array){
        double min=array[0];
        int index=0;

        for(int i=1;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
                index=i;
            }
        }
        return index;
    }

}


