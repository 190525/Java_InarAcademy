
package chapters.chapter_05;
// Display ASCII Table
public class Exercise_15 {

	public static void main(String[] args) {
		for(int i=33;i<=126;i++) {
			char ch=(char)(i);
			System.out.print(ch+"  ");
			if(i%10==2) {
				System.out.println();
			}
		}

	}

}
