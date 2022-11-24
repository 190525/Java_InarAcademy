package chapter_12.Exercise_05;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        System.out.println("One side of triangle must not greater than the sum of other sides");
    }
}

