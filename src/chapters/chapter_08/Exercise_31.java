package chapters.chapter_08;

import java.util.Scanner;

// Geometry: intersecting point
public class Exercise_31 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final int NUMBER_OF_POİNT=4;
        final int COLUMN=2;

        double[][]points=new double[NUMBER_OF_POİNT][COLUMN];

        System.out.println("Enter the x1,y1,x1,y2,x3,y3,x4,y4:");
        for(int i=0;i< points.length;i++){
            for (int j=0;j<points[i].length;j++){
                points[i][j]=input.nextDouble();
            }
        }
        if(getIntersectingPoint(points)==null){
            System.out.println("The two lines are parallel.");
        }
        else{
            System.out.println("The intersecting point is at (" + getIntersectingPoint(points)[0] + ", "
                    + getIntersectingPoint(points)[1] + ")");        }
    }
    public static double[] getIntersectingPoint(double[][] points){
        double[]intersectingPointCoordinate=new double[2];
        /*
         * Applying Cramer's Rule
         * (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1 -(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
         * This linear equation can be solved using Cramer’s rule.
         * The equation has no solutions, the two lines are parallel.
         */
        if ((points[0][0] - points[1][0]) * (points[2][1] - points[3][1]) - (points[0][1] - points[1][1]) * (points[2][0] - points[3][0]) == 0) {
            return null;
        }
        double a = points[0][1] - points[1][1];

        double b = -(points[0][0] - points[1][0]);

        double c = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];

        double d = (points[2][1] - points[3][1]);

        double e = -(points[2][0] - points[3][0]);

        double f = ((points[2][1] - points[3][1]) * points[2][0]) - ((points[2][0] - points[3][0]) * points[2][1]);

        // Finding x and y
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));


        intersectingPointCoordinate[0] = x;
        intersectingPointCoordinate[1] = y;

        return intersectingPointCoordinate;
    }


}

