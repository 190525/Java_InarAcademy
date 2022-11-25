import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Sys\\Desktop\\ders falan\\Soru04.java");

        if (!file.exists()) {
            System.out.println(file + " is not found!!!");
            System.exit(0);
        }
        String str ="";
        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;

        try (
            Scanner input=new Scanner(file);
        ){
            while (input.hasNext()){
                str= input.nextLine();
                lineCount++;
                charCount+=countChars(str);
                wordCount+=countWords(str);
            }
            System.out.println("The file has "+lineCount+" lines, "+wordCount+" words, "+charCount+ " chars");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static int countWords(String str) {
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=' '&&str.charAt(i+1)==' '){

                count ++;
            }
        }
       return count+1;
    }

    private static int countChars(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;

            }
        }
        return count;
    }
}

