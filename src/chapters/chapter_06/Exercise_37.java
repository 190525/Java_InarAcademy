import java.util.Scanner;

public class Exercise_37 {
    //Format an integer
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number= input.nextInt();
        System.out.println("Enter a width of integer :");
        int width= input.nextInt();

        System.out.println("The formatted number is: " + format(number, width));


    }
    public static String format(int number, int width){
        String str = number + "";
        int length=str.length();

        if (length < width) {
            for(int i=0;i<width - length;i++){

                str = 0 + str;
            }
        }

        return str;
    }
}



