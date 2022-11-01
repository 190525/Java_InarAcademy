
public class Cp_24 {
    public static void main(String[] args) {
        Circle circle1=new Circle(1);
        Circle circle2=new Circle(2);
        swap1(circle1,circle2);
        System.out.println("After swap1: circle1="+circle1.radius+" and circle c2="+circle2.radius);
        swap2(circle1,circle2);
        System.out.println("After swap2: circle1="+circle1.radius+" and circle c2="+circle2.radius);

    }

    private static void swap1(Circle circle1, Circle circle2) {
        Circle temp=circle1;
        circle1=circle2;
        circle2=temp;
    }

    private static void swap2(Circle circle1, Circle circle2) {
        double temp = circle1.radius;
        circle1.radius = circle2.radius;
        circle2.radius = temp;

    }
}
class Circle{
    double radius;

    Circle(double newRadius){
        radius=newRadius;
    }
}

