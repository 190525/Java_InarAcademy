package chapter_07;

import java.util.Scanner;

// Culture: Chinese Zodiac
public class Exercise_33 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String []zodiac={"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};

        System.out.println("enter a year");
        int year= input.nextInt();
        System.out.println(zodiac[year%12]);
    }
}

