package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Eliminate duplicates
public class Exercise_07_15 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Scanner input=new Scanner(System.in);
        final int NUMBER_OF_INTEGER=10;
        System.out.println("enter "+NUMBER_OF_INTEGER+" numbers: ");
        for(int i=0;i<NUMBER_OF_INTEGER;i++){
            set.add(input.nextInt());
        }
        for(int i=0;i<set.size();i++){
            System.out.print(set.toArray()[i]+" ");
        }

    }
}

