package chapters.chapter_04;
// Random character
public class Exercise_16 {
	public static void main(String[] args) {
		
		 //Uppercase letters are in the 64-91 range.
		  int number = (int) (65 + Math.random() * 26);
		  char letter = (char) number;
		   
		  System.out.println("The random letter is " + letter);
		 
	}
}

