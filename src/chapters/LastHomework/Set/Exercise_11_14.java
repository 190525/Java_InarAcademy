package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Combine two lists
public class Exercise_11_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> unionSet=new HashSet<>();

        System.out.println("Enter five integers for set1: ");
        for(int i=0;i<5;i++){
            set1.add(input.nextInt());
        }
        System.out.println("Enter five integers for set2: ");
        for(int i=0;i<5;i++){
            set2.add(input.nextInt());
        }
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        System.out.print("The combined set is: ");
        for(int i=0;i<unionSet.size();i++){
            System.out.print(unionSet.toArray()[i]+" ");
        }
    }

}

