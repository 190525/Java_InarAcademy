import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise_25 {
    private static final String ASSOCIATE="associate";
    private static final String ASSISTANT="assistant";
    private static final String FULL="full";
    public static void main(String[] args) throws FileNotFoundException {
        double totalSalaryAssociate = 0;
        double totalSalaryAssistant = 0;
        double totalSalaryFull = 0;
        int countAssociate = 0;
        int countAssistant = 0;
        int countFull = 0;

        File file = new File("C:\\Users\\Sys\\Desktop\\ders falan\\Exercise12_15.txt");

        if (!file.exists()) {
            System.out.println("File could not find!!!");
            System.exit(1);
        }
        try(
                Scanner input=new Scanner(file);
                ){

            while (input.hasNextLine()) {
                String[] list = input.nextLine().split(" ");
                if (list.length == 4) {
                    if (list[2].equals(ASSISTANT)) {
                        totalSalaryAssistant += Double.parseDouble(list[3]);
                        countAssistant++;
                    } else if (list[2].equals(ASSOCIATE)) {
                        totalSalaryAssociate += Double.parseDouble(list[3]);
                        countAssociate++;
                    } else if (list[2].equals(FULL)) {
                        totalSalaryFull += Double.parseDouble(list[3]);
                        countFull++;
                    }
                }
            }
            System.out.println("\t\t   ASSISTANT      ASSOCIATE       FULL");
            System.out.println("----------------------------------------------");
            System.out.printf("Average:    %.2f     %.2f      %.2f\n",(totalSalaryAssistant/countAssistant),(totalSalaryAssociate/countAssociate),(totalSalaryFull/countFull));
            System.out.printf("Total:    %.2f      %.2f     %.2f",totalSalaryAssistant,totalSalaryAssociate,totalSalaryFull);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

