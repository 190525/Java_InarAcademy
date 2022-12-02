package chapter_13.Exercise_06;

import chapter_13.Exercise_06.Circle;

public abstract class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle(){
        super();
    }
    public ComparableCircle(double radius) {
        super(radius);
    }

    public static int max(Circle o1,Circle o2) {
        if (o1.compareTo(o2) == 1)
            return 1;
        else if (o1.compareTo(o2) == -1) {
            return -1;
        } else {
            return 0;

        }
    }
    public int compareTo(Circle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;

        } else
            return 0;

    }

}

