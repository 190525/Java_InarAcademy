package chapters.chapter_08;

import java.util.Scanner;

// Explore matrix
public class Exercise_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size for the matrix: ");
        int size= input.nextInt();
        int [][]array=new int[size][size];

        fillArrayWith0s1s(array);
        printArray(array);
        checkRows(array,size);
        checkColumns(array,size);
        checkMajorDiagonal(array,size);
        checkSubDiagonal(array,size);

    }

    public static int[][] fillArrayWith0s1s(int[][] array) {
        for(int row=0;row< array.length;row++){
            for (int column=0;column<array[row].length;column++){
                array[row][column]=(int)(Math.random()*2);
            }
        }
        return array;
    }
    public static void printArray(int[][] array) {
        for(int row=0;row< array.length;row++){
            for (int column=0;column<array[row].length;column++){
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }

    }
    public static void checkRows(int[][] array,int size) {
        int printCount=0;

        for(int row=0;row< array.length;row++){
            int zerosCount=0;
            int onesCount=0;
            for (int column=0;column<array[row].length;column++){

                if(array[row][column]==0){
                    zerosCount++;
                }
                if(array[row][column]==1){
                   onesCount++;
                }
            }
                if(zerosCount==size){
                System.out.println("All 0s on row "+row);
                printCount++;
                }
                if(onesCount==size){
                System.out.println("All 1s on row "+row);
                printCount++;

                }
        }
                if(printCount==0){
                System.out.println("No same number on a row");
                }

    }
    public static void checkColumns(int[][] array,int size) {
        int printCount=0;

        for(int column=0;column< array.length;column++){
            int zerosCount=0;
            int onesCount=0;
            for (int row=0;row<array[column].length;row++) {

                if (array[row][column] == 0) {
                    zerosCount++;
                }
                if (array[row][column] == 1) {
                    onesCount++;
                }
            }

            if(zerosCount==size){
                System.out.println("All 0s on column "+column);
                printCount++;
            }
            if(onesCount==size){
                System.out.println("All 1s on column "+column);
                printCount++;

            }
        }
        if(printCount==0){
            System.out.println("No same number on a column");
        }

    }
    public static void checkMajorDiagonal(int[][] array,int size) {
        int printCount=0;
        int zerosCount=0;
        int onesCount=0;
        for(int row=0;row< array.length;row++){
                   if (array[row][row] == 0) {
                        zerosCount++;                     }
                    if (array[row][row] == 1) {
                        onesCount++;
                    }
            if(zerosCount==size){
                System.out.println("All 0s on major diagoanal ");
                printCount++;
            }
            if(onesCount==size){
                System.out.println("All 1s  major diagoanal");
                printCount++;

            }
        }
        if(printCount==0){
            System.out.println("No same number on a major diagonal");
        }

    }
    public static void checkSubDiagonal(int[][] array,int size) {
        int printCount=0;
        int zerosCount=0;
        int onesCount=0;
        for(int row=0;row< array.length;row++){

            if (array[row][size-1-row] == 0) {
                zerosCount++;
            }
            if (array[row][size-1-row] == 1) {
                onesCount++;

            }
            if(zerosCount==size){
                System.out.println("All 0s on sub diagonal ");
                printCount++;
            }
            if(onesCount==size){
                System.out.println("All 1s on sub diagonal");
                printCount++;

            }
        }
        if(printCount==0){
            System.out.println("No same number on a sub diagonal");
        }
    }


}

