package chapter_07;
// prints the maximum value in a list of an unspecified number of values
public class Listing_5 {
    public static void main(String[] args) {
        printMax(34,3,3,2,56.5);
        printMax(new double[]{1,2,3});

    }

    public static void printMax(double... numbers) {
        if(numbers.length==0){
            System.out.println("No arguments passed");
            return;
        }
        double max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The max value is "+max);
    }
}

