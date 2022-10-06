package chapter_07;
// Reverse the numbers entered

public class Exercise_02 {
    public static void main(String[] args) {
        int []number={56,45,85,96,5,-78,36,-785,568,410};
        int []reversedNumber=reverseArray(number);
        for(int i=0;i< number.length;i++){
            System.out.print(reversedNumber[i]+" ");
        }

    }

    public static int[] reverseArray(int[] number) {
        int[]reversedNumber=new int [number.length];
        for(int i=0;i< number.length;i++){
            reversedNumber[number.length-1-i]=number[i];
        }
        return reversedNumber;

    }
}

