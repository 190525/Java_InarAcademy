package chapters.chapter_08;

import java.util.Scanner;

// Geometry: area of a triangle
public class Exercise_32 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final int NUMBER_OF_POİNT=3;
        final int COLUMN=2;

        double[][]points=new double[NUMBER_OF_POİNT][COLUMN];

        System.out.println("Enter the x1,y1,x1,y2,x3,y3:");
        for(int i=0;i< points.length;i++){
            for (int j=0;j<points[i].length;j++){
                points[i][j]=input.nextDouble();
            }
        }
        if(getTriangleArea(points)!=0) {
            System.out.printf("The area of the triangle is %.3f",getTriangleArea(points));
        }else {
            System.out.println("The three points are on the same line");
        }

    }
    public static double getTriangleArea(double[][] points) {
        if(onSameLine(points)){
        return 0;
        }
        else {
        double side1 = findSideLength(points[0][0], points[0][1], points[1][0], points[1][1]);
        double side2 = findSideLength(points[0][0], points[0][1], points[2][0], points[2][1]);
        double side3 = findSideLength(points[2][0], points[2][1], points[1][0], points[1][1]);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
        }
    }
    public static boolean onSameLine(double[][] points) {
        double determinant = (points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) -
                (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]);

        if(determinant ==0){
            return true;
        }else{
            return false;
        }
    }

    public static double findSideLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

}


