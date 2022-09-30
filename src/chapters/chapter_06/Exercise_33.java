public class Exercise_33 {

    /*Display current date and time long n = System.currentTimeMillis();
     Gives the milliseconds since date January,1,1970.(Thursday)*/
    public static void main(String[] args) {

        int year = getYear(getDay(System.currentTimeMillis()));
        String monthName =monthName( getMonth(System.currentTimeMillis()));
        int day = getRemainingDay(System.currentTimeMillis());
        System.out.print("The current date and time is "+monthName+","+day+","+year);
        String time = getCurrentTime(System.currentTimeMillis());
        System.out.println(" " + time+"(GMT)");


    }
    public static String getCurrentTime(long currentTimeMillis) {
        /* With System.currentTimeMillis(), the date default in Java was taken and
        the time from 01/01/1970 to the current date was taken as milliseconds.
        Later, this time was converted to minutes and hours from seconds to find out what time it was.*/

        int seconds = (int) (currentTimeMillis / 1000);
        int currentSecond = seconds % 60;
        int min = seconds / 60;
        int currentMin = min % 60;
        int hours = min / 60;
        int currentHour = hours % 24;

        return currentHour + ":" + currentMin + ":" + currentSecond;
    }

    public static int getDay(long currentTimeMillis) {
        //The total number of days from 01/01/1970  was calculated.
        int seconds = (int) (currentTimeMillis / 1000);
        int currentSecond = seconds % 60;
        int min = seconds / 60;
        int hours = min / 60;
        int day = hours / 24;

        return day;
    }
    public static int getYear(long currentTimeMillis) {
        //The total number of years from 01/01/1970  was calculated.
        long totalDay = getDay(System.currentTimeMillis());
        int year = 1970; //  starting year for System.currentTimeMillis()

        while (totalDay >= 365) {
            /* Since the leap year lasts 366 days,
            the year is increased by one by subtracting 366 from the total number of days and the new remaining day is calculated.*/

            if (isLeapYear(year)) {
                totalDay = totalDay - 366;
                /*Since a year lasts 365 days,
                the year is increased by one by subtracting 365 from the total number of days and the new remaining days are calculated.*/

            } else {
                totalDay = totalDay - 365;
            }
            year++;
        }
        return year;
    }
    public static boolean isLeapYear(int year) {
        // It was decided whether the year was leap year or not.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static long getElapsedDayInYears(long currentTimeMillis) {
        /*By calculating the days in the years that have passed since 01/01/1970,
        the remaining days for the month and day calculation were found.*/

        long elapseTotalDay = getDay(System.currentTimeMillis());
        int year = 1970; //  starting year for System.currentTimeMillis()
        while (elapseTotalDay >= 365) {
            if (isLeapYear(year)) {
                elapseTotalDay = elapseTotalDay - 366;
            } else {
                elapseTotalDay = elapseTotalDay - 365;
            }
            year++;
        }
        return elapseTotalDay;
    }

    public static int getMonth(long currentTimeMillis) {
        //Calculate which month we are in with the remaining days of the year.
        int year = getYear(currentTimeMillis);
        long elapsedDay = getElapsedDayInYears(currentTimeMillis);
        int month = 0;
        while (elapsedDay > 0) {
            month++;
            elapsedDay -= getNumberOfDaysInMonth(year,month);
        }
        return month;
    }
    public static String monthName(int m) {
        switch (m) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "";
    }
    public static long getNumberOfDaysInMonth(int year, int month) {
        //It was decided how many days the entered months were.
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2)
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }

        else {
            return 30;
        }
    }
    public static int getRemainingDay(long currentTimeMillis) {
        /* With this method, it was decided which day of the month we are on by calculating the number of days remaining from the months.
        When calculating this value, calculations were made by taking into account edge-case scenarios,
        such as the last month lasting 31 days, 30 days, or February 28 or 29 days.
         */
        int year = getYear(currentTimeMillis);
        long elapsedDay = getElapsedDayInYears(currentTimeMillis);
        for(int month=1;month<=12;month++) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (elapsedDay > 31) {

                    elapsedDay -= getNumberOfDaysInMonth(year,month);

                }
            } else if (month == 2)
                if (isLeapYear(year)) {
                    if (elapsedDay > 29) {

                        elapsedDay -= getNumberOfDaysInMonth(year,month);
                    }
                } else {
                    if (elapsedDay > 28) {

                        elapsedDay -= getNumberOfDaysInMonth(year,month);

                    }
                }
            else {

                if (elapsedDay > 30) {

                    elapsedDay -= getNumberOfDaysInMonth(year,month);
                }
            }
        }
        return (int) elapsedDay+1;
    }
}

