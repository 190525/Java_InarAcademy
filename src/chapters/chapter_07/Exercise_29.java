package chapter_07;

import java.util.Arrays;

// Game: pick four cards
//a program that picks four cards from a deck of 52 cards and computes their sum.
// Display the number of picks that yields the sum of 24.
public class Exercise_29 {
    public static void main(String[] args) {
        int[] deck=new int[52];
        for(int i=0;i<52;i++){
            //Since the number of cards in the deck is between 1-13, the array filled with numbers 1-13 (4 times for 4 suits).
            deck[i]=(i%13)+1;
        }
        printSumOfCard(sumOfCard(deck));

    }

    public static void printSumOfCard(int[] sumOfCard) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};
        for(int i=0;i<sumOfCard.length-1;i++){
            String suit=suits[sumOfCard[i]/13];
            String  rank= ranks[sumOfCard[i]%13];
            System.out.println(suit+" "+rank);
        }
        System.out.println(sumOfCard[4]);
    }

    public static int[] sumOfCard(int[]deck){
        int []indexOfSumDeck=new int[5]; // last index shows number of pick
        int sum=0;
        int pickNumber=1;
        while(sum!=24) {
            sum=0;
            for (int i = 0; i < 4; i++) {
                int index=(int)(Math.random()*deck.length); // generating  index random index number
                sum+=deck[index];
                indexOfSumDeck[i]=index;

            }
            pickNumber++;
        }
        indexOfSumDeck[4]=pickNumber;
        return indexOfSumDeck;
    }
}

