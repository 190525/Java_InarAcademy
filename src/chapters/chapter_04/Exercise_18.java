package chapters.chapter_04;
//Student major and status

/*M: Mathematics
C: Computer Science
I: Information Technology
Number character 1, 2, 3, 4, which  indicates whether a student is a freshman, sophomore, junior, or senior. */

import java.util.*;
public class Exercise_18 {

	public static void main(String[] args) {

		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter two characters:");
		  String answer = input.nextLine();
		 
		  char major = Character.toUpperCase(answer.charAt(0));
		  char status = answer.charAt(1);
		 
		  String sMajor = "";
		  String sStatus = "";
		 
		  switch (major) {
		  case 'M':
		   sMajor = "Mathematics";
		   break;
		 
		  case 'C':
		   sMajor = "Computer Science";
		   break;
		 
		  case 'I':
		   sMajor = "Information Technology";
		   break;
		 
		  default:
		   System.out.println("Invalid input");
		   System.exit(0);
		   break;
		  }
		 
		  switch (status) {
		  case '1':
		   sStatus = "Freshman";
		   break;
		 
		  case '2':
		   sStatus = "Sophomore";
		   break;
		 
		  case '3':
		   sStatus = "Junior";
		   break;
		 
		  case '4':
		   sStatus = "Senior";
		   break;
		 
		  default:
		   System.out.println("Invalid input");
		   System.exit(0);
		   break;
		  }
		  System.out.println(sMajor + " " + sStatus);

	}

}

