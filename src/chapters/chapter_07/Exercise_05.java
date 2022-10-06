package chapter_07;

import java.util.Scanner;

// Print distinct numbers
public class Exercise_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double []distinctNumber=new double[10];
        System.out.println("Enter ten numbers");
        int j=0;// j will be used to index at distinctNumber array;
        for(int i=0;i< distinctNumber.length;i++){
           int number=input.nextInt();
           if(isDistinct(distinctNumber,number)){
               distinctNumber[j]=number;
               j++;
           }
        }
        // display distinctNumber Array
        System.out.print(" The distinct number are : ");
        for(int i=0;i< j;i++){
            System.out.print(distinctNumber[i]+" ");
        }


    }

    public static boolean isDistinct(double[] numbers, int number) {
        for(int i=0;i<numbers.length;i++){
            if(number ==numbers[i]){
                return false;
            }
        }
        return true;

    }

}

