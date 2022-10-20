package chapters.chapter_08;

import java.util.Scanner;

// Algebra: multiply two matrices
public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double[][]firstMatrix=new double[3][3];
        double[][]secondMatrix=new double[3][3];
        System.out.println("enter first 3x3 matrix elements: ");
        for(int i=0;i< firstMatrix.length;i++){
            for(int j=0;j< firstMatrix[i].length;j++){
                firstMatrix[i][j]=input.nextDouble();
            }
        }
        System.out.println("enter second 3x3 matrix elements: ");
        for(int i=0;i< secondMatrix.length;i++){
            for(int j=0;j< secondMatrix[i].length;j++){
                secondMatrix[i][j]=input.nextDouble();
            }
        }
        double[][] multipliedMatrix=multiplyMatrix(firstMatrix,secondMatrix);
        printMatrix(multipliedMatrix);


    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] multipliedMatrix=new double[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    multipliedMatrix[i][j] +=a[i][k]*b[k][j];
                }
            }

        }
        return multipliedMatrix;

    }
    public static void printMatrix(double[][] addedMatrix) {
        for(int row=0;row<addedMatrix.length;row++){
            for(int column=0;column<addedMatrix[row].length;column++){
                System.out.printf("%.2f ",addedMatrix[row][column]);

            }
            System.out.println();
        }
    }
}

