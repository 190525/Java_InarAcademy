public class Exercise_28 {
    // Mersenne prime
    public static void main(String[] args) {
        System.out.println("p          2^p –1");
        System.out.println("-----------------");
        for(int p=2;p<=31;p++){
            if(mersennePrime(p)!="") {
                int mersenne=Integer.parseInt(mersennePrime(p));
                System.out.printf("%2d%15d\n",p,mersenne);
            }
        }
    }

    public static String mersennePrime(int p) {
        int mersenne = 2;
        for (int i = 1; i < p; i++) {
            mersenne = (int) Math.pow(2, p) - 1;
            if (isPrime(mersenne)) {
                return ""+ mersenne;
            }

        }
        return "";
    }

    public static boolean isPrime(int number){
        // method which use to determine number is prime or not
        int i = 2; // the smallest number to check prime number
        for (i = 2; i <= number/2; i++) {
            if (number % i == 0) {

                return false;
            }
        }
        return true;
    }

}

