public class Exercise_30 {
    //Game: craps
    public static void main(String[] args) {
        int rollDie1 = rollDie1();
        int rollDie2 = rollDie2();
        int rolled = rollDie1 + rollDie2;
        System.out.println("You rolled " + rollDie1 + " + " + rollDie2 + " = " + rolled);
        String rolledDie = checkRollDie(rolled);

        if (rolledDie.equals("craps")) {
            System.out.println("You lose");

        } else if (rolledDie.equals("natural")) {
            System.out.println("You win");

        } else {
            System.out.println(rollDiePoint(rolled));

        }
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

    public static String rollDiePoint(int rolled) {
        int point = rolled;
        System.out.println("point is " + point);

        int rollDie1 = rollDie1();
        int rollDie2 = rollDie2();
        rolled = rollDie1 + rollDie2;
        System.out.println("You rolled " + rollDie1 + " + " + rollDie2 + " = " + rolled);

        if (point == rolled) {
            return "You win";
        }
        else {
           return "You lose";

        }
    }
}

