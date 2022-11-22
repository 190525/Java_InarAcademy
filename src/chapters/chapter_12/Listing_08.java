// Listing_08
public class TestNewCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
        System.out.println("Number of object created "+CircleWithException.getNumberOfObjects());

    }
}
