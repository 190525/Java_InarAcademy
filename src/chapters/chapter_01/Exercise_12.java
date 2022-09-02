package chapter_01

public class Exercise_12 {

    public static void main(String[] strings) {

        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double distanceInMiles = 24;

        // Converting from miles to kilometers
        double distanceInKilometers = distanceInMiles * 1.60934;

        double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0;

        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes;

        System.out.println(kilometersPerHour);

    }
}
