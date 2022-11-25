import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Sys\\Desktop\\ders falan\\Soru04.java");

        if (!file.exists()) {
            System.out.println(file + " is not found");
            System.exit(0);
        }
        try (
                Scanner input = new Scanner(file);
        ) {
            ArrayList<String> words=new ArrayList<>();
            while (input.hasNext()) {
                words.add(input.next());
            }
            boolean isDataSorted=true;
            for(int i=0;i< words.size()-1;i++) {
                if (words.get(i).compareTo(words.get(i+1))>0){
                    isDataSorted=false;
                }
            }
            if(isDataSorted){
                System.out.println("The strings  are increasing order");
            }else{
                System.out.println("The strings  are not increasing order");
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}


