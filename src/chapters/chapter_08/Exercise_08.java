package chapters.chapter_08;
// All closest pairs of points
import java.util.Scanner;
public class Exercise_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points: ");
        int numberOfPoints = input.nextInt();
        double[][] pointsArray = new double[numberOfPoints][2];

        getPointsArray(input, numberOfPoints, pointsArray);

        double shortestDistance=findMinimumDistance(pointsArray);
        System.out.printf("Their distance is %.3f\n",shortestDistance);

        printPointsWithMinimumDistance(pointsArray,shortestDistance);
    }



    public static void getPointsArray(Scanner input, int numberOfPoints, double[][] pointsArray) {
        System.out.println("Enter " + numberOfPoints + " points:");
        for (int i = 0; i < pointsArray.length; i++) {
            pointsArray[i][0] = input.nextDouble();
            pointsArray[i][1] = input.nextDouble();
        }
    }

    private static double findMinimumDistance(double[][] pointsArray) {
        double minimumDistance=Double.MAX_VALUE;

        for(int i = 0; i< pointsArray.length; i++){
            for(int j = i+1; j< pointsArray.length-1; j++){

                double distance = distanceFormula(pointsArray[i][0], pointsArray[i][1], pointsArray[j][0], pointsArray[j][1]);
                if(distance<minimumDistance){
                    minimumDistance=distance;

                }
            }
        }
        return minimumDistance;
    }



    public static double distanceFormula (double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    public static void printPointsWithMinimumDistance(double[][] pointsArray, double shortestDistance) {
        for (int i = 0; i < pointsArray.length; i++) {
            for (int j = i + 1; j < pointsArray.length; j++) {
                double d = distanceFormula(pointsArray[i][0], pointsArray[i][1], pointsArray[j][0], pointsArray[j][1]); // check distance
                if (d == shortestDistance) {
                    System.out.println("The closest two points are (" + pointsArray[i][0] + "," + pointsArray[i][1] + ") and ("
                            + pointsArray[j][0] + ", " + pointsArray[j][1] + ")");
                }

            }
        }
    }


}



