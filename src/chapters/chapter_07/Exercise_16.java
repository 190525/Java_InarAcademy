package chapter_07;
// Execution time
// kod ikisi içinde aynı süreyi veriyor
public class Exercise_16 {
    public static void main(String[] args) {
         int[]randomNumbersArray= getRandomNumbers();
        int key=getKey();
        int []sortedArray=selectionSort(randomNumbersArray);
        long startTime = System.currentTimeMillis();
        System.out.println(linearSearch(getRandomNumbers(),key));
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println(executionTime);

        long startTime1 = System.currentTimeMillis();
        System.out.println(binarySearch(sortedArray,key));
        long endTime1 = System.currentTimeMillis();
        long executionTime1 = endTime - startTime;
        System.out.println(executionTime1);


    }
    public static int getKey(){
        int key=(int)(Math.random()*100000);
        return key;
    }
    public static int [] getRandomNumbers(){
        int lengthOfArray=100000;
        int [] numbers=new int[lengthOfArray];

        for(int i=0;i<numbers.length;i++){
            numbers[i]=(int)(Math.random()*100000);
        }
        return numbers;
    }

    public static int linearSearch(int[] numbersArray, int key){

        for(int i=1;i< numbersArray.length;i++){
            if(numbersArray[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static int [] selectionSort(int []numbersArray){

        for(int i=0;i< numbersArray.length;i++){
            int min=numbersArray[0];
            int minIndex=0;
            for(int j=i+1;j<numbersArray.length;j++){
                if(min>numbersArray[j]){
                    min=numbersArray[j];
                    minIndex=j;
                }
                if(minIndex!=i){
                    numbersArray[minIndex]=numbersArray[i];
                    numbersArray[i]=min;
                }
            }


        }
        return numbersArray;
    }
    public static int binarySearch(int []sortedArray, int key){

        for(int i=0;i<sortedArray.length;i++) {
            int low = 0;
            int high = sortedArray.length - 1;
            int mid = (low + high) / 2;
            if (key < sortedArray[mid]) {
                high = mid - 1;
            } else if (key == mid) {
                return mid;

            } else {
                low = mid + 1;
            }
            i++;
        }
        return -1;


    }
}
