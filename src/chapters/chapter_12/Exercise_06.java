package chapter_12.Exercise_06;
// Hex number convert to Decimal number

import java.util.*;
public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            System.out.println("Enter a hex number :");
            String hex = input.nextLine();
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }

    public static int hexToDecimal(String hex) {
        int decimalValue=0;
        for(int i=0;i<hex.length();i++){
            char hexChar=hex.charAt(i);
            if(checkHexCharacter(hexChar)) {
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            }else{
                throw new NumberFormatException("Wrong input!!!Entered number must be hex number:");
            }
        }
        return decimalValue;
    }
    public static boolean checkHexCharacter(char ch) {
        return ch >= '0' && ch <= 'F';
    }

    public static int hexCharToDecimal(char ch) {
        if(ch>='A'&&ch<='F'){
            return 10+ch-'A';
        }else{
            return ch-'0';
        }
    }

}

