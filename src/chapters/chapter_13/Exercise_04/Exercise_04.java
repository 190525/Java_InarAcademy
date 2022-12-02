package chapter_13.Exercise_04;

public class Exercise_04 {
    public static void main(String[] args) {
        if(args.length==2) {
            int year = Integer.parseInt(args[3]);
            int month = Integer.parseInt(args[2]);
            Calendar calendar = new Calendar(month, year);
            calendar.printMonth(month, year);
        }else{
            System.out.println("enter right format!!!(e.g java Exercise13_04 5 2016)");
        }

    }

}
