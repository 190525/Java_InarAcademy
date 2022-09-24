public class Exercise_12 {
    // Display a characters
    public static void main(String[] args) {
        char ch1='1';
        char ch2='Z';
        int numberPerLine=10;
        printChars(ch1,ch2,numberPerLine);

    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
       int startPoint=(int)ch1;
       int endPoint=(int)ch2;
       int count=0;

       for(int i=startPoint;i<=endPoint;i++){
           char ch=(char)i;
           System.out.print(ch+" ");
           count++;
           if(count%numberPerLine==0){
               System.out.println();
           }

       }

    }
}

