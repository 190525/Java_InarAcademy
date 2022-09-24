public class Exercise_14{
    //Estimation of pi
    public static void main(String[] args) {
        System.out.println(" i            m(i)");
        System.out.println("-------------------");
        for (int i = 1; i <= 902; i+=100) {       // 902 which is given at question
            System.out.printf("%3d%10s%3.4f\n",i," ",piEstimation(i));
        }
    }
    public static double piEstimation(int number){
        double m_i=0;
          for(int i=1;i<=number;i++) {// Formula of pi calculation for according to  i value
               m_i +=(Math.pow(-1, i + 1) / (2 * i - 1));
          }
          return 4*m_i;
        }
    }



