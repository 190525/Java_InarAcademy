package chapters.chapter_08;
// Even number of 1s
public class Exercise_22 {
    public static void main(String[] args) {
        final int NUMBER_OF_ROW=6;
        final int NUMBER_OF_COLUMN=6;
        int [][]matrix=new int[NUMBER_OF_ROW][NUMBER_OF_COLUMN];
        matrix=fillMatrixWith0sAnd1s(matrix);
        displayMatrix(matrix);
        checkEven1sInRow(matrix);
        checkEven1sInColumn(matrix);
    }


    public static int[][] fillMatrixWith0sAnd1s(int[][] matrix) {
        for(int row=0;row< matrix.length;row++){
            for (int col=0;col<matrix[row].length;col++){
                matrix[row][col]=(int)(Math.random()*2);
            }
        }
        return matrix;
    }
    public static void displayMatrix(int[][] matrix) {
        for(int row=0;row< matrix.length;row++){
            for (int col=0;col<matrix[row].length;col++){
                System.out.print( matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void checkEven1sInRow(int[][] matrix) {
        for(int row=0;row< matrix.length;row++){
            for (int col=0;col<matrix[row].length-1;col++){
                if((matrix[row][col]==1)&&(matrix[row][col]==matrix[row][col+1])){
                    System.out.println("There is even 1s in "+(row+1)+". row");
                    break;
                }
            }
        }

    }
    public static void checkEven1sInColumn(int[][] matrix) {
        for(int row=0;row< matrix.length;row++){
            for (int col=0;col<matrix[row].length-1;col++){
                if((matrix[col][row]==1)&&(matrix[col][row]==matrix[col+1][row])){
                    System.out.println("There is even 1s in "+(row+1)+". column");
                    break;
                }
            }
        }
    }



}

