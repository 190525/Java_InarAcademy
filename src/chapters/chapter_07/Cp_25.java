package chapter_07;
// Selection sort(decreasing order)
public class Cp_25 {
    public static void main(String[] args) {
        int[] list = {2, 45, 7, 10, 11, 4, 50, 79, 69, 60, 66, 70, 59};
        selectionSort(list);
        for (int i=0;i< list.length;i++){
            System.out.print(list[i]+" ");
        }
    }public static int[] selectionSort(int[]list){
        // Find the maximum in the list[i..list.length-1]

        for(int i=0;i< list.length;i++){
            int currentMax=list[i];
            int currentMaxIndex=i;
            for(int j=i+1;j< list.length;j++){
                if(currentMax<list[j]){
                    currentMax=list[j];
                    currentMaxIndex=j;
                }
            }if(currentMaxIndex!=i){
                list[currentMaxIndex]=list[i];
                list[i]=currentMax;
            }
        }
        return list;

    }

}

