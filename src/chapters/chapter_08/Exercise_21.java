package chapters.chapter_08;
// Central city
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of cities:");
        int numberOfCities= input.nextInt();
        double[][]coordinatesOfCities=new double[numberOfCities][2];
        System.out.println("Enter the coordinates of the cities: ");
        for(int i=0;i<coordinatesOfCities.length;i++){
           coordinatesOfCities[i][0]=input.nextDouble();
            coordinatesOfCities[i][1]=input.nextDouble();
        }
        int indexOfCentralCity=findMinimumDistance(findTotalDistanceToOtherCities(coordinatesOfCities));
        System.out.println("The central city is at ("+
                coordinatesOfCities[indexOfCentralCity][0]+", "+coordinatesOfCities[indexOfCentralCity][1]+")");
        System.out.printf("The total distance to all other cities is %.3f",findTotalDistanceToOtherCities(coordinatesOfCities)[indexOfCentralCity]);

    }
    public static double[] findTotalDistanceToOtherCities( double[][]coordinatesOfCities){
        double []totalDistance=new double[coordinatesOfCities.length];
        for(int i=0;i< coordinatesOfCities.length;i++){
            for(int j=0;j< coordinatesOfCities.length;j++){
                totalDistance[i]+=Math.sqrt(Math.pow
                        (coordinatesOfCities[j][1]-coordinatesOfCities[i][1],2)+Math.pow(coordinatesOfCities[j][0]-coordinatesOfCities[i][0],2));
            }
        }
        return totalDistance;
    }
    public static int findMinimumDistance( double []totalDistance){
        double min=Double.MAX_VALUE;
        int indexOfMinimum=-1;
       for(int i=0;i<totalDistance.length;i++){
           if(totalDistance[i]<min){
               min=totalDistance[i];
               indexOfMinimum=i;
           }
       }
       return indexOfMinimum;
    }
}

