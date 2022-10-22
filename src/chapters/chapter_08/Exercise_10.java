package chapters.chapter_08;
// Largest row and column
public class Exercise_10 {
    public static void main(String[] args) {
        int [][] array=new int[4][4];
        fillArrayWith0s1s(array);
        printArray(array);
        maximum1sRowIndex(array);
        maximum1sColumnIndex(array);
    }

    public static int[][] fillArrayWith0s1s(int[][] array) {
        for(int row=0;row< array.length;row++){
            for (int column=0;column<array[row].length;column++){
                array[row][column]=(int)(Math.random()*2);
            }
        }
        return array;
    }

    public static void printArray(int[][] array) {
        for(int row=0;row< array.length;row++){
            for (int column=0;column<array[row].length;column++){
                System.out.print(array[row][column]+" ");
            }
            System.out.println();
        }

    }



    public static void maximum1sRowIndex(int[][] array){
        int minimumSum=Integer.MIN_VALUE;
        int rowIndex=-1;

        for( int i = 0; i < array.length; i++) {
            int sumOfrow = 0;
            for(int j=0;j<array[i].length;j++)
                sumOfrow += array[i][j];
            if(sumOfrow>minimumSum){
                minimumSum=sumOfrow;
                rowIndex=i;
            }
        }
        System.out.println("The largest row index: "+rowIndex);

    }
    public static void maximum1sColumnIndex(int[][] array){
        int minimumSum=Integer.MIN_VALUE;
        int columnIndex=-1;

        for( int i = 0; i < array.length; i++) {
            int sumOfColumn = 0;
            for(int j=0;j<array[i].length;j++)
                sumOfColumn += array[j][i];
            if(sumOfColumn>minimumSum){
                minimumSum=sumOfColumn;
                columnIndex=i;
            }

        }
        System.out.println("The largest column index: "+columnIndex);

    }
}

