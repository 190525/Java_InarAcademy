package chapters.chapter_08;

import java.util.Scanner;

// Game: find the flipped cell
public class Exercise_23 {
    public static void main(String[] args) {

            final int NUMBER_OF_ROW=6;
            final int NUMBER_OF_COLUMN=6;
            int [][]matrix=new int[NUMBER_OF_ROW][NUMBER_OF_COLUMN];
            matrix=getMatrixWith0sAnd1s(matrix);
            if(checkRow(matrix)!=-1 && checkColumn(matrix)!=-1){
                System.out.println("The flipped cell is at ("+checkRow(matrix)+", "+checkColumn(matrix)+")");
            }
    }

    public static int[][] getMatrixWith0sAnd1s(int[][] matrix) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row:");
        for(int row=0;row< matrix.length;row++){
            for (int col=0;col<matrix[row].length;col++){
                matrix[row][col]=input.nextInt();
            }
        }
        return matrix;
    }
    public static int checkRow( int [][]matrix){
    int zerosCount=0;
    int onesCount=0;
        for(int row=0;row< matrix.length;row++) {
             zerosCount=0;
             onesCount=0;
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col]==1){
                    onesCount++;
                }
                else{
                   zerosCount++;
                }
            }
            if(onesCount%2!=0||zerosCount%2!=0){
		    return row;
            }
        }

          return -1;
        }
    public static int checkColumn( int [][]matrix){
        int zerosCount=0;
        int onesCount=0;
        for(int row=0;row< matrix.length;row++) {
            zerosCount=0;
            onesCount=0;
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[col][row]==1){
                    onesCount++;
                }
                else{
                    zerosCount++;
                }
            }
            if(onesCount%2!=0||zerosCount%2!=0){
                return row;
            }
        }

        return -1;
    }


}

