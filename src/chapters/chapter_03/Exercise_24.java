package chapters.chapter_03;

// Game: pick a card
public class Exercise_24 {
	public static void main(String[] args) {

		int rank = (int) (Math.random() * 13) + 1;
		int suit = (int) (Math.random() * 4) + 1;
		String stringRank = "";
		String stringSuit = "";

		switch (rank) {
		case 1:
			stringRank = "Ace";
			break;
		case 2:
			stringRank = "2";
			break;
		case 3:
			stringRank = "3";
			break;
		case 4:
			stringRank = "4";
			break;
		case 5:
			stringRank = "5";
			break;
		case 6:
			stringRank = "6";
			break;
		case 7:
			stringRank = "7";
			break;
		case 8:
			stringRank = "8";
			break;
		case 9:
			stringRank = "9";
			break;
		case 10:
			stringRank = "Jack";
			break;
		case 11:
			stringRank = "Queen";
			break;
		case 12:
			stringRank = "King";
			break;

		}
		switch (suit) {
		case 0:
			stringSuit = "Clubs";
			break;
		case 1:
			stringSuit = "Diamonds";
			break;
		case 2:
			stringSuit = "Hearts";
			break;
		case 3:
			stringSuit = "Spades";
			break;
		}
		System.out.print("The card you picked is " + stringRank + " of " + stringSuit);

	}

}

