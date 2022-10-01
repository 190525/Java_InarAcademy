package chapter_07;
 // Analyze Numbers
import java.util.Scanner;

public class Listing_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of items");
        int numberOfItems= input.nextInt(); // the user to enter the array size
        System.out.print("Enter the numbers: ");
        double[] numbers=new double[numberOfItems];
        double sum=0;
        for(int i=0;i<numberOfItems;i++){
            numbers[i]=input.nextDouble(); //). The program reads the input, stores numbers into the array
            sum+=numbers[i]; // add each number to sum
        }
        double average=sum/numberOfItems;
        int count=0; //// The number of elements above average
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>average){
                count++;
            }
        }
        System.out.println("Average is "+average);
        System.out.println("Number of elements above the average is "+count);

    }
}

