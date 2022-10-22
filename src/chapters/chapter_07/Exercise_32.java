package chapters.chapter_07;
import java.util.Scanner;
// Partition of a list
public class Exercise_32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter list elements(first input indicate number of element)");
        int lengthOfList= input.nextInt();
        int[]list=new int[lengthOfList];
        for(int i=0;i<lengthOfList;i++){
            list[i]=input.nextInt();
        }
        list=partition(list);
        printarray(list);
    }



    public static int[] partition(int[] list){
        int pivot = list[0];
        int pivotIndex = 0;
        int lastIndex = list.length-1;

        while(pivotIndex < lastIndex) {

            if(pivot>list[pivotIndex+1]) {
                //Elements smaller than pivot are sent to the first element of the list. After this operation, pivot index is increased by one.
                list[pivotIndex] = list[pivotIndex+1];
                list[pivotIndex+1] = pivot;
                pivotIndex++;
            } else {
                //Elements greater than pivot are sent to the end of the list. After this operation, lastIndex is reduced by one.
                int temp = list[lastIndex];
                list[lastIndex]=list[pivotIndex+1];
                list[pivotIndex+1] = temp;
                lastIndex--;
            }
        }

        return list;
    }
    public static void printarray(int[] list) {
        for(int i=0;i< list.length;i++){
            System.out.print(list[i]+" ");
        }
    }


}
