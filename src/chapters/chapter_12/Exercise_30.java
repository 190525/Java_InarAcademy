import java.io.File;
import java.util.Scanner;

public class Exercise_30 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Sys\\Desktop\\ders falan\\Exercise12_15.txt");

        if (!file.exists()) {
            System.out.println("File could not find!!!");
            System.exit(1);
        }try(
                Scanner input=new Scanner(file);
        ) {
            String s="";
            int []occurences=new int[26];
            while (input.hasNextLine()) {
                s= input.nextLine().toUpperCase();
                for(int i=0;i<s.length();i++){
                 char ch=s.charAt(i);
                 if(ch>='A'&&ch<='Z'){
                     occurences[(int)ch-65]++;

                }

            }
        }
            for(int i=0;i< occurences.length;i++){
                char ch=(char)(i+65);
                System.out.println("Number of "+ch+"'s is"+occurences[i]);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

