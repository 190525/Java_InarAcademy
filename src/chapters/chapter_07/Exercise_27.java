package chapter_07;
// Identical arrays

import java.util.Scanner;

public class Exercise_27 {
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
        list1=sortList(list1);
        list2=sortList(list2);

        if(equals(list1,list2)){
            System.out.println("Two lists are  identical");
        }else {
            System.out.println("Two lists are not  identical");

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
    public static int [] sortList(int[] list1){
        for(int i=0;i< list1.length;i++){
            for(int j=0;j< list1.length;j++){
                if(list1[i]>list1[j]){
                    int temp=list1[i];
                    list1[i]=list1[j];
                    list1[j]=temp;
                }
            }
        }
        return list1;
    }
}




