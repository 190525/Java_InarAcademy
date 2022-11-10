public class Exercise_03 {
    public static void main(String[] args) {

        MyInteger myInteger1 = new MyInteger(25);
        MyInteger myInteger2 = new MyInteger(25);
        MyInteger myInteger3 = new MyInteger(1905);
        System.out.println("Number      isPrime     isOdd     isEven     ");
        System.out.println("---------------------------------------------");
        System.out.println(myInteger1.getValue()+"           "+myInteger1.isPrime()+"        "+myInteger1.isOdd()+"      "+ myInteger1.isEven());
        System.out.println(myInteger2.getValue()+"           "+myInteger2.isPrime()+"        "+myInteger2.isOdd()+"      "+ myInteger2.isEven());
        System.out.println(myInteger3.getValue()+"         "+myInteger3.isPrime()+"       "+myInteger3.isOdd()+"      "+ myInteger3.isEven());

        System.out.printf("Num 1 =? Num 2: %b\n", myInteger1.equals(myInteger2));
        System.out.printf("Num 1 =? Num 3: %b\n", myInteger1.equals(myInteger3));

        String s="190525";
        System.out.printf("Parse int 2022 string value == %d\n", MyInteger.parseInt(s));
        char[] array = {1, 2, 3, 4, 5};
        System.out.printf("Parse int 1000 char array value == %d\n", MyInteger.parseInt(array));

    }
}
class MyInteger{
    private int value;
    public MyInteger(int value){
        this.value=value;
    }
    public boolean isEven(){
        return value%2==0;
    }
    public boolean isOdd(){
        return !(value%2==0);
    }
    public boolean isPrime() {
        double number = Math.sqrt(value);
        for (int i = 2; i < number; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !(value%2==0);
    }

    public static boolean isPrime(int value) {
        double number = Math.sqrt(value);

        for (int i = 2; i < number; i++) {
            if (value % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }
    public static int parseInt(char[]value){
        int summation = 0;
        for (int i = 0; i < value.length; i++) {

            summation += value[i];
        }
        return summation;

    }
    public static int parseInt(String value) {

        return Integer.parseInt(value);
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

