import java.util.Scanner;

public class Exercise_20 {
   //Count the letters in a string
	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=input.nextLine();
        System.out.println("Number of letters in the given string is " +countLetters(str));

    }
    public static int countLetters(String s){
        int length=s.length();
        int countLetter=0;// Number of letter in the string will be found with this value
        for(int i=0;i<length;i++){
            char ch=s.charAt(i);// All elements in the string are taken one by one.
            int valueOfCharacter=(int)ch;
            if((valueOfCharacter>=65&&valueOfCharacter<=90)||(valueOfCharacter>=97&&valueOfCharacter<=122)){
                countLetter++;


            }

        }
        return countLetter;

    }
}

