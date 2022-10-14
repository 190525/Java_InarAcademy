package chapter_07;
// Game: locker puzzle
public class Exercise_23 {
    public static void main(String[] args) {
        boolean[]lockers=new boolean[100];
        for(int i=1;i<= lockers.length;i++){
            for(int j=i-1;j< lockers.length;j=j+i){
                if(lockers[j]==false){
                    lockers[j]=true;
                }else{
                    lockers[j]=false;
                }
            }
        }
        for(int i=0;i< lockers.length;i++){
            if(lockers[i]==true){
                System.out.print((i+1)+" ");
            }
        }
    }
}



