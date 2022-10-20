package chapters.chapter_08;
// Algebra: add two matrices

import java.util.Scanner;

public class Exercise_05  {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[][]firstMatrix=new double[3][3];
        double[][]secondMatrix=new double[3][3];
        System.out.println("enter first matrix elements: ");
        for(int i=0;i< firstMatrix.length;i++){
            for(int j=0;j< firstMatrix[i].length;j++){
                firstMatrix[i][j]=input.nextDouble();
            }
        }
        System.out.println("enter second matrix elements: ");
        for(int i=0;i< secondMatrix.length;i++){
            for(int j=0;j< secondMatrix[i].length;j++){
                secondMatrix[i][j]=input.nextDouble();
            }
        }
        double [][]addedMatrix=addMatrix(firstMatrix,secondMatrix);
        System.out.println("Added matrix is:");
        printMatrix(addedMatrix);

    }



    public static double[][] addMatrix(double[][] a, double[][] b){
        double [][] addedMatrix=new double[a.length][a[0].length];

        for(int row=0;row<a.length;row++) {
            for (int column = 0; column < a[row].length; column++) {
                addedMatrix[row][column]=a[row][column]+b[row][column];

            }
        }
        return addedMatrix;
    }
    public static void printMatrix(double[][] addedMatrix) {
        for(int row=0;row<addedMatrix.length;row++){
            for(int column=0;column<addedMatrix[row].length;column++){
                System.out.print(addedMatrix[row][column]+" ");

            }
            System.out.println();
        }
    }
}

