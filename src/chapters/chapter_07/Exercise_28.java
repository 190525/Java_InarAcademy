package chapter_07;

import java.util.Scanner;

// Math: combinations
public class Exercise_28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []numbers=new int[10];
        System.out.println("Enter ten integer numbers :");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        combination(numbers);

    }
    public static void combination(int[] numbers){
        for(int i=0;i< numbers.length;i++){
            for(int j=0;j< numbers.length;j++){
                System.out.print("("+numbers[i]+", "+numbers[j]+") ");
            }
            System.out.println();
        }
    }
}

