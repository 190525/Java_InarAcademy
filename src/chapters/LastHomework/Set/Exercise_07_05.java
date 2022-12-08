package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Exercise_07_05 {
    private static Set<Integer> set=new HashSet<>();
    private static Scanner input=new Scanner(System.in);
    private static final int NUMBER_OF_INTEGERS=10;

    public static void main(String[] args) {
        getNumbers();
        print();
    }
    private static void getNumbers(){
        System.out.println("Enter "+NUMBER_OF_INTEGERS+" integer numbers: ");

        for ( int i=0; i < NUMBER_OF_INTEGERS;i++) {
             set.add(input.nextInt());
        }
    }
    private static void print(){
        for(int i=0;i<set.size();i++) {
            System.out.print(set.toArray()[i]+" ");
        }
    }

}

