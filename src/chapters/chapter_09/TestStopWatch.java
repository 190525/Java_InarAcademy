import java.util.Random;

public class TestStopWatch{
    public static void main(String[] args) {
        StopWatch duration=new StopWatch();
        Random random=new Random();

        int[]numberArray=new int[100_000];
        for(int i=0;i< numberArray.length;i++){
            numberArray[i]=random.nextInt(500_000);
        }
        duration.start();
        selectionsort(numberArray);
        duration.stop();
        System.out.println("Time taken while doing selection sort :"+duration.getElapsedTime()+" miliseconds");

    }
    public static void selectionsort(int[] numberArray) {
        int minimum=Integer.MIN_VALUE;
        int minimumİndex=-1;
        for(int i=0;i<numberArray.length;i++){
            if(minimum>numberArray[i]){
                minimum=numberArray[i];
                minimumİndex=i;
            }
        }
    }

}

 class StopWatch {
    private long startTime;
    private long endTime;
    StopWatch(){
        startTime=System.currentTimeMillis();
    }
    void start(){
       startTime=System.currentTimeMillis();
    }
    void stop(){
        endTime=System.currentTimeMillis();
    }
    long getElapsedTime(){
        return endTime-startTime;
    }

}

