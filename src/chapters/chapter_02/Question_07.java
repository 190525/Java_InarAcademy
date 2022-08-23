package chapters.chapter_02;
//FindTheNumberOfYears
import java.util.*;
public class Question_07 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of minutes: ");
	double minutes = input.nextDouble();
	double minutesToYears = minutes / 60 / 24 /365;
	double remainigMinutes = minutes % minutesToYears; 
	double minutesToDays = remainigMinutes / 60 / 24 ;
	int years = (int) (minutesToYears);
	int days =(int)(minutesToDays);
	
	
	System.out.println(minutes + "minutes is approximately "+ years+ " years and " + days +" days ");
	
 }
}

