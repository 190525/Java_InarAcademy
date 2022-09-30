import java.util.*;
public class Exercise_39 {
    /*Geometry: point position
    the user to enter the three points for p0, p1, and p2
    and displays whether p2 is on the left of the line from p0 to p1, right, the same line, or on the line segment.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the coordinates of the two points the line will pass through ,respectively.");
        double point1x1 = input.nextDouble();
        double point1y1 = input.nextDouble();
        double point2x1 = input.nextDouble();
        double point2y1 = input.nextDouble();
        System.out.println("Enter the coordinates of the point whose position you want to check.");
        double point3x1 = input.nextDouble();
        double point3y1 = input.nextDouble();
        if(leftOfTheLine(point1x1,point1y1,point2x1,point2y1,point3x1,point3y1)){
            System.out.println("(" + point3x1+ "," + point3y1+ ") is on the left side of the line from (" + point1x1 + "," + point1y1 + ") to " + "(" + point2x1 + "," + point2y1 + ")");
        }
        else if(rightOfTheLine(point1x1,point1y1,point2x1,point2y1,point3x1,point3y1)){
            System.out.println("(" + point3x1+ "," + point3y1+ ") is on the right side of the line from (" + point1x1 + "," + point1y1 + ") to " + "(" + point2x1 + "," + point2y1 + ")");
        }

        else if(onTheLineSegment(point1x1,point1y1,point2x1,point2y1,point3x1,point3y1)){
            System.out.println("(" + point3x1+ "," + point3y1+ ") is is on the segment  from (" + point1x1 + "," + point1y1 + ") to " + "(" + point2x1 + "," + point2y1 + ")");
        }
        else if(onTheSameLine(point1x1,point1y1,point2x1,point2y1,point3x1,point3y1)){
            System.out.println("(" + point3x1+ "," + point3y1+ ") is on the same line as  the line from (" + point1x1 + "," + point1y1 + ") to " + "(" + point2x1 + "," + point2y1 + ")");
        }else{
            System.out.println("Invalid input");
        }


    }
    /** Return true if point (x2, y2) is on the left side of the directed line from (x0, y0) to (x1, y1) */
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (result <= 0) {
            return false;
        }
        return true;
    }
    /** Return true if point (x2, y2) is on the right side of the directed line from (x0, y0) to (x1, y1) */
    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (result >= 0) {
            return false;
        }
        return true;

    }
    /** Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (result != 0) {
            return false;
        }
        return true;

    }
    /** Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){
        double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if(!(result==0&&(x2 > x0) && (y2 > y0) && (x2 < x1) && (y2 < y1))) {
            return false;
        }
        return true;

    }
}

