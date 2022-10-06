package chapter_07;
// Count Single Digits
public class Exercise_07 {
    public static void main(String[] args) {

        final int LENGTH_OF_ARRAY=countNumberOfDigits(getRandomDigits()).length;
        int []count=countNumberOfDigits(getRandomDigits());

        for(int i=0;i<LENGTH_OF_ARRAY ;i++){

            System.out.println("NUmber of "+i+" is "+count[i]);
        }

    }
    public static int[] countNumberOfDigits(int[]getRandomDigits){
        int []count=new int[10];// There is just 10 single digit numbers
        for(int i=0;i< getRandomDigits().length;i++){
            switch(getRandomDigits[i]){

                case 0:
                    count[0]++;
                    break;
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                case 4:
                    count[4]++;
                    break;
                case 5:
                    count[5]++;
                    break;
                case 6:
                    count[6]++;
                    break;
                case 7:
                    count[7]++;
                    break;
                case 8:
                    count[8]++;
                    break;
                case 9:
                    count[9]++;
                    break;

            }
        }
        return count;
    }
    public static int[] getRandomDigits(){

       final int NUMBER_OF_DİGİTS=100;
       int [] digits=new int[NUMBER_OF_DİGİTS];
        for(int i=0;i<NUMBER_OF_DİGİTS;i++){
            digits[i]=(int)(Math.random()*10);

        }
        return digits;
    }
}

