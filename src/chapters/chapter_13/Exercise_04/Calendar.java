package chapter_13.Exercise_04;

import java.util.GregorianCalendar;

public class Calendar {
    private int year;
    private int month;
    public Calendar(){
        this(GregorianCalendar.MONTH,GregorianCalendar.YEAR);
    }

    public Calendar(int month,int year){
        this.year=year;
        this.month=month;

    }

    public static void printMonth(int year, int month) {
        //Print title of calendar
        printMonthTitle(year,month);
        //Print contents of calendar
        printMonthBody(year,month);

    }

    public static void printMonthTitle(int year, int month) {
        System.out.println(" " + getMonthName(month)+"   " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

    }
    public static String getMonthName(int month) {
        //Get month name
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }

        return monthName;

    }
    public static void printMonthBody(int year, int month) {
        // Get start  first date in the month
        int startDay=getStartDay(year,month);
        // Get number of days in the month
        int numberOfDaysInMonth=getNumberOfDaysInmonth(year,month);
        for(int i=0;i<startDay;i++){
            System.out.print("    ");
        }
        for(int i=1;i<=numberOfDaysInMonth;i++){
            System.out.printf("%4d",i);
            if((i+startDay)%7==0){
                System.out.println();
            }

        }
        System.out.println();
    }

    public static int getStartDay(int year, int month) {
        // Get the start day of month in a year
        final int START_DAY_FOR_JAN_1_1800 = 3;//First day of January,1800
        int totalNumberOfDays=getTotalNumberOfDays(year,month);
        // Return the start day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;

    }

    public static int getTotalNumberOfDays(int year, int month) {
        // Get the total number of days since 1,January,1800
        int total=0;
        for(int i=1800;i<year;i++){
            if(isLeapYear(i)){
                total=total+366;
            }else{
                total=total+365;
            }
        }// Add days from Jan to the month prior to the calendar month
        for(int i=1;i<month;i++){
            total=total+getNumberOfDaysInmonth(year,i);

        }
        return total;
    }



    public static int getNumberOfDaysInmonth(int year, int month) {
        //Determine of months have 30 days or others

        if (month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 31;

    }
    public static boolean isLeapYear(int year) {
        // Determine Leap year
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}



