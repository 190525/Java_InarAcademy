package chapter_07;
// Random number chooser
//a method that returns a random number between 1 and 54, excluding the numbers passed in the argument.
public class Exercise_13 {
    public static void main(String[] args) {
        System.out.println(getRandom());
    }
    public static int getRandom(int... numbers){
       int  number=(int)(Math.random()*54)+1;
        for (int num : numbers) {
            if (number == num) {
                return getRandom(numbers);
            }
        }
        return number;
    }
}

