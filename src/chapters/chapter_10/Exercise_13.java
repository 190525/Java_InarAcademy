public class Exercise_13 {
    public static void main(String[] args) {
      MyRectangle2D r1=new MyRectangle2D(2,2,5.5,4.9) ;
        System.out.printf("the area of r1 is %.3f and perimeter is %.3f\n",r1.getArea(),r1.getPerimeter());
        System.out.println(r1.contains(3,3));
        System.out.println(r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
        System.out.println(r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));
    }
}
class MyRectangle2D{
    private double x;
    private double y;
    private double height;
    private double width;
    public MyRectangle2D() {
        x = 0;
        y = 0;
        height = 1;
        width = 1;
    }

    public MyRectangle2D(double x, double y, double height, double width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }
    public boolean contains(double x,double y){
        double minX=this.x-width/2;
        double maxX=this.x+width/2;
        double minY=this.y-height/2;
        double maxY=this.y+height-2;
        if(minX <= x && x <= maxX && minY <= y && y <= maxY){
            return true;
        }
        return false;
    }
    public boolean contains(MyRectangle2D r){
        if (r.getArea() > this.getArea()) {
            return false;
        }
        return ((r.getX() + r.getWidth() / 2) <= (this.getX() + this.getWidth() / 2)) &&
                    ((r.getX() - r.getWidth() / 2) >= (this.getX() - this.getWidth() / 2)) &&
                    ((r.getY() + r.getHeight() / 2) <= (this.getY() - this.getHeight() / 2)  &&
                    ((r.getY() - r.getHeight() / 2) >= (this.getY() - this.getHeight() / 2))) ? true : false;
    }
    public boolean overlaps(MyRectangle2D r){
        return !((r.getX() - r.getWidth() / 2)>= (this.getX() + this.getWidth() / 2)||
                (r.getX() + r.getWidth() / 2)<= (this.getX() - this.getWidth() / 2) ||
                (r.getY() - r.getHeight() / 2) >=(this.getY() + this.getHeight() / 2) ||
                (r.getY() + r.getHeight() / 2) <=(this.getY() - this.getHeight() / 2)) ? true : false;




    }



    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

