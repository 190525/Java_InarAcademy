import java.io.File;
import java.util.Scanner;

public class Exercise_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the directory name to create: ");
        String fileName = input.nextLine();
        File file=new File(fileName);
        if(file.exists()){
            System.out.println(file+" already exists!!!");
            System.exit(1);
        }
        File createdFile=new File("C:\\Users\\Sys\\Desktop\\ders falan\\"+fileName+".txt");
        if(createdFile.mkdirs()){
            System.out.println("Directory created successfully");
        }

    }
}

