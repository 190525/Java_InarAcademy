package chapter_11.Exercise_17;
// Algebra: perfect square

import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> factors = new ArrayList<>();
        ArrayList<Integer> factors1 = new ArrayList<>();


        System.out.println("Enter an integer m: ");
        int m = input.nextInt();
        factors=getFactors(m,factors);

        factors1.clear();
        factors1.addAll(factors);

        removeDuplicate(factors1);
        int smallestNumber=smallestNumber(factors,factors1);
        System.out.println("The smallest number n for m * n to be a perfect square is "+smallestNumber);
        System.out.println("m * n is "+(m*smallestNumber));

    }
    private static ArrayList getFactors(int m, ArrayList<Integer> factors) {

        int number = 2;
        while (number <= m) {
            if (m % number == 0) {
                factors.add(number);
                m /= number;
            } else {
                number++;
            }
        }
        return factors;
    }

   private static ArrayList removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i< list.size();i++){
            if(!numbers.contains(list.get(i))){
                numbers.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(numbers);
        return list;
    }
    private static int smallestNumber(ArrayList<Integer> factors, ArrayList<Integer> factors1) {
        int smallestNumber=1;

        for(int i=0;i<factors1.size();i++){
            int count=0;
            for( int j=0;j<factors.size();j++){
                if(factors1.get(i)==factors.get(j)){
                    count++;
                }
            }
            if(count%2!=0){
                smallestNumber*=factors1.get(i);
            }
        }
        return smallestNumber;
    }

}

