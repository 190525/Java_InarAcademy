import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) throws Exception {
        File file=new File("C:\\Users\\Sys\\Desktop\\ders falan\\Exercise_17.txt.txt");
        ArrayList<String>list=new ArrayList<>();
        String removeString="import";
        if(!file.exists()){
            System.out.println(file+" is not found!!!");
            System.exit(0);
        }
        Scanner input=new Scanner(file);

        String s="";
        while (input.hasNextLine()){
            s=input.nextLine();
            list.add(s.replaceAll(removeString,"Ismail"));

        }
        try (
                PrintWriter output=new PrintWriter(file);
                ){
            for(int i=0;i< list.size();i++){
                output.println(list.get(i));
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Complete!!!");
    }
}

