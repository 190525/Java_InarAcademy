package chapters.chapter_08;

import java.util.Scanner;

// Game: nine heads and tails
public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511: ");
        int number= input.nextInt();

        String binaryNumber=convertDecimalToBinary(number);
        binaryNumber=binaryNumberWithNineDigit(binaryNumber);// matrix consists of 3 row and 3 column
        printMatrix(createBinaryNumberMatrixWithHsAndTs(binaryNumber));
    }




    public static String convertDecimalToBinary(int number) {
        String binaryNumber="";
        while(number>0)
        {
            binaryNumber=(number%2)+binaryNumber;
            number=number/2;
        }
        return binaryNumber;

    }
    public static String binaryNumberWithNineDigit(String binaryNumber) {
        while ((binaryNumber.length()!=9)){
            binaryNumber=0+binaryNumber;
        }
        return binaryNumber;
    }
   public static String[][] createBinaryNumberMatrixWithHsAndTs(String binaryNumber) {
       String[][] matrixHsTs = new String[3][3];
       for (int k = 0; k < binaryNumber.length(); k++) {
           char ch = binaryNumber.charAt(k);

                   if (ch=='0'){
                       matrixHsTs[k/3][k%3]="H";
                   }
                   else {
                       matrixHsTs[k/3][k%3]="T";
                   }
                 }

       return matrixHsTs;
   }
    public static void printMatrix(String[][] binaryNumberMatrixWithHsAndTs) {
        for(int row=0;row< binaryNumberMatrixWithHsAndTs.length;row++){
            for (int column=0;column<binaryNumberMatrixWithHsAndTs[row].length;column++){
                System.out.print(binaryNumberMatrixWithHsAndTs[row][column]+" ");
            }
            System.out.println();
        }

    }

}

