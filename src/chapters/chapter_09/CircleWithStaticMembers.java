// Circle With Static Members(Listing_06)
public class CircleWithStaticMembers {
    double radius;
    static int numberOfObject=0;
    CircleWithStaticMembers(){
        radius=1;
        numberOfObject++;
    }
    CircleWithStaticMembers(double newRadius){
        radius=newRadius;
        numberOfObject++;
    }
    static int getNumberOfObject(){
        return numberOfObject;
    }
    double getArea(){
        return  radius*radius*Math.PI;

    }

}

