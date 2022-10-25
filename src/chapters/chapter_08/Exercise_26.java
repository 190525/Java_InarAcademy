package chapters.chapter_08;

import java.util.Scanner;

// Row sorting
public class Exercise_26 {
    public static void main(String[] args) {
        final int NUMBER_OF_ROW = 3;
        final int NUMBER_OF_COLUMN = 3;
        double[][] array = new double[NUMBER_OF_ROW][NUMBER_OF_COLUMN];
        array = getMatrix(array);
        array = sortRows(array);
        displayRowSortedArray(array);
    }

    public static double[][] getMatrix(double[][] array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextDouble();

            }
        }
        return array;

    }

    public static double[][] sortRows(double[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length-1; col++) {
                if (array[row][col] > array[row][col + 1]) {
                    double temp = array[row][col];
                    array[row][col] = array[row][col + 1];
                    array[row][col + 1] = temp;
                }
            }

        }
        return array;
    }
    public static void displayRowSortedArray(double[][] array){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }


    }
}

