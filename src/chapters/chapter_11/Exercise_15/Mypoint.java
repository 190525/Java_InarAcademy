package chapter_11.Exercise_15;

class MyPoint{
   protected double x;
   protected double y;

    public MyPoint(){
        x=0;
        y=0;

    }
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
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

