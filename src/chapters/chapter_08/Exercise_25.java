package chapters.chapter_08;

import java.util.Scanner;

// Markov matrix
public class Exercise_25 {
    public static void main(String[] args) {
        final int NUMBER_OF_ROW=3;
        final int NUMBER_OF_COLUMN=3;
        double [][] markovMatrix=new double[NUMBER_OF_ROW][NUMBER_OF_COLUMN];
        if(isMarkovMatrix(markovMatrix)){
            System.out.println("It is a Markov matrix");
        }
        else{
            System.out.println("It is not a Markov matrix");
        }

    }

    public static double[][] getMatrix(double [][] markovMatrix){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for(int row=0;row< markovMatrix.length;row++){
            for (int col=0;col<markovMatrix[row].length;col++){
                markovMatrix[row][col]=input.nextDouble();

            }
        }
        return markovMatrix;

    }
    public static boolean isMarkovMatrix(double[][] matrix){
        matrix=getMatrix(matrix);
        if(isSummationOfColumnGreaterThanZero(matrix)&&isAllElementsInMatrixGreaterThanZero(matrix)){
            return true;
        }
        return false;

    }
    public static boolean isSummationOfColumnGreaterThanZero(double[][]markovMatrix){

        for(int row=0;row< markovMatrix.length;row++) {
            double sum=0;
            for (int col = 0; col < markovMatrix[row].length; col++) {
                sum+=markovMatrix[col][row];
            }
            if(sum!=1){
                return false;
            }
        }
        return true;

    }
    public static boolean isAllElementsInMatrixGreaterThanZero(double[][]markovMatrix){
        for(int row=0;row< markovMatrix.length;row++) {
            for (int col = 0; col < markovMatrix[row].length; col++) {
                if (0 >= markovMatrix[col][row]) {
                    return false;
                }

            }
        }
        return true;
    }

}


