import java.util.Scanner;

public class Exercise_36 {
    //Geometry: area of a regular polygon
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of sides:");
        int numberOfSide= input.nextInt();
        System.out.println("Enter the length of sides: ");
        double lengthOfSides=input.nextDouble();
        System.out.printf("The area of the polygon is %.3f", area(numberOfSide,lengthOfSides));

    }
    public static double area(int n, double side){
        double area=(n*side*side)/(4*Math.tan(Math.PI/n));
        return area;

    }
}

