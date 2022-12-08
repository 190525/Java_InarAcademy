import java.util.ArrayList;

//Count single digits
public class Exercise_07_07 {
    private static ArrayList<Integer>randomNumber=new ArrayList<>();
   private static ArrayList<Integer>singleDigitsCounter=new ArrayList<>();
    public static final int NUMBER_OF_INTEGERS=100;
    public static void main(String[] args) {
        initalizeSingleDigitsCounter();
        getNumbers();
        countSingleDigits();
        printSingleDigits();

    }

    private static void initalizeSingleDigitsCounter() {
        for(int i=0;i<10;i++){
            singleDigitsCounter.add(i,0);
        }
    }

    private static void getNumbers() {
        for(int i=0;i<NUMBER_OF_INTEGERS;i++){
            int number=(int)(Math.random()*10);
            randomNumber.add(number);
        }
    }

    private static void countSingleDigits() {
        for(int i=0;i<randomNumber.size();i++){
           switch (randomNumber.get(i)){
               case 0:
                  singleDigitsCounter.set(0,singleDigitsCounter.get(0)+1);
                   break;
               case 1:
                   singleDigitsCounter.set(1,singleDigitsCounter.get(1)+1);
                   break;
               case 2:
                   singleDigitsCounter.set(2,singleDigitsCounter.get(2)+1);
                   break;
               case 3:
                   singleDigitsCounter.set(3,singleDigitsCounter.get(3)+1);
                   break;
               case 4:
                   singleDigitsCounter.set(4,singleDigitsCounter.get(4)+1);
                   break;
               case 5:
                   singleDigitsCounter.set(5,singleDigitsCounter.get(5)+1);
                   break;
               case 6:
                   singleDigitsCounter.set(6,singleDigitsCounter.get(6)+1);
                   break;
               case 7:
                   singleDigitsCounter.set(7,singleDigitsCounter.get(7)+1);
                   break;
               case 8:
                   singleDigitsCounter.set(8,singleDigitsCounter.get(8)+1);
                   break;
               case 9:
                   singleDigitsCounter.set(9,singleDigitsCounter.get(9)+1);
                   break;
           }
        }
    }

    private static void printSingleDigits() {
        for(int i=0;i<singleDigitsCounter.size();i++){
            System.out.println("The number of "+i+" is "+singleDigitsCounter.get(i));
        }
    }
}

