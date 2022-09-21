//Display patterns
import java.util.*;
public class Exercise_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a line number of pattern :");
        int line= input.nextInt();
        displayPattern(line);

    }
    public static void displayPattern(int n){
        for(int i=0;i<n;i++){ //determine number of line
            for(int j=n;j>i;j--){ //creating space character
                System.out.print("   ");
            }for(int k=0;k<=i;k++){ // printing number
                System.out.printf("%3d",(i-k+1));

            }
            System.out.println();
        }

    }
}

