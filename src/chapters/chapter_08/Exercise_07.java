package chapters.chapter_08;
// Points nearest to each other
public class Exercise_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9},
                {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
        double minimumDistance=Double.MAX_VALUE;
        // point1 and point2 refers that the row of points nearest to each other
        int point1=-1;
        int point2=-1;

        for(int i=0;i< points.length;i++){
            for(int j=i+1;j< points.length-1;j++){

                double distance = distanceFormula(points[i][0], points[i][1],points[i][2], points[j][0], points[j][1],points[j][2]);
                if(distance<minimumDistance){
                    minimumDistance=distance;
                    point1=i;
                    point2=j;
                }
            }
        }

        System.out.printf("The closest distance between two points is %.3f\n",minimumDistance);
        System.out.println("The closest 2 points are " + "(" + points[point1][0] + ", " + points[point1][1] + ", "
                + points[point1][2] + ") and (" + points[point2][0] + ", " + points[point2][1] + ", " + points[point2][2] + ")");
    }

    public static double distanceFormula (double x1, double y1,double z1, double x2, double y2,double z2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
    }


}

