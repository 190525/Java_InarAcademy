import java.util.Scanner;

public class Exercise_34 {
    // Print calendar using Zeller’s algorithm to get the start day of the month.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter month as number between 1 and 12: ");
        int month = input.nextInt();

        printMonthTitle(year,month);
        printfirstDay(month, year);
        printCalendar(month, year);
    }
    public static void printMonthTitle(int year, int month) {
        System.out.println("     " + getMonthName(month)+"   " + year);
        System.out.println("----------------------------");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

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
    public static void printfirstDay(int month, int year) {
        int firstDay =zellersAlgorithm(1, month, year);

        String fistDay = "1";


        for (int i = 1; i < firstDay-1; i++) {
            fistDay = "\t" + fistDay;
        }
        if (firstDay == 0) {
            fistDay = "\t\t\t\t\t\t1";
        }

        System.out.print(fistDay + "\t");
    }
    public static void printCalendar(int month, int year) {
        int firstDayOfMonth=zellersAlgorithm(1,month,year);
        int lastDayOfMonth = durationOfMonth(month, year);

        for (int i = 2; i <= lastDayOfMonth; i++) {
            int printedDay = zellersAlgorithm(i, month, year);
            if ((printedDay+firstDayOfMonth)%7== 0) {
                System.out.println();
            }
            System.out.print(i + "\t");
        }
    }

    public static int zellersAlgorithm(int dayOfMonth, int month, int year) {
        if (month == 1 || month == 2) {
            month = month + 12;
            year--;
        }
        int q;
        int m;
        int j;
        int k;
        q = dayOfMonth;
        m = month;
        j = year / 100;
        k = year % 100;
        return (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + (5 * j)) % 7;

    }
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    public static int durationOfMonth(int month,int year){
        int dayNumber;
        if (month == 4 || month == 6  || month == 9 || month == 11) {
            dayNumber = 30;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                dayNumber = 29;
            } else {
                dayNumber = 28;
            }
        } else {
            dayNumber = 31;
        }
        return dayNumber;
    }
    }




