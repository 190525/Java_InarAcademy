import java.util.ArrayList;

public class Exercise_03 {
    public static void main(String[] args) {
        ArrayList<Number> list=new ArrayList<>();
        final int NUMBER_OF_ELEMENTS=100;
        final int MAX_VALUE=1000;
        for(int i=0;i<NUMBER_OF_ELEMENTS;i++){
            list.add((int)(Math.random()*MAX_VALUE));
        }
        sort(list);
        display(list);

    }

    public static void sort(ArrayList<Number> list){
        for(int i=0;i<list.size();i++){
            for(int j=0;j< list.size();j++){
                if (list.get(i).intValue() < list.get(j).intValue()) {
                    int temp= (int) list.get(i);
                    list.set(i, list.get(j));
                    list.set(j,temp);

                }
            }
        }

    }
    private static void display(ArrayList<Number> list) {
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}

