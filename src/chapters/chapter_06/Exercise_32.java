public class Exercise_32 {
    /* Game: chance of winning at craps
    The programme runs  10,000 times and display the number of winning games.Also,
    The game results were not printed so that the output of the program would not take too long,
     as there was no request in the question that we should print every game result.
     */
    public static void main(String[] args) {int rollDie1 = rollDie1();
        final int NUMBER_OF_GAME=10000;
        int winning_count=0;
        for(int i=0;i<NUMBER_OF_GAME;i++) {
            int rollDie2 = rollDie2();
            int rolled = rollDie1 + rollDie2;
            String rolledDie = checkRollDie(rolled);

            if (rolledDie.equals("craps")) {

            } else if (rolledDie.equals("natural")) {
                winning_count++;

            } else {

                int point = rolled;

                rollDie1 = rollDie1();
                rollDie2 = rollDie2();
                rolled = rollDie1 + rollDie2;
                if (point == rolled) {

                    winning_count++;
                }
                else {



                }


            }
        }
        System.out.println("You win "+winning_count+" times");
    }

    public static int rollDie1() {
        return (int) (1 + Math.random() * 6);
    }

    public static int rollDie2() {
        return (int) (1 + Math.random() * 6);
    }

    public static String checkRollDie(int rolled) {
        if (rolled == 2 || rolled == 3 || rolled == 12) {
            return "craps";
        } else if (rolled == 7 || rolled == 11) {
            return "natural";
        }
        return "point";

    }

}



