package chapters.chapter_05;

// Game: scissor, rock, paper
import java.util.*;

public class Exercise_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int computerCounter = 0;
		int opponentCounter = 0;
		while (computerCounter < 2 && opponentCounter < 2) {
			int number = (int) (((Math.random() * 100) / 33.34));
			System.out.println(" Please enter scissor (0), rock (1), paper (2):");
			int guess = input.nextInt();
			if (number == guess && number == 0) {
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			} else if (number == guess && number == 1) {
				System.out.println("The computer is rock. You are rock too. It is a draw");
			} else if (number == guess && number == 2) {
				System.out.println("The computer is paper. You are paper. It is a draw");
OAOAOA			} else if (number == 0 && guess == 1) {
				System.out.println("The computer is scissor. You are rock. You won.");
				opponentCounter++;

OAOAOA			} else if (number == 0 && guess == 2) {
				System.out.println("The computer is scissor. You are paper. You lost.");
				computerCounter++;
OAOAOA
			} else if (number == 1 && guess == 0) {
				System.out.println("The computer is rock. You are scissor. You lost.");
OAOAOA				computerCounter++;

OAOAOA			} else if (number == 1 && guess == 2) {
				System.out.println("The computer is rock. You are paper. You won.");
				opponentCounter++;

			} else if (number == 2 && guess == 0) {
				System.out.println("The computer is paper. You are scissor. You won.");
				opponentCounter++;

			} else if (number == 2 && guess == 1) {
				System.out.println("The computer is paper. You are scissor. You lost.");
				computerCounter++;

			}

		}
		System.out.println("Score Table");
		System.out.println("You : " + opponentCounter);
		System.out.println("Computer : " + computerCounter);

	}

}

