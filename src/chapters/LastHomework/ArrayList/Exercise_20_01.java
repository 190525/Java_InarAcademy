//// Display words in ascending alphabetical order

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 /*Combine colliding bouncing balls. The example in Section displays multiple bouncing balls. Extend the example to detect collisions.
 Once two balls collide, remove the later ball that was added to the pane and add its radius to
the other ball, as shown in Figure. Use the Suspend button to suspend
the animation and the Resume button to resume the animation. Add a mouse
pressed handler that removes a ball when the mouse is pressed on the ball.
*/

public class Exercise_20_01 {
   private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Sys\\Desktop\\ders falan\\Exercise_17.txt");

        if (!file.exists()) {
            System.out.println(file + " is not found!!!");
            System.exit(0);
        }


        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                list.add(input.next());
            }
            sortWords();
            print();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private static void sortWords() {
        for(int i = 0; i< list.size(); i++){
            for(int j = 0; j< list.size(); j++){
             int sort= list.get(i).toLowerCase().compareTo(list.get(j).toLowerCase());
             if(sort<0){
                 String temp= list.get(i);
                 list.set(i, list.get(j));
                 list.set(j,temp);
             }
            }
        }
    }
    private static void print() {
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

