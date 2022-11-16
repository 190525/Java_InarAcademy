public class TestTriangleClass {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(5,7,8);
        triangle.setColor("blue");
        triangle.setFilled(true);
        System.out.println("Triangle's area is "+ triangle.getArea()+"\nPerimeter is "+triangle.getPerimeter()
              +"\nColor is "+triangle.getColor()+"\nFilled is "+triangle.isFilled());
    }
}

