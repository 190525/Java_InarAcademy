public class Exercise_01 {
    //Math: pentagonal numbers
    public static void main(String[] args) {
        final int NUMBERS_OF_PENTAGONAL_NUMBERS = 100;
        int count = 0;
        for (int i = 1; i <= NUMBERS_OF_PENTAGONAL_NUMBERS; i++) {

            System.out.printf("%6d", getPentagonalNumber(i));
            count++;
            if (count % 10 == 0) {//Determine to pass next line
                System.out.println();
            }

        }
    }
    public static int getPentagonalNumber(int n){
        int pentagonalNumber=n*(3*n-1)/2;// formula's of pentagonal number
        return pentagonalNumber;
    }
}

