package chapters.chapter_08;

import java.util.Scanner;

// Check Sudoku Solution
public class Listing_04 {
    public static void main(String[] args) {

        System.out.println("Enter your's sudoku solution: " );
        int [][] grid=getSolution();
        if(isValidNumbers(grid)){
            for(int i=0;i< grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    if(!(isUniqueInRow(i,j,grid))&&(isUniqueInColumn(i,j,grid))&&(isUniqueInSmallBox(i,j,grid))){
                        System.out.println("Invalid solution");

                    }
                }
            }
            System.out.println("Valid solution");
        }else{
            System.out.println("Invalid solution");
        }

    }

   public static int[][] getSolution() {
       Scanner input=new Scanner(System.in);
       int[][] grid = new int[9][9];

       for(int i=0;i< grid.length;i++){
           for(int j=0;j<grid[i].length;j++){
               grid[i][j]=input.nextInt();
           }
       }
       return grid;
    }
    public static boolean isValidNumbers(int[][]grid){
        for( int i=0;i< grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if(grid[i][j]<1||grid[i][j]>9){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isUniqueInRow(int i, int j, int[][] grid) {
        for(int column=0;column< grid.length;column++){
            if(column!=j&& grid[i][column]==grid[i][j]){
                return false;
            }

        }
        return true;
    }
    public static boolean isUniqueInColumn(int i, int j, int[][] grid) {
        for(int row=0;row<grid[0].length;row++){
            if (row != i && grid[row][j] == grid[i][j]){
                return false;
            }
        }
        return true;
    }
    public static boolean isUniqueInSmallBox(int i, int j, int[][] grid) {
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++){
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++){
                if (row != i && col != j && grid[row][col] == grid[i][j]){
                    return false;

                }

            }
        }
        return true;
    }

}

