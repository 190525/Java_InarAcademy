package chapters.chapter_08;

import java.util.Scanner;

//Geometry: same line?
public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final int NUMBER_OF_POİNTS=5;
        double[][] pointsArray=new double[NUMBER_OF_POİNTS][2];

        pointsArray=getPointsArray(input,NUMBER_OF_POİNTS,pointsArray);
        if(sameLine(pointsArray)){
            System.out.println("The five points are on the same line");
        }else{
            System.out.println("The five points are not on the same line");
        }


    }
    public static double[][] getPointsArray(Scanner input, int numberOfPoints, double[][] pointsArray) {
        System.out.println("Enter " + numberOfPoints + " points:");
        for (int i = 0; i < pointsArray.length; i++) {
            pointsArray[i][0] = input.nextDouble();
            pointsArray[i][1] = input.nextDouble();
        }
        return pointsArray;
    }
    public static boolean sameLine(double[][] points){
        for(int row=0;row< points.length-2;row++){
            for (int column=0;column<points[row].length;column++){
                // if the slope of all points is equal,all  points at same line
                if(points[row+1][column]-points[row][column]!=points[row+2][column]-points[row+1][column]){
                    return false;
                }
            }
        }
        return true;

    }
}

