package chapter_07;

import java.util.*;

// Eliminate duplicates
public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] list=new int[10];
        System.out.println("Enter ten integer numbers: ");
        for(int i=0;i< list.length;i++){
            list[i]=input.nextInt();
        }

        int []eleminatedDuplicatesList=eleminatesDuplicates(list);
        System.out.println("New list eleminated dublicates is :");
        for(int i=0;i< eleminatedDuplicatesList.length;i++){
            System.out.print(eleminatedDuplicatesList[i]+" ");
        }


    }
    public static boolean findDuplicates(int list, int []eleminatedList){


            for(int k=0;k< eleminatedList.length;k++){
                if(list==eleminatedList[k]){
                    return false;

                }
            }
        return true;

    }
    public static int[] eleminatesDuplicates(int[]list){
        int [] eleminatedList=new int[list.length];
        int  j=0;
        for(int i=0;i< list.length;i++) {
            if (findDuplicates(list[i], eleminatedList)) {
                eleminatedList[j]=list[i];
                j++;
            }
        }
        eleminatedList=Arrays.copyOf(eleminatedList,j); //rearrange array length.Because i do not want to print 0s.
        return eleminatedList;
    }
}
