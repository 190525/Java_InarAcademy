
public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 4;
        rectangle1.height=40;
        Rectangle rectangle2=new Rectangle();
        rectangle2.width=3.5;
        rectangle2.height=35.9;

        System.out.println("The width of the first rectangle is "+rectangle1.width+" and height is "+rectangle1.height);
        System.out.println("The area of first rectangle  is "+rectangle1.getArea()+" and the perimeter is "+rectangle1.getPerimeter());
        System.out.println("The width of the second rectangle is "+rectangle2.width+" and height is "+rectangle2.height);
        System.out.println("The area of second rectangle  is "+rectangle2.getArea()+" and the perimeter is "+rectangle2.getPerimeter());
    }
}
class Rectangle {
    double width;
    double height;
    Rectangle(){
        width=1;
        height=1;
    }
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return (width+height)*2;
    }
}


