import java.util.Scanner;

public class Exercise_18 {
    //Check password
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a password");
        String password= input.next();
        if(true==lengthOfPassword(password)&& true==isOnlyLettersAndDigits(password)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
            // Display required condition to correct password
            System.out.println("A password must have at least eight characters.");
            System.out.println("A password consists of only letters and digits.");
            System.out.println("A password must contain at least two digits.");
        }

    }
    public static boolean lengthOfPassword(String password){
        if(password.length()<8){
            return false;
    }  return true;

    }
    public static boolean isOnlyLettersAndDigits(String password){
        int count=0;// count will use to check all password character if satisfy required condition or not
        int countDigit=0;//count will use to check  password character if contain at least two digits or not
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            int valueOfCharacter=(int)ch;
            if((valueOfCharacter>=48&&valueOfCharacter<=57)){
                countDigit++;
            }
            if((valueOfCharacter>=48&&valueOfCharacter<=57)||(valueOfCharacter>=65&&valueOfCharacter<=90)||(valueOfCharacter>=97&&valueOfCharacter<=122)){
                /* first parenthesis check character if digit or not
                   second parenthesis check character if lower-case letter or not
                   third parenthesis check character if upper-case letter or not
                 */
                count++;
            }
        }
        if(count >= 8 && countDigit>=2){
            return true;

        }

        return false;

    }
}

