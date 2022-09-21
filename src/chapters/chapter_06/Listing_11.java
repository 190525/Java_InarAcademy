public class Listing_11 {
    // Test Listing_10
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;
        int count=0;
        // Print random characters between 'a' and 'z', 25 chars per line
        for (int i=0;i<NUMBER_OF_CHARS;i++){
            char ch=Listing_10.getRandomLowerCase();
            System.out.print(ch);
            count++;
            if(count%CHARS_PER_LINE==0){
                System.out.println();

            }


        }
    }
}
/*public class Listing_10 {


    public static char getRandomCharacter(char ch1,char ch2){

        return (char)(ch1+Math.random()*(ch2-ch1+1));
    }
    //Generate a random lowercase letter
    public static char getRandomLowerCase(){
        return getRandomCharacter('a','z');
    }
    //Generate a random Uppercase letter
    public static char getRandomUpperCase(){
        return getRandomCharacter('A','B');
    }
    //Generate a random digit character
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0','9');
    }
    // Generate a random character
    public static char getRandomCharacter(){
        return getRandomCharacter('\u0000', '\uFFFF');
    }

}*/


