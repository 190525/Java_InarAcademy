package chapter_07;

import java.util.Scanner;

// (Sorted?)method that returns true if the list is already sorted in increasing order
public class Exercise_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter list(first number indicates the number of the elements in the list ");
        //the first number in the input indicates the number of the elements in the list.This number is not part of the list.
        int numberOfElementsInList= input.nextInt();
        int []list=new int[numberOfElementsInList];
        list[0]=numberOfElementsInList;

        for(int i=1;i<numberOfElementsInList;i++){
            list[i]= input.nextInt();
        }
        if(isSorted(list)){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSorted(int[] list) {
        for(int i=1;i< list.length-1;i++){
            if(list[i]>list[i+1]){ // equality is ignored at example output
                return false;
            }
        }
        return true;
    }
}
