package chapters.chapter_03;

// Game: scissor, rock, paper
import java.util.*;

public class Exercise_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = (int) (((Math.random() * 100) / 33.34));
		System.out.println(" Please enter scissor (0), rock (1), paper (2):");
		int guess = input.nextInt();
		if (number == guess && number == 0) {
			System.out.println("The computer is scissor. You are scissor too. It is a draw");
		} else if (number == guess && number == 1) {
			System.out.println("The computer is rock. You are rock too. It is a draw");
		} else if (number == guess && number == 2) {
			System.out.println("The computer is paper. You are paper. It is a draw");
		} else if (number == 0 && guess == 1) {
			System.out.println("The computer is scissor. You are rock. You won.");

		} else if (number == 0 && guess == 2) {
			System.out.println("The computer is scissor. You are paper. You lost.");

		} else if (number == 1 && guess == 0) {
			System.out.println("The computer is rock. You are scissor. You lost.");

		} else if (number == 1 && guess == 2) {
			System.out.println("The computer is rock. You are paper. You won.");

		} else if (number == 2 && guess == 0) {
			System.out.println("The computer is paper. You are scissor. You won.");

		} else if (number == 2 && guess == 1) {
			System.out.println("The computer is paper. You are scissor. You lost.");

		}

	}

}

