import java.util.Scanner;

public class LocationTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter row number: ");
        int row= input.nextInt();
        System.out.println("Enter column number: ");
        int column= input.nextInt();
        double[] [] matrix=new double[row][column];
        matrix=createMatrix(matrix,input);
        Location location1=locateLargest(matrix);
        System.out.println(location1.toString());
    }



    public static double[][] createMatrix(double[][] matrix,Scanner input) {
        System.out.println("Enter matrix elements: ");
        for(int row=0;row< matrix.length;row++){
            for (int column=0;column<matrix[row].length;column++){
                matrix[row][column]=input.nextDouble();
            }
        }
        return matrix;
    }
    private static Location locateLargest(double[][] matrix) {
        int rowIndex=-1;
        int columnIndex=-1;
        double maxValue=Double.MIN_VALUE;
        for(int row=0;row< matrix.length;row++){
            for (int column=0;column<matrix[row].length;column++){
               if(maxValue<matrix[row][column]){
                   rowIndex=row;
                   columnIndex=column;
                   maxValue=matrix[row][column];
               }
            }
        }
        Location location=new Location(rowIndex,columnIndex,maxValue);
        return location;

    }
}
class Location {
    public int row;
    public int column;
    public double maxValue;
    public Location(){
        this(0,0,Double.MAX_VALUE);

    }
    public Location(int row, int column, double maxvalue){
        this.row=row;
        this.column=column;
        this.maxValue=maxvalue;
    }
    public int getRow(){
        return this.row;
    }
    public int getColumn(){
        return this.column;
    }

    public double getMaxValue() {
        return this.maxValue;
    }
    public String toString(){
        return "Row: "+getRow()+"\nColumn: "+getColumn()+"\nMaximum Value: "+getMaxValue();

    }
}

