public class Cp_26 {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        }
        catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }
    public static void method() throws Exception {
        try {
            Circle c1 = new Circle(1);
            c1.setRadius(-1);
            System.out.println(c1.getRadius());
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        }
        catch (Exception ex) {
            System.out.println("Exception in method()");
            throw ex;
        }
    }
}
class Circle{
    double radius;
    public Circle(){
        radius=1;

    }
    public Circle(double newRadius){
        radius=newRadius;
    }

    public double getRadius() {
        return radius;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }
    double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void setRadius(double newRadius) throws InvalidRadiusException{
        if(newRadius>=0){
            radius=newRadius;
        } else{
            throw new InvalidRadiusException(newRadius);
        }
    }
}


