package chapters.chapter_08;
// Sum elements column by column
import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        double[][] array=new double[3][4];
        System.out.println("Enter a 3 by 4 matrix elements: ");
        array=getElementsOfArray(array);
        for(int i=0;i<=3;i++){
            System.out.println("The sum of the elements in "+(i+1)+". column is "+sumColumn(array,i));
        }

    }

    public static double[][] getElementsOfArray( double[][] array) {
        Scanner input=new Scanner(System.in);


        for(int row=0;row< array.length;row++){
            for (int column=0;column<array[row].length;column++){
                array[row][column]=input.nextDouble();
            }
        }
        return array;
    }

    public static double sumColumn(double[][] array, int columnIndex){
        double sumOfColumn = 0;

        for( int i = 0; i < array.length; i++) {
            sumOfColumn += array[i][columnIndex];
        }
        return sumOfColumn;

    }

}

