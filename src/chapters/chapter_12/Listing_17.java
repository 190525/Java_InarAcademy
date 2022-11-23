// Read File From URL

import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;
public class Listing_17 {
    public static void main(String[] args) throws Exception {
        System.out.println("enter a URL:");
        String URLString=new Scanner(System.in).next();
        try{
            java.net.URL url=new java.net.URL(URLString);
            int count=0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                String line= input.nextLine();
                count+=line.length();
            }
            System.out.println("The file size is " + count + " characters");

        }catch (MalformedInputException ex){
            System.out.println("Invalid URL");

        }catch (IOException ex){
            System.out.println("I/O Errors: no such file");
        }
    }
}

