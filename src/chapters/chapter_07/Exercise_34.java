package chapter_07;

import java.util.Scanner;

// Sort characters in a string
public class Exercise_34 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string you want to sort: ");
        String str= input.next();

         System.out.println(sort(str));

    }
    public static String sort(String s){
      int []str=new int[s.length()];
        for(int i=0;i<str.length;i++){
            str[i]= (int)(s.charAt(i));
        }
        for(int i=0;i<str.length;i++){
            for(int j=0;j< str.length;j++)
            if(str[i]<str[j]){
                int temp=str[j];
                str[j]=str[i];
                str[i]=temp;
            }
        }
        String sortedString="";
        for(int i=0;i<str.length;i++){
            sortedString+=(char)(str[i]);
        }
        return sortedString;

    }
}

