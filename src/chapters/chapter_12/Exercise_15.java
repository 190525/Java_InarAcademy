import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Sys\\Desktop\\ders falan\\Exercise12_15.txt");

        if (file.exists()) {
            System.out.println(file + " already exists!!!");
            System.exit(0);
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {

            for (int i = 0; i < 100; i++) {
                output.print(((int)(Math.random() * 1000))+" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Integer> numbers=new ArrayList<>();

        try(
                Scanner input=new Scanner(file);
                ){
            while (input.hasNext()) {
                numbers.add(input.nextInt());
            }
            Collections.sort(numbers);
            try (
                    PrintWriter output = new PrintWriter(file);
            ) {
                for(int i=0;i<numbers.size();i++){
                    output.print(numbers.get(i)+" ");
                }
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();

        }
    }
}

