package chapter_07;

import java.util.Scanner;

//Strictly identical arrays
public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter list1 elements(first input indicate number of element)");
        int lengthOfList1= input.nextInt();
        int[]list1=new int[lengthOfList1];
        for(int i=0;i<lengthOfList1;i++){
            list1[i]=input.nextInt();
        }

        System.out.println("Enter list2 elements(first input indicate number of element)");
        int lengthOfList2= input.nextInt();
        int[]list2=new int[lengthOfList2];
        for(int i=0;i<lengthOfList2;i++){
            list2[i]=input.nextInt();
        }

        if(equals(list1,list2)){
            System.out.println("Two lists are strictly identical");
        }else {
            System.out.println("Two lists are not strictly identical");

        }

    }
    public static boolean equals(int[] list1, int[] list2){
        for(int i=0;i< list1.length;i++){
            if(list1[i]!=list2[i]){
                return false;
            }
        }
        return true;

    }
}

