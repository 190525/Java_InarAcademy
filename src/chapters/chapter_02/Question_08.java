package chapters.chapter_02;
//CurrentTimeOfGMT
import java.util.*;
public class Question_08 {
	public static void main(String[] args) {
		 
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter the time zone offset to GMT:");
		  int offset = input.nextInt();
		  // calculate offset in seconds
		  offset = offset * 60 * 60;
		 
		  // Obtain the total milliseconds since midnight, Jan 1, 1970
		  double totalMilliseconds = System.currentTimeMillis();
		  
		  double totalSeconds = (totalMilliseconds / 1000) + offset;
		  int seconds =(int) totalSeconds % 60;
		  
		  double totalMinutes = totalSeconds / 60;
		  int minutes =(int)  totalMinutes % 60;
		  
		  double totalHours = totalMinutes / 60;
		  int hours = (int) totalHours % 24;
		 
		 
		  System.out.println("Current time is " + hours + ":"+ minutes + ":" + seconds );
		
	}
		}



