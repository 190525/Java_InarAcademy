import java.util.ArrayList;
import java.util.Scanner;


// Reverse an array
public class Exercise_07_12 {
    private static ArrayList<Integer> numbers=new ArrayList<>();
    private static final int NUMBER_OF_INTEGER=10;
    private static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        getNumber();
        printReverse();
    }

    private static void getNumber() {
        for(int i=0;i<NUMBER_OF_INTEGER;i++){
            numbers.add(input.nextInt());
        }

    }
    private static void printReverse() {
        for(int i=numbers.size()-1;i>=0;i--){
            System.out.print(numbers.get(i)+" ");
        }

    }
}

