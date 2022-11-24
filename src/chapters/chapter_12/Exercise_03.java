import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [] numbers=new int[100];
        for(int i=0;i< numbers.length;i++){
            numbers[i]=(int)(Math.random()*100);
        }
        boolean b=true;
        do {
            try {
                System.out.println("enter the index of the array:");
                int index = input.nextInt();
                System.out.println(numbers[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Out of bound!!!");
                b=false;
            }
        }while(b);
    }
}

