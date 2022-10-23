package chapters.chapter_08;

import java.util.Scanner;

// Locate the largest element
public class Exercise_13 {
    public static void main(String[] args){

    Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array: ");
        int rowNumber= input.nextInt();
        int columnNumber= input.nextInt();
        double [][]array=new double[rowNumber][columnNumber];
        array=getElementsOfArray(array);
        int[]positionArray=locateLargest(array);
        System.out.println("The location of the largest element is at ("+positionArray[0]+", "+positionArray[1]+")");
    }
    public static double [][] getElementsOfArray( double[][] array) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array elements");

        for(int row=0;row< array.length;row++){
            for (int column=0;column<array[row].length;column++){
                array[row][column]=input.nextInt();
            }
        }
        return array;
    }
    public static int[] locateLargest(double[][] array){
        int[]position=new int[2];
        double max=Double.MIN_VALUE;
        for(int row=0;row< array.length;row++) {
            for (int column = 0; column < array[row].length; column++) {
                if(array[row][column]>max){
                    position[0]=row;
                    position[1]=column;

                }

            }
        }
        return position;

    }

}

