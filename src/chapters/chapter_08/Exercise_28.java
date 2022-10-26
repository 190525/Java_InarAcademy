package chapters.chapter_08;

import java.util.Scanner;

// Strictly identical arrays
public class Exercise_28 {
    public static void main(String[] args) {
        final int NUMBER_OF_ROW = 3;
        final int NUMBER_OF_COLUMN = 3;
        int[][] array1 = new int[NUMBER_OF_ROW][NUMBER_OF_COLUMN];
        int[][] array2 = new int[NUMBER_OF_ROW][NUMBER_OF_COLUMN];

        System.out.println("Enter list1:");
        array1=getArray(array1);

        System.out.println("Enter list2:");
        array2=getArray(array2);

        if(equals(array1,array2)){
            System.out.println("The two arrays are strictly identical");
        }
        else{
            System.out.println("The two arrays are not strictly identical");
        }

    }
    public static int[][] getArray(int[][] array){
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextInt();

            }
        }
        return array;

    }
    public static boolean equals(int[][] array1, int[][] array2){
        for (int row = 0; row < array1.length; row++) {
            for (int col = 0; col < array1[row].length; col++) {
                if(array1[row][col] !=array2[row][col]){
                        return false;
                }

            }
        }
        return true;
    }

}

