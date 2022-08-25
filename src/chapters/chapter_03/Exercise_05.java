package chapters.chapter_03;
//Find future dates

import java.util.*;
public class Exercise_05 {
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.println("Enter today’s days number");
		int today = input.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int elapsedDay = input.nextInt();
		int futureDay = today + elapsedDay;
		String day ="";
		
		 switch(today%7){
		   case 1:day= "Monday";break;
		   case 2:day= "Tuesday";break;
		   case 3:day= "Wednesday";break;
		   case 4:day= "Thursday";break;
		   case 5:day= "Friday";break;
		   case 6:day= "Saturday";break;
		   case 0:day= "Sunday";break;
		  
		  }
		 System.out.print("Today is " + day + " and the future day is "  );
		 switch(futureDay%7){
		   case 1:day= "Monday";break;
		   case 2:day= "Tuesday";break;
		   case 3:day= "Wednesday";break;
		   case 4:day= "Thursday";break;
		   case 5:day= "Friday";break;
		   case 6:day= "Saturday";break;
		   case 0:day= "Sunday";break;
		 }
		 System.out.println(day);
	}
}

