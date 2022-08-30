package chapters.chapter_04;
//Days of a month
import java.util.*;
public class Exercise_17 {
	public static void main(String[] args) {
		 
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter a year:");
		  int year = input.nextInt();
		 
		  System.out.println("Enter first three letters of a month name (first letter must be uppercase) :");
		  String month = input.next();
		 
		  int days = 0;
		 
		  switch (month) {
		  case "Jan":
		  case "Mar":
		  case "May":
		  case "Jul":
		  case "Aug":
		  case "Oct":
		  case "Dec":
		   days = 31;
		   break;
		 
		  case "Apr":
		  case "Jun":
		  case "Sep":
		  case "Nov":
		   days = 30;
		   break;
		  
		  case "Feb":
			   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			    days = 29;
			    break;
			   }
			   days = 28;
			   break;
		 
		  default:
		   System.out.println("Invalid month.");
		   System.exit(0);
		 
		  }
		 
		  System.out.println(month + " " + year + " consists of " + days + " days");
		 }

}

