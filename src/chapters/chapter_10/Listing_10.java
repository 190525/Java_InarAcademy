import java.util.Scanner;

// Palindrome Ignore NonAlphanumeric
public class Listing_10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s=input.nextLine();

        System.out.println("Ignoring nonalphanumeric characters is "+ s + " a palindrome? " + isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        String s1=filter(s);
        String s2=reverse(s1);

        return s1.equals(s2);
    }

    private static String filter(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }

        }
        return stringBuilder.toString();
    }
    private static String reverse(String s1) {
        StringBuilder stringBuilder=new StringBuilder(s1);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}

