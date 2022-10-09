package chapter_07;

import java.util.Scanner;

//  Statistics: compute deviation
public class Exercise_11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double[] numbers=new double[10];
        System.out.println("Enter ten numbers you want to learn mean and deviation of these.");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextDouble();
        }
        double mean=mean(numbers);
        System.out.println("The mean of entered numbers is %0.3f"+mean);

        double deviation=deviation(numbers);
        System.out.println("The deviation of entered numbers is %0.3f"+deviation);

    }

    /** Compute the deviation of double values */
    public static double deviation(double[] x){
        int numerator=0;
        for(int i=0;i< x.length;i++){
            numerator+=(x[i]-mean(x))*(x[i]-mean(x));

        }
        double deviation=Math.sqrt(numerator/(x.length-1));
        return deviation;

    }
    /** Compute the mean of an array of double values */
    public static double mean(double[] x){

       double sum=0;
        for(int i=0;i<x.length;i++){
          sum +=x[i];
        }
        double mean= sum/x.length;
        return mean;

    }
}

