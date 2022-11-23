// Write Data

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class Listing_13 {
    public static void main(String[] args) throws IOException {
        File file = new File("scores.txt");
        if (file.exists()) {
             System.out.println("File already exists");
             System.exit(1);
            }
        PrintWriter output = new PrintWriter(file);
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        System.out.println(file.getAbsolutePath());
        output.close();

    }
}

