package chapters.chapter_08;

import java.util.Scanner;

// Game: play a tic-tac-toe game
public class Exercise_09 {
    private static Scanner input=new Scanner(System.in);
    private static int[] usersEntry = new int[2];
    private static final int row=3;
    private static final int col=3;
    private static  int[][] grid=new int[row][col];
    private static boolean isXTurn =true;

    public static void main(String[] args) {
        display();
        do {
            isXTurn = !isXTurn;
            askUserForInput();
            int rowNumber=input.nextInt();
            int columnNumber=input.nextInt();
            while(!((rowNumber>=0&& rowNumber<=2)&&(columnNumber>=0&&columnNumber<=2))){
                System.out.println("Invalid Entry!!!");
                askUserForInput();
                rowNumber= input.nextInt();
                columnNumber= input.nextInt();
            }
            usersEntry[0] = rowNumber;
            usersEntry[1] = columnNumber;

            if (!isValid(usersEntry)) {
                isXTurn = !isXTurn;
                System.out.println("Invalid Entry!!!");
                continue;
            }
            processEntryToGrid();
            display();
        }while (!isGameOver());

    }private static void display(){
        for(int i=0;i<row;i++){
            System.out.print("|");
            for(int j=0;j<col;j++){
                char ch=' ';
                if(grid[i][j]==1){
                    ch='X';
                }else if(grid[i][j]==2){
                    ch='O';
                }
                System.out.printf("%2s |",ch);

            }
            System.out.println();
            System.out.println("-------------");
        }

    }
    private static void askUserForInput(){
        String token= isXTurn ? "X" : "0";
        System.out.printf("Enter a row (0, 1, or 2) for player %s\n",token);
        System.out.printf("Enter a column (0, 1, or 2) for player %s\n",token);

    }
    private static boolean isValid(int []usersEntry){
        if((usersEntry[0]<0||usersEntry[0]>2)&&(usersEntry[1]<0||usersEntry[1]>2)){
            return false;
        }
        if(!isTheLocationFull(usersEntry)){
            return false;
        }
        return true;
    }
    private static boolean isTheLocationFull(int []usersEntry){
              return  grid[usersEntry[0]][usersEntry[1]]==0;

    }
    private static void processEntryToGrid(){
        grid[usersEntry[0]][usersEntry[1]]= isXTurn ? 1 : 2;
    }
    private static boolean isGameOver(){
        if(sameRow()||sameCol()||rightDiagonal()||leftDiagonal()){ //winning case
            System.out.printf("WINS!!!! %s ", isXTurn ? "X" : "O");
            return true;
        } else if (isTheGridFull()) { // drawing case
            System.out.println("İt's draw!!!");
            return true;
        }else{
            return false;
        }
    }
    private static boolean isTheGridFull(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    return false;
                }

            }
        }
        return true;

    }

    private static boolean sameRow(){
        int num= isXTurn ?1:2;
        for(int i=0;i<row;i++){
            int counter=0;
            for(int j=0;j<col;j++){
                if(grid[i][j]==num){
                    counter++;
                }else{
                    counter=0;
                }
                if(counter==3){
                    System.out.println("Same row!!!");
                    return true;
                }
            }
        }
        return false;

    }
    private static boolean sameCol() {
        int num = isXTurn ? 1 : 2;
        for (int i = 0; i < col; i++) {
            int counter = 0;
            for (int j = 0; j < row; j++) {
                if(grid[j][i]==num){
                    counter++;
                }else{
                    counter=0;
                }

                if (counter == 3) {
                    System.out.printf("SAME COL!!!");
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean leftDiagonal() {
        int xCounter = 0;
        int oCounter = 0;

        if (grid[2][0] == 1) {
            xCounter++;
        } else if (grid[2][0] == 2) {
            oCounter++;
        }
        if (grid[1][1] == 1) {
            xCounter++;
        } else if (grid[1][1] == 2) {
            oCounter++;
        }
        if (grid[0][2] == 1) {
            xCounter++;
        } else if (grid[0][2] == 2) {
            oCounter++;
        }
        if (xCounter == 3 || oCounter == 3) {
            System.out.printf("LEFT DIAGONAL!!");
            return true;
        } else {
            return false;
        }
    }
    private static boolean rightDiagonal() {
        int xCounter=0;
        int oCounter=0;

       if(grid[0][0]==1){
           xCounter++;
       }else if(grid[0][0]==2){
           oCounter++;
       }
        if(grid[1][1]==1){
            xCounter++;
        }else if(grid[1][1]==2){
            oCounter++;
        }
        if(grid[2][2]==1){
            xCounter++;
        }else if(grid[2][2]==2){
            oCounter++;
        }
        if(xCounter==3||oCounter==3){
            System.out.printf("RİGHT DIAGONAL!!");
            return true;
        }else{
            return false;
        }

    }

}

