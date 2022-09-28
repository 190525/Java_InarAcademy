import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        // Phone keypads
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=input.nextLine();
        String str1=str.toUpperCase();// All elements have been capitalized in string to facilitate comparison.
        int length=str1.length();
        String number="";

        for(int i=0;i<length;i++){
            char ch=str1.charAt(i);//All elements were taken one by one for comparison.
            if(ch>='A'&&ch<='Z'){
                number+= getNumber(ch);
            }else{
                number+=ch;
            }


        }
        System.out.println(number);

    }
    public static int getNumber(char uppercaseLetter){
        //The numbers corresponding to the letters were determined.

        String str=""; //A free space is taken from memory to save all digits.

        switch (uppercaseLetter) {
            case 'A':
            case 'B':
            case 'C':
                str+= 2;

                break;

            case 'D':
            case 'E':
            case 'F':
                str += 3;
                break;

            case 'G':
            case 'H':
            case 'I':
                str += 4;
                break;

            case 'J':
            case 'K':
            case 'L':
                str += 5;
                break;

            case 'M':
            case 'N':
            case 'O':
                str += 6;
                break;

            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                str += 7;
                break;

            case 'T':
            case 'U':
            case 'V':
                str += 8;
                break;

            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                str += 9;
                break;

            default:

                str+=uppercaseLetter;//The numbers in string entered by the user were added directly.

                break;
        }
        int number=Integer.parseInt(str);//String is converted to integer because method returns integer.
        return number;
    }
}

