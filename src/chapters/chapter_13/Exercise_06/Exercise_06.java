package chapter_13.Exercise_06;

public class Exercise_06 {
    public static void main(String[] args) {
        Circle circle1=new Circle(4);
        Circle circle2=new Circle(4);
        if(Circle.max(circle1,circle2)==1){
            System.out.println("Circle1 is maximum");
        } else if(Circle.max(circle1,circle2)==-1) {
            System.out.println("Circle2 is maximum");
        }
        else{
            System.out.println("Two circles are equals.");
        }
    }
}

