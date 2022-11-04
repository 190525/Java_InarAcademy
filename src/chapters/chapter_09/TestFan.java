public class TestFan {
    public static void main(String[] args) {
        Fan fan1=new Fan(3,10,true,"yellow");
        Fan fan2=new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        System.out.println("First Fan Information: "+fan1.toString());
        System.out.println("Second Fan Information: "+fan2.toString());


    }

}
class Fan {
    private final int SLOW=1;
    private final int MEDIUM=2;
    private final int FAST=3;
    private int speed;
    private double radius;
    private boolean on;
    private String color;

    Fan(){
        speed=SLOW;
        radius=5;
        on=false;
        color="blue";
    }
    Fan(int speed,double radius,boolean on, String color){
        this.speed=speed;
        this.radius=radius;
        this.on=on;
        this.color=color;
    }
    public int getSpeed(){
        return speed;
    }
    public double getRadius(){
        return radius;
    }
    public  boolean geton(){
        return on;
    }
    public String getColor(){
        return color;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setOn(boolean on){
        this.on=on;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String toString(){
            if (on) {
                return  " Color: " + getColor() + " Radius: " + getRadius()+" Speed: " + getSpeed() ;
            } else {
                return "Color: " + getColor() + " Radius: " + getRadius() + ". The fan is OFF.";
            }
        }
}

