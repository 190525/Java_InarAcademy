package chapter_07;
// Assign grades
import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers of students :");
        final int numberOfStudents= input.nextInt();
        int []grades=new int [numberOfStudents]; //
        System.out.println("Enter "+numberOfStudents+" students score");
        for(int i=0;i< numberOfStudents;i++){
            grades[i]= input.nextInt();
        }
        getbestGrades(grades);
        printLetterGrades(grades,getbestGrades(grades));

    }

    public static void printLetterGrades(int[] grades, int getbestGrades) {
        char letterGrade=' ';
        for(int i=0;i<grades.length;i++) {
            if (grades[i] >= (getbestGrades - 10)) {
                letterGrade = 'A';
            } else if (grades[i] >= (getbestGrades - 20)) {
                letterGrade = 'B';
            } else if (grades[i] >= (getbestGrades - 30)) {
                letterGrade = 'C';
            } else if (grades[i] >= (getbestGrades - 40)) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }
            System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + letterGrade);

        }

    }

    public static int getbestGrades(int[] grades) {
        int bestScore=0;
        for(int i=0;i<grades.length;i++){
            if(grades[i]>bestScore){
                bestScore=grades[i];
            }
        }
        return bestScore;
    }
}

