// Geometry: the Circle2D class
public class Exercise_11 {
    public static void main(String[] args) {
        Circle2D c1=new Circle2D(2,2,5.5);
        System.out.printf("The area of c1 circle is %.3f  and the perimeter of c1 is %.3f \n",c1.getArea(),c1.getPerimeter());
        System.out.println("c1 circle contains given point: "+c1.contains(3,3));
        System.out.println("c1 circle contains c1 circle: "+c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("c1 circle overlaps c2 circle: "+c1.overlaps(new Circle2D(3,5,2.3)));


    }
}
class Circle2D{
    private double x;
    private double y;
    private double radius;

    public Circle2D(){
        x=0;
        y=0;
        radius=1;
    }
    public Circle2D(double x,double y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;

    }
    public boolean contains(double x, double y) {
        double distance = Math.sqrt((this.x - x) *(this.x - x)+ (this.y - y)*(this.y - y));
        return distance< radius ? true : false;
    }
    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        return (distance + circle.getRadius()) < radius;
    }
    public boolean overlaps(Circle2D circle) {
        double distanceWithPoint = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        double distanceWithRadius = circle.getRadius() + this.radius;

        return distanceWithPoint < distanceWithRadius ? true: false;
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

