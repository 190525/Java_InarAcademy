package chapter_07;
// Reverse array
public class Cp_17 {
    public static void main(String[] args) {
        int []list={1,2,3,4,5};
        reverseList(list);
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
    public static void reverseList(int[] list) {
        int []newList=new int[list.length];
        for(int i=0;i<list.length;i++){
            newList[i]=list[list.length-1-i];

        }
        list=newList;
    }
}
