package chapters.chapter_08;
// Sort students on grades
public class Exercise_03 {
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] correctNumber=answerControl(answers,keys);
        int [][]sortedCorrectNumber=sortedCorrectNumber(correctNumber);
        printArray(sortedCorrectNumber);
    }



    public static int[][] answerControl(char[][] answers, char[] keys) {
        int [][]correctNumberWithStudents=new int[answers.length][2];
        for ( int i=0;i< answers.length;i++){
            int correctCount=0;
            for (int j=0;j<answers[i].length;j++){
                if(answers[i][j]==keys[j]){
                    correctCount++;
                }

            }
            correctNumberWithStudents[i][0]=i;
            correctNumberWithStudents[i][1]=correctCount;


        }
        return correctNumberWithStudents;
    }
    public static int[][] sortedCorrectNumber(int [][]correctNumberWithStudents){

        for(int i=0;i<correctNumberWithStudents.length;i++){
            for(int j=i+1;j<correctNumberWithStudents.length;j++){
                if(correctNumberWithStudents[i][1]>correctNumberWithStudents[j][1]){
                    int tempStudentIndex=correctNumberWithStudents[i][0];
                    correctNumberWithStudents[i][0]=correctNumberWithStudents[j][0];
                    correctNumberWithStudents[j][0]=tempStudentIndex;

                    int temp=correctNumberWithStudents[i][1];
                    correctNumberWithStudents[i][1]=correctNumberWithStudents[j][1];
                    correctNumberWithStudents[j][1]=temp;
                }
            }
        }
        return correctNumberWithStudents;
    }
    public static void printArray(int[][] sortedCorrectNumber) {

        for(int row=0;row< sortedCorrectNumber.length;row++){

                System.out.println((sortedCorrectNumber[row][0]+1)+".students has "+sortedCorrectNumber[row][1]+" correct");

        }
    }
}

