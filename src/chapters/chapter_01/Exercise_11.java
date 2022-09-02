package chapter_01;

/** Population projection
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 */

public class Exercise_11 {
	public static void main(String[] args) {

        double birth = 7.0;
        double death= 13.0;
        double immigration = 45.0; 
        double secondsInyear = 60 * 60 * 24 * 365;
        double birthInYear = secondsInyear/birth;
        double deathInYear = secondsInyear/death;
        double immigrationInYear = secondsInyear/immigration;
        double incrementRate = birthInYear - deathInYear + immigrationInYear;
        double currentPopulation = 312032486;
        double firstYearPopulation = currentPopulation + incrementRate;
        double secondtYearPopulation = firstYearPopulation + incrementRate;
        double thirthYearPopulation = secondtYearPopulation+ incrementRate;
        double fourthYearPopulation = thirthYearPopulation + incrementRate;
        double fifthYearPopulation = fourthYearPopulation + incrementRate;
        
        System.out.println("The population in year 1 will be " + firstYearPopulation );
        System.out.println("The population in year 2 will be " + secondtYearPopulation );
        System.out.println("The population in year 3 will be " + thirthYearPopulation );
        System.out.println("The population in year 4 will be " + fourthYearPopulation );
        System.out.println("The population in year 5 will be " + fifthYearPopulation );
    
    
        }
	


}
