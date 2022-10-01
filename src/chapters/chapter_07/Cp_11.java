package chapter_07;
// print array 
public class Cp_11 {
    public static void main(String[] args) {
        int []list={1,2,3,4,5};
        for(int i=1;i<list.length;i++){
            list [i]=list[i-1];
        }

        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}

