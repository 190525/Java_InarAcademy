import java.util.Scanner;

public class Exercise_22 {
    //Math: approximate the square root
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number you want to find square number");
        long number=input.nextLong();
        double squareRootOfNumber=sqrt(number);
        System.out.println(squareRootOfNumber);

    }
    public static double sqrt(long n){ //  Babylonian method which is used to square root of number
        double nextGuess;
        double lastGuess=0.000001;
        do {
            nextGuess=(lastGuess+n/lastGuess)/2;
            lastGuess= lastGuess+0.000001;
        }
        while(nextGuess-lastGuess>=0.000001);

        return nextGuess;
    }
}

