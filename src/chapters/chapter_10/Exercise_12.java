// test class and Geometry: the Triangle2D class
public class Exercise_12 {
}
class Triangle2D{
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }
    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double getArea(){
        // distance method is invoked Mypoint class
        double side1=p1.distance(p2);
        double side2 = p2.distance(p3);
        double side3 = p3.distance(p1);
        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }
    public double getPerimeter(){
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);

    }
    /*A noktasının x ve y değerini Ax ve Ay
B noktasının x ve y değerini Bx ve By
C noktasının x ve y değerini Cx ve Cy
P noktasının x ve y değerini Px ve Py şeklinde ifade edelim.
Bu koordinat değerleri yardımıyla ihtiyacımız olan ara değerlerini hesaplayalım.

bx = Bx-Ax
by = By-Ay
cx = Cx-Ax
cy = Cy-Ay
x = Px-Ax
y = Py-Ay
Şimdi bu değerler yardımıyla son dört değerimiz olan d,WA,WB ve WC’ yi hesaplamamız gerekiyor.

d=bx*cy-cx*by
WA=(x*(by-cy)+y*(cx-bx)+bx*cy-cx*by)/d
WB=(x*cy-y*cx)/d
WC=(y*bx-x*by)/d
Bu formüller yardımıyla hesapladığımız WA,WB ve WC değerlerinin hepsi sıfır ve bir arasında ise noktamız üçgenin belirlediği alanın içinde,
eğer bir tanesi bile bu aralığın dışında ise noktamız üçgenin belirlediği alanın dışında demek oluyor.
*/
    public boolean contains(MyPoint p){
        double bx=p2.getX()-p1.getX();
        double by=p2.getY()-p1.getY();
        double cx=p3.getX()-p1.getX();
        double cy=p3.getY()-p1.getY();
        double x=p.getX()-p1.getX();
        double y=p.getY()-p1.getY();

        double d=bx*cy-cx*by;
        double WA=(x*(by-cy)+y*(cx-bx)+bx*cy-cx*by)/d;
        double WB=(x*cy-y*cx)/d;
        double WC=(y*bx-x*by)/d;

        return (0<WA&&WA<1)&&(0<WB&&WB<1)&&(0<WC&&WC<1) ? true : false;

    }
    public boolean contains(Triangle2D t){
        return this.contains(t.getP1()) && this.contains(t.getP2()) && this.contains(t.getP3());
    }
    public boolean overlaps(Triangle2D t) {
        return this.contains(t.getP1()) || this.contains(t.getP2()) || this.contains(t.getP3());
    }


    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}
