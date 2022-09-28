import java.util.Scanner;

public class Exercise_25 {
    //Convert milliseconds to hours, minutes, and seconds
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a milliseconds you want to convert to hours, minutes, and seconds.");
        long millis= input.nextLong();
        String convertedMilliseconds=convertMillis(millis);
        System.out.println(convertedMilliseconds);

    }
    public static String convertMillis(long millis){
        long seconds = millis / 1000;
        long conversionSecond = seconds % 60;
        long min = seconds / 60;
        long conversionMinutes = min % 60;
        long hours = min / 60;
        long conversionHours = hours % 24;
        return conversionHours + ":" + conversionMinutes + ":" + conversionSecond;

    }
}

