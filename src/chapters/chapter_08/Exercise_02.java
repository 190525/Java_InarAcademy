package chapters.chapter_08;

import java.util.Scanner;

// Sum the major diagonal in a matrix
public class Exercise_02 {
    public static void main(String[] args) {
        double[][] array=new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        array=getArray(array);
        System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(array));


    }
    public static double[][] getArray(double[][] array){
        Scanner input=new Scanner(System.in);
        for(int row=0;row<array.length;row++){
            for (int column=0;column<array[row].length;column++){
                array[row][column]=input.nextDouble();
            }
        }
        return array;
    }
    public static double sumMajorDiagonal(double[][] m){
        double sumMajorDiagonal=0;
        for(int row=0;row<m.length;row++){
            for (int column=0;column<m[row].length;column++){
                if(row==column){
                    sumMajorDiagonal+=m[row][column];

                }
            }
        }
        return sumMajorDiagonal;

    }


}

