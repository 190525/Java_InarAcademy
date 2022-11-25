import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_14 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\Users\\Sys\\Desktop\\ders falan\\Soru04.java");

        if (!file.exists()) {
            System.out.println(file + " is not found!!!");
            System.exit(0);
        }
        int total=0;
        int count=0;
        try (
                Scanner input=new Scanner(file);
        ){
            while (input.hasNext()){
                total+= input.nextDouble();
                count++;

            }
            System.out.println("Total scores: "+total+"\nAverage: "+(total/count));

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}

