// Test Pass Object
public class Listing_10 {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle=new CircleWithPrivateDataFields(1);
        int n=5;// Print circle areas for different times values
        printAreas(myCircle,n);
        System.out.println("Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);


    }

   public static void printAreas(CircleWithPrivateDataFields myCircle, int times) {
       System.out.println("Radius \t\tArea");
       while (times>=1) {
           System.out.println(myCircle.getRadius() + "\t\t" + myCircle.getArea());
           myCircle.setRadius(myCircle.getRadius() + 1);
           times--;
       }

    }
}

