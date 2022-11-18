// Shuffle ArrayList

import java.util.ArrayList;
public class Exercise_07 {public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < 25; i++) {
        list.add((int)(Math.random() *1000));
    }

    System.out.println("Before shuffle:\n"+list);

    shuffle(list);
    System.out.println("After shuffle:\n"+list);

}

    public static void shuffle(ArrayList<Integer> list) {
        // manual shuffle
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            int temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }

    }

}

