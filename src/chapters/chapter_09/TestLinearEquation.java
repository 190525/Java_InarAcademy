import java.util.Scanner;
public class TestLinearEquation {
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation lEquation = new LinearEquation(a,b,c,d,e,f);

        if (lEquation.isSolvable()) {
            System.out.println("x : " + lEquation.getX() + "\ny : " + lEquation.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
    }

}
class LinearEquation{
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // ad - bc is not 0.
    public boolean isSolvable(){
        return ((getA() * getD()) - (getB() * getC())) != 0;
    }


    public double getX(){
        double x = (getE() * getD() - getB() * getF()) / ((getA() * getD()) - (getB() * getC()));
        return x;
    }

    public double getY(){
        double y = (getA() * getF() - getE() * getC()) / ((getA() * getD()) - (getB() * getC()));
        return y;
    }
}

