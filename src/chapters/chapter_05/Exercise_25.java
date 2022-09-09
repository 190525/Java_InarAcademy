package chapters.chapter_05;
//compute pi
public class Exercise_25 {

	public static void main(String[] args) {
		double pi0=0;
		for(int i=1;i<=10000;i++) {
			pi0 += ((Math.pow(-1,i+1 )/(2*i-1)));
		}
		System.out.println("pi number for i=10000 ;"+4*pi0);
		double pi1=0;
		for(int i=1;i<=20000;i++) {
			pi1 += ((Math.pow(-1,i+1 )/(2*i-1)));
		}
		System.out.println("pi number for i=20000 ;"+4*pi1);
		double pi2=0;
		for(int i=1;i<=100000;i++) {
			pi2 += ((Math.pow(-1,i+1 )/(2*i-1)));
		}
		System.out.println("pi number for i=100000 ;"+4*pi2);
		
	}
}

