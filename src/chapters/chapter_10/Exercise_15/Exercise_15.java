// Geometry: the bounding rectangle
import java.util.Scanner;
public class Exercise_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points:");

        double[][] points = new double[5][2];
        getPoints(input, points);

        double centerX=(minX(points)+maxX(points))/2;
        double centerY=(minY(points)+maxY(points))/2;
        double width=Math.abs(maxX(points)-minX(points));
        double height=Math.abs(maxY(points)-minY(points));

        MyRectangle2D rectangle=new MyRectangle2D(centerX,centerY,height,width);
        System.out.println("The bounding rectangle's center (" + rectangle.getX() + ", " + rectangle.getY() +
                "), width " + rectangle.getWidth() + ", height " + rectangle.getHeight());
    }
    private static double[][] getPoints(Scanner input, double[][] points) {
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }

    private static double minX(double[][] points) {
        double min=Double.MAX_VALUE;
        for(int i=0;i< points.length;i++){
            if(points[i][0]<min){
                min=points[i][0];
            }
        }
        return min;
    }

    private static double minY(double[][] points) {
        double min=Double.MAX_VALUE;
        for(int i=0;i< points.length;i++){
            if(points[i][1]<min){
                min=points[i][1];
            }
        }
        return min;

    }

    private static double maxX(double[][] points) {
        double max=Double.MIN_VALUE;
        for(int i=0;i< points.length;i++){
            if(points[i][0]>max){
                max=points[i][0];
            }
        }
        return max;

    }

    private static double maxY(double[][] points) {
        double max=Double.MIN_VALUE;
        for(int i=0;i< points.length;i++){
            if(points[i][1]>max){
                max=points[i][1];
            }
        }
        return max;


    }

}


