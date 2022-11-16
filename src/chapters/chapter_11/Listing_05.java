// Listing_05

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
        displayObject(new RectangleFromSimpleGeometricObject("black",true,1,1));

    }

    private static void displayObject(SimpleGeometricObject object) {
   System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
        }
}


