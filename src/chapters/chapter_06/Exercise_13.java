public class Exercise_13 {
    //Sum series ; m(i)=1/2 +2/3 +3/4 +...i/(i+1)
    public static void main(String[] args) {
        int i=20;// it is given maximum value of i in quwstion
        System.out.println(" i           m(i)");
        System.out.println("------------------");
        sumOfNumbers();

    }
    public static void sumOfNumbers() {
        double sum=0;
        final int VALUE_OF_I=20;
        for (int i = 1; i <= VALUE_OF_I; i++) {
            sum += i / (i + 1.0);
            System.out.printf("%2d%10s%3.4f\n",i," ",sum);

        }

    }
}

