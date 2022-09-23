public class Exercise_08 {
    //Conversions between Celsius and Fahrenheit
    public static void main(String[] args) {
        System.out.println("     Celsius  Fahrenheit   |   Fahrenheit  Celsius");
        System.out.println("     ---------------------------------------------");
        double fahrenheit=140;
        for(double celsius=40;celsius>=25;celsius--){
            celsiusToFahrenheit(celsius);
            System.out.printf("%10.2f",celsius);
            System.out.printf("%10.2f",fahrenheit);
            System.out.print("       | ");

            fahrenheitToCelsius(fahrenheit);
            System.out.printf("%10.2f",fahrenheit);
            System.out.printf("%10.2f",celsius);
            System.out.println();
            fahrenheit=fahrenheit-10;
        }


    }
    // Convert from Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius){
            double fahrenheit = (9.0 / 5) * celsius + 32;
            return fahrenheit;

    }
    //Convert from Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit){

        double celsius = (5.0 / 9) * (fahrenheit-32);
        return  celsius;
    }
}

