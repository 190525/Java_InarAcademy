package chapter_07;
// Selection Sort (increasing order)
public class Listing_8 {
    public static void main(String[] args) {
        int[] list = {2, 45, 7, 10, 11, 4, 50, 79, 69, 60, 66, 70, 59};
        selectionSort(list);
        for (int i=0;i< list.length;i++){
            System.out.print(list[i]+" ");
        }
    }

  public static int[] selectionSort(int[] list) {

      for(int i=0;i<list.length;i++){
          // Find the minimum in the list[i..list.length-1]
          int currentMin=list[i];
          int currentMinIndex=i;
          for(int j=i+1;j< list.length;j++){
              if(currentMin>list[j]){
                  currentMin=list[j];
                  currentMinIndex=j;
              }
          }
          // Swap list[i] with list[currentMinIndex] if necessary
          if (currentMinIndex!=i){
              list[currentMinIndex]=list[i];
              list[i]=currentMin;
          }
      }
      return list;

  }

}

