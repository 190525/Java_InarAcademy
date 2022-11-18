// Use ArrayList

import java.util.ArrayList;
public class Exercise_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new MyDate());
        list.add(new Loan(100000,5,5));
        list.add("ismail");
        list.add(new CircleFromSimpleGeometricObject(2,"blue",true));

        for (int i = 0; i < list.size(); i++) {
            System.out.println((list.get(i)).toString());
        }

    }
}

