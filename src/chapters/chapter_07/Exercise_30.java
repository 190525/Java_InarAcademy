package chapter_07;

import java.util.Scanner;

// Pattern recognition: consecutive four equal numbers
public class Exercise_30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int lengthOfArray= input.nextInt();
        int []values=new int[lengthOfArray];
        System.out.println("enter numbers :");
        for (int i=0;i<lengthOfArray;i++){
            values[i]=input.nextInt();
        }
        if(isConsecutiveFour(values)){
            System.out.println("The list has consecutive fours ");
        }else{
            System.out.println("The list has not consecutive fours ");

        }

    }
    public static boolean isConsecutiveFour(int[] values){
        int count=0;
        for(int i=0;i<values.length-1;i++){
            if(values[i]==values[i+1]){
                count++;
                if(count==3){ //If we include the number being compared with itself, it would be four. Therefore, count must be three.
                    return true;
                }
            }else{
                count=0;
            }
        }
      return false;
    }
}

