import java.util.Scanner;

public class Exercise_35 {
    //Geometry: area of a pentagon
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the side :");
        double side= input.nextDouble();
        System.out.printf("The area of the pentagon is %.3f ",area(side));

    }
    public static double area(double side){
        double area=(5*side*side)/(4*Math.tan(Math.PI / 5));
        return area;
    }
}

