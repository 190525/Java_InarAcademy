public class Exercise_09 {
    public static void main(String[] args) {
        System.out.println("      Foot     Meters      |      Meters      Foot");
        System.out.println("     ---------------------------------------------");
        double meters = 20;
        for (double foot = 1; foot <= 10; foot++) {
            footToMeter(foot);
            System.out.printf("%10.2f", foot);
            System.out.printf("%10.2f", meters);
            System.out.print("       | ");

            meterToFoot(meters);
            System.out.printf("%10.2f",meters);
            System.out.printf("%10.2f",foot);
            System.out.println();
            meters=meters+5;
        }
    }

     //Convert from feet to meters
    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;

    }

     //Convert from meters to feet
    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;

    }

}

