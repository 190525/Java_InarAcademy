package chapter_07;
//  Display the random  four index  cards of deck
public class Cp_12 {
    public static void main(String[] args) {

    int []deck=new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};

    // Initialize the cards
    for(int i=0;i<deck.length;i++){
        deck[i]=i;
    }
        // Shuffle the cards
    for(int i=0;i<deck.length;i++){
        int index=(int)(Math.random()*deck.length); // generating number index

        // swap algorithm
        int temp=deck[index];
        deck[index]=deck[i];
        deck[i]=temp;
    }
    // Display the random  four index cards of deck
    for(int i=0;i<4;i++){
        int index=(int)(Math.random()*deck.length);
        String suit=suits[deck[index]/13];
        String  rank= ranks[deck[index]%13];
        System.out.println("Card number " + deck[index] + ": " + rank + " of " + suit);

    }

    }
}

