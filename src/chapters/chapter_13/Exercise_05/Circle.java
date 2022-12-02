package chapter_13.Exercise_05;

public class Circle extends ModifyGeometricObject {
    double radius;
    public Circle(){
        radius=1;
    }
   public Circle(double newRadius){
        radius=newRadius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    void setRadius(double newRadius){
        radius=newRadius;
    }

}

