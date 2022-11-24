import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean numberFormat=true;
        int number1;
        int number2;
        do {
            try {
                System.out.println("Enter two integer:");
                number1 = input.nextInt();
                number2 = input.nextInt();
                System.out.println(number1+" + "+number2+" = "+(number1+number2));
                numberFormat=false;


            }catch (InputMismatchException e){
                System.out.println("Incorrect input!!! Enter two integer:");
                input.nextLine();

            }
        }while (numberFormat);

    }
}

