import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Exercise_23 {
    public static void main(String[] args) throws Exception {
        double total=0;
        int count=0;
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()){
                total+= input.nextDouble();
                count++;

            }
            System.out.println("Total scores: "+total+"\nAverage: "+(total/count));


        }catch ( MalformedURLException e){
            e.printStackTrace();
        }
    }
}

