package chapters.chapter_08;

import java.util.Scanner;

// Find Nearest Points
public class Listing_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points");
        int numberOfPoints = input.nextInt();
        double[][] pointsArray = new double[numberOfPoints][2];

        System.out.println("Enter " + numberOfPoints + " points:");
        for (int i = 0; i < pointsArray.length; i++) {
            pointsArray[i][0] = input.nextDouble();
            pointsArray[i][1] = input.nextDouble();
        }

        double minimumDistance=Double.MAX_VALUE;
        double x1=-1;
        double x2=-1;
        for(int i=0;i< pointsArray.length;i++){
            for(int j=i+1;j< pointsArray.length-1;j++){

                double distance = distanceFormula(pointsArray[i][0], pointsArray[i][1], pointsArray[j][0], pointsArray[j][1]);
                if(distance<minimumDistance){
                    minimumDistance=distance;
                    x1=pointsArray[i][0];
                    x2=pointsArray[j][0];
                }
            }
        }

        System.out.printf("The closest distance between two points is %.3f\n",minimumDistance);
        System.out.println("The points are "+"(" + pointsArray[(int) x1+1][0] + ", " + pointsArray[(int) x1+1][1] + ") and ("+pointsArray[(int) x2+1][0] + ", " + pointsArray[(int) x2+1][1] + ")") ;

    }

    public static double distanceFormula (double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }


}


