// Use the Date class
import java.util.Date;
public class Exercise_03 {
    public static void main(String[] args) {
        Date date=new Date();
        final long firstElapsedDay=10000;
        final long lastElapseDay= 100000000000L;
        for(long i=firstElapsedDay;i<lastElapseDay;i=i*10){
            date.setTime(i);
            System.out.println(date.toString());
        }
    }
}

