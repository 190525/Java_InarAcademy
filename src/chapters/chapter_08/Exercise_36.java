package chapters.chapter_08;

import java.util.Scanner;

// Latin square
public class Exercise_36 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n= input.nextInt();
        String [][] latinSquare=new String[n][n];
        latinSquare=getLatinSquareElements(latinSquare,n,input);
        if(isValidLength(latinSquare)){
            if(isValidLetter(latinSquare,n)){
                System.out.println("The input array is a Latin square");

            }else{
                System.out.println("Wrong input: the letters must be from A to "+(char)(((int)('A')+n)));

            }

        }else{
            System.out.println("Wrong input!!!.You did not enter enough letters.");
        }
    }

    public static String[][] getLatinSquareElements(String [][] latinSquare,int n,Scanner input) {
        System.out.println("Enter "+n+" rows of letters separated by spaces: ");
        for (int i = 0; i < latinSquare.length; i++) {
            for (int j = 0; j < latinSquare[i].length; j++) {
                latinSquare[i][j] = input.next();


            }

        }
        return latinSquare;
    }


    public static boolean isValidLength(String [][] latinSquare){
        /*
        The default value of the String array is a null character.
         If all the elements of the array are not letters, this is detected and
         it is checked whether enough elements have been added to the array.
         */

        for (int i = 0; i < latinSquare.length; i++) {
            for (int j = 0; j < latinSquare[i].length; j++) {
                char ch=latinSquare[i][j].charAt(0);
                if(!(ch>='A'&&ch<='Z')){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValidLetter(String[][] latinSquare,int n) {

        for (int i = 0; i < latinSquare.length; i++) {
            for (int j = 0; j < latinSquare[i].length; j++) {
                char ch=latinSquare[i][j].charAt(0);
                if(!(ch>='A'&&ch<=(char)((int)'A'+4))){
                    return false;
                }

            }
        }
        return true;
    }
}

