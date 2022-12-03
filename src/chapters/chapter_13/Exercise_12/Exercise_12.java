package chapter_13.Exercise_12;

public class Exercise_12 {
    public static void main(String[] args) {

        GeometricObject[] objects = createdObjectArray();
        double sum=sumArea(objects);
        System.out.printf("The total area of created objects is %.3f",sum);
    }

    public static GeometricObject[] createdObjectArray() {
        GeometricObject []objects=new GeometricObject[4];
        objects[0]=new Circle(12);
        objects[1]=new Circle(5);
        objects[2]=new Rectangle(5,12);
        objects[3]=new Rectangle(24,25);
        return objects;
    }

    public static double sumArea(GeometricObject[] a){
        double sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i].getArea();
        }
        return sum;
    }
}

