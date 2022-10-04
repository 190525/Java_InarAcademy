package chapter_07;
// Test Pass Array
public class Listing_3 {
    public static void main(String[] args) {
        int []a={1,2};
        //// Swap elements using the swap method
        System.out.println("Before invoking swap, array is {"+a[0]+","+a[1]+"}");
        swap(a[0],a[1]);
        System.out.println("After invoking swap, array is {"+a[0]+","+a[1]+"}");
        // Swap elements using the swapFirstTwoInArray method
        System.out.println("Before invoking swapFirstTwoArray, array is{"+a[0]+","+a[1]+"}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoArray, array is {"+a[0]+","+a[1]+"}");

    }
    /** Swap the first two elements in the array */
    public static void swapFirstTwoInArray(int[] a) {
        int temp=a[0];
        a[0]=a[1];
        a[1]=temp;

    }
    /** Swap two variables */
    public static void swap(int i, int i1) {
        int temp=i;
        i=i1;
        i1=temp;

    }
}

