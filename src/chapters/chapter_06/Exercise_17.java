import java.util.Scanner;

public class Exeercise_17 {
    // Display matrix of 0s and 1s
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the dimensions of the matrix.");
        int dimension= input.nextInt();
        printMatrix(dimension);

    }
    public static void printMatrix(int n){ 
        // Print components of matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%2d",(int)(Math.random()*2));
            }
            System.out.println();
        }

    }
}

