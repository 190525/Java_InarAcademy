// The MyDate class and its test class
import java.util.GregorianCalendar;
public class Exercise_14 {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(34355555133101L);
        System.out.println(myDate1.getDay()+"/"+myDate1.getMonth()+"/"+myDate1.getYear()+" (for myDate1)");
        System.out.println(myDate2.getDay()+"/"+myDate2.getMonth()+"/"+myDate2.getYear()+" (for myDate2)");

    }

}
class MyDate{
    private int year;
    private int month;
    private int day;
    GregorianCalendar gregorianCalendar = new GregorianCalendar();


    public MyDate() {
        this(System.currentTimeMillis());
    }
    public MyDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(long elapsedTime) {
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(GregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(GregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

