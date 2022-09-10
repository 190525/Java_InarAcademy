package chapters.chapter_05;

//  Compute e
public class Exercise_26 {
	public static void main(String[] args) {
		double e=0;
		double factorial=1;
		
		for(int i=1;i<=10000;i++) {
			factorial*=i;
			e+=1/factorial;
		}
		System.out.println(1+e);
		for(int i=1;i<=20000;i++) {
			factorial*=i;
			e+=1/factorial;
		}
		System.out.println(1+e);
		for(int i=1;i<=100000;i++) {
			factorial*=i;
			e+=1/factorial;
		}
		System.out.println(1+e);



	}

}

