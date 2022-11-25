import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Sys\\Desktop\\ders falan\\Soru04.java");

        if (!file.exists()) {
            System.out.println(file + " is not found!!!");
            System.exit(0);
        }
        ArrayList<String> list = new ArrayList<>();

        try (
                Scanner input=new Scanner(file);
                ){
            while (input.hasNextLine()){
                String s1 = input.nextLine();
                list.add(s1.replaceAll("Java", "İSMAİL"));
            }
            PrintWriter output=new PrintWriter(file);
            for (int i = 0; i < list.size(); i++) {
                output.println(list.get(i));
            }
            output.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Complete!!!");
    }
}

