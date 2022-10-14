package chapter_07;
// Algebra: solve quadratic equations
import java.util.Scanner;

public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double []equation=new double[3];
        System.out.println("Enter a, b,c(coefficients of equation)");
        for(int i=0;i<3;i++){
            equation[i]=input.nextDouble();

        }
        if(findDeterminant(equation)>=0){
            double[]roots=solveQuadratic(equation);
            System.out.print(" the roots are:\n "+roots[0]+" and root2 "+roots[1]);


        }else{
            System.out.println("the equation has no real root.");
        }



    }
    public static double []solveQuadratic(double[] eqn){
        double []roots=new double[2];
        roots[0]=-(eqn[1]-Math.pow(findDeterminant(eqn),0.5))/(2*eqn[0]);
        roots[1]=-(eqn[1]+Math.pow(findDeterminant(eqn),0.5))/(2*eqn[0]);
        return roots;
    }
    public static  double findDeterminant(double[]eqn){
        double determinant=eqn[1]*eqn[1]-(4*eqn[0]*eqn[2]);

        return determinant;

    }
}

