package chapter_07;
// Analyze scores

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double[]scores=new double[100];
        int count=0;// count will be used to find the number scores to enter.
        System.out.println("Enter a score(Enter a negative number to  end of the input");
        for(int i=0;i< scores.length;i++){
            double score=input.nextDouble();
            if(score>=0&&score<=100){
                scores[i]=score;
                count++;
            }else{
                break;
            }
        }
        double average=findAverage(scores,count);
        int numberOfScoresBelowAverage=findScoresUnderAverage(scores,average);
        int numberOfScoresAboveAverage=findScoresUnderAverage(scores,average);
        int numberOfScoresEqualAverage=findScoresUnderAverage(scores,average);

        System.out.println(numberOfScoresBelowAverage+" numbers are below average.");
        System.out.println(numberOfScoresEqualAverage+" numbers  equals average.");
        System.out.println(numberOfScoresAboveAverage+" numbers are above average.");

    }

    public static double findAverage(double[] scores, int count) {
        int sum=0;
        for(int i=0;i< scores.length;i++){
            sum+=scores[i];

        }
        double average=sum/count;
        return average;
    }

    public static int findScoresAboveAverage(double[]scores,double average){
        int count=0;//count will be used to find the number scores which are above average.
        for(int i=0;i<scores.length;i++){
            if(scores[i]>average){
                count++;
            }

        }
        return count;
    }
    public static int findScoresEqualAverage(double[]scores,double average){
        int count=0;//count will be used to find the number scores which are equal average.
        for(int i=0;i<scores.length;i++){
            if(scores[i]==average){
                count++;
            }

        }
        return count;
    }
    public static int findScoresUnderAverage(double[]scores,double average){
        int count=0;//count will be used to find the number scores which are under average.
		    //for(int i=0;i<scores.length;i++){
            if(scores[i]<average){
                count++;
            }

        }
        return count;
    }
}

