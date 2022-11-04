public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1=new RegularPolygon();
        RegularPolygon regularPolygon2=new RegularPolygon(6,4);
        RegularPolygon regularPolygon3=new RegularPolygon(10,4,5.6,7.8);

        System.out.println("First object perimeter is "+regularPolygon1.getPerimeter()+" and area is "+regularPolygon1.getArea());
        System.out.println("Second object perimeter is "+regularPolygon2.getPerimeter()+" and area is "+regularPolygon2.getArea());
        System.out.println("Third object perimeter is "+regularPolygon3.getPerimeter()+" and area is "+regularPolygon3.getArea());

    }

}
class RegularPolygon{

    private int n=3;
    private double side=1;
    private double x=0;
    private double y=0;
    RegularPolygon(){
    }
    RegularPolygon(int n,double side){
        this();
        this.n=n;
        this.side=side;
    }

    RegularPolygon(int n, double side, double x, double y){
        this(n,side);
        this.x=x;
        this.y=y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
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
    public  double getPerimeter(){
        return getN()*getSide();
    }
    public double getArea(){
        return (getN()*getSide()*getSide())/(4*Math.tan(Math.PI/getN()));
    }
}

