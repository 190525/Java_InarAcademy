package chapter_13.Exercise_12;

public class Rectangle extends GeometricObject {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    public int compareTo(Rectangle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;

        } else
            return 0;
    }
    @Override
    public boolean equals(Object obj) {
        return this.compareTo((Rectangle) obj)==0 ? true: false;
    }
}

