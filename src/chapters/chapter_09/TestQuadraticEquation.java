import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("The equation has two roots.The roots are " + equation.getRoot1()+" and " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root.The root is " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");

        }
    }
}
class QuadraticEquation{
    private double a;
    private double b;
    private double c;
    QuadraticEquation(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return getB()*getB()-(4*getA()*getC());
    }
    public double getRoot1(){
        if(getDiscriminant()<0){
            return 0;
        }
        return (-getB()+Math.sqrt(getB()*getB()-4*getA()*getC()))/(2*getA());
    }
    public double getRoot2(){
        if(getDiscriminant()<0){
            return 0;
        }
        return (-getB()-Math.sqrt(getB()*getB()-4*getA()*getC()))/(2*getA());
    }
}

