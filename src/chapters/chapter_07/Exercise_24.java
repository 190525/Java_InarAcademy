package chapter_07;
// Simulation: coupon collector’s problem
public class Exercise_24 {
    public static void main(String[] args) {

        int []deck=new int[52];
        for(int i=0;i<deck.length;i++){
            deck[i]=i;
        }
        deck=shuffle(deck);
        printPickedCards(deck);

    }
    public static int [] shuffle(int[]deck){
        // Shuffle the cards
        for(int i=0;i<deck.length;i++){
            int index=(int)(Math.random()*deck.length); // generating  index random index number

            // swap
            int temp=deck[index];
            deck[index]=deck[i];
            deck[i]=temp;
        }
        return deck;
    }
   public static void printPickedCards(int []deck){
       String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
       String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};
       String[] controlSuits=new String[4]; //array to store the selected suits after each selection made in different suits
       int controlSuitsIndex=0;
       int pickNumber=0; // variable to store number of picks

       for(int i=0;i< deck.length;i++){
           pickNumber++;
           int index=(int)(Math.random()*deck.length);
           String suit=suits[deck[index]/13];
           String  rank= ranks[deck[index]%13];

           // prerequisite to have one of each card type
           if(suits[deck[index]/13]!=controlSuits[0] &&suits[deck[index]/13]!=controlSuits[1]
                   &&suits[deck[index]/13]!=controlSuits[2]&& suits[deck[index]/13]!=controlSuits[3]){

           // Each different selection is saved in the array to choose a different suits each time.
           controlSuits[controlSuitsIndex]=suits[deck[index]/13];
           System.out.println(rank + " of " + suit);
           controlSuitsIndex++;
           }
           if(controlSuitsIndex==4) {
               break;
           }

       }
       System.out.println("Number of picks: "+pickNumber);

   }
}



