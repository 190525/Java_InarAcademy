package chapter_07;

import java.util.Scanner;

// Count occurrence of numbers
public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] numbers=new int[10];

        System.out.println("Enter the integers between 1 and 100(enter 0 to finish):");
        int number;
        int i=0;
        do{
            number= input.nextInt();
            numbers[i]=number;
            i++;
        }while(number!=0);
        occurenceOfNumbers(numbers);

    }

    public static void occurenceOfNumbers(int[] numbers) {
        int count=0;
        for(int i=1;i<10;i++){
            for(int j=0;j< numbers.length;j++){
                if(i==numbers[j]){
                        count++;

                }
            }
            if(count>0){
                if(count==1){
                    System.out.println(i+" occurs "+count+" time");
                }else{
                    System.out.println(i+" occurs "+count+" times");

                }
            }

        }
    }
}

