import java.util.Scanner;

public class Exercise_19_MyTriangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter three sides for a triangle");
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();
        if(!isValid(side1,side2,side3)){
            System.out.println("Side of triangle is invalid");
            System.out.println("The sum of any two sides must be greater than the third side");

        }else {
            System.out.print("Area of triangle is ");
            System.out.printf("%.3f",area(side1, side2, side3));

        }

    }
    public static boolean isValid(double side1, double side2, double side3){
        // Return true if the sum of any two sides is greater than the third side.
        if((side1+side2>=side2)&&(side1+side3>=side2)&&(side2+side3>=side1)){
            return true;
        }
        return false;

    }
    public static double area(double side1, double side2, double side3){
        // return area of triangle
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

}

