package chapters.chapter_08;

import java.util.*;

public class ProcessingTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] matrix = new int[10][10];
        matrix= fillRandomValues(matrix);
        printTwoDimensionalArray(matrix);
        int[] sumOfColumns=sumColumns(matrix);
        printArray(sumOfColumns);
        System.out.println("index of max row is "+(indexOfMaxRow(matrix)+1));

        System.out.println("index of max row is "+(indexOfMaxColumn(matrix)+1));


    }
    public static int [][] fillRandomValues(int [][]array){
        final int MAX_VALUE=100;
        for(int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]=(int)(Math.random()*MAX_VALUE);
            }
        }
        return array;

    }
    public static int [] sumColumns(int [][] array){
        int[] sumColumns=new int[array[0].length];
        for( int i=0;i<array[0].length;i++){
            for(int j=0;j< array.length;j++){
                sumColumns[i]=array[j][i];
            }
        }
        return sumColumns;
    }

    public static int indexOfMaxRow(int [][]array){
        int maxRow= Integer.MIN_VALUE;
        int indexOfMaxRow=-1;
        for(int i=0;i<array.length;i++){
            int totalOfRow=Integer.MIN_VALUE;
            for(int j=0;j<array[0].length;j++){
                totalOfRow+=array[i][j];
                if(totalOfRow>maxRow){
                    maxRow=totalOfRow;
                    indexOfMaxRow=i;                }

            }
        }
        return indexOfMaxRow;
    }
    public static int indexOfMaxColumn(int[][]array){
        int maxOfColumn=Integer.MIN_VALUE;
        int indexOfMaxColumn=-1;
        for(int i=0;i<array[0].length;i++){
            int totalOfColumn=Integer.MIN_VALUE;
            for (int j=0;j<array.length;j++){
                totalOfColumn+=array[j][i];
                if(totalOfColumn>maxOfColumn){
                    maxOfColumn=totalOfColumn;
                    indexOfMaxColumn=i;
                }
            }
        }
        return indexOfMaxColumn;

    }
    public static void printTwoDimensionalArray(int [][]array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.printf("%4d",array[i][j]);
            }
            System.out.println();
        }
    }
    public static void printArray(int []array){
        for(int j=0;j<array.length;j++){
            System.out.printf("%4d",array[j]);
        }
        System.out.println();
    }

    }




