//Test MyPoint class
public class Exercise_04 {
        public static void main(String[] args) {
                MyPoint point1 = new MyPoint(0, 0);
                MyPoint point2 = new MyPoint(10, 30.5);

                System.out.printf("The distance between point1 and point2 : %.3f", point2.distance(point1));
        }

}
class MyPoint{
        private double x;
        private double y;

        public MyPoint(){
                x=0;
                y=0;

        }
        public MyPoint(double x,double y){
                this.x=x;
                this.y=y;
        }
        public double distance(double x, double y) {
                return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        }

        public double distance(MyPoint point) {

                return distance(point.x, point.y);
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
}

