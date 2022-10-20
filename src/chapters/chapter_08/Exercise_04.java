package chapters.chapter_08;

import java.util.Scanner;

// Compute the weekly hours for each employee
public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of employees: ");
        int employeesNumber = input.nextInt();
        int[][] workingHours = new int[employeesNumber][7];
        for (int row = 0; row < workingHours.length; row++) {
            System.out.println("enter " + (row + 1) + ". employees working hours day by day: ");
            for (int column = 0; column < workingHours[row].length; column++) {
                workingHours[row][column] = input.nextInt();
            }
        }
        int [][] totalWorkHours= findTotalWorkingHours(workingHours);
        int[][] sortedTotalWorkHours =sortedWorkingHours(totalWorkHours);

        printArray(sortedTotalWorkHours);
    }

    public static int[][] findTotalWorkingHours(int[][] workingHours) {
        int[][] totalWorkHours = new int[workingHours.length][2];
        for (int row = 0; row < workingHours.length; row++) {
            int total = 0;
            for (int column = 0; column < workingHours[0].length; column++) {
                total += workingHours[row][column];
            }
            totalWorkHours [row][0]= row;
            totalWorkHours [row][1]= total;

        }
        return totalWorkHours;

    }

    public static int[][] sortedWorkingHours(int[][] totalWorkHours) {
        for (int i = 0; i < totalWorkHours.length; i++) {
            for (int j = i + 1; j < totalWorkHours.length; j++) {
                if (totalWorkHours[i][1] < totalWorkHours[j][1]) {
                    int tempEmployeeIndex = totalWorkHours[i][0];
                    totalWorkHours[i][0] = totalWorkHours[j][0];
                    totalWorkHours[j][0] = tempEmployeeIndex;

                    int temp = totalWorkHours[i][1];
                    totalWorkHours[i][1] = totalWorkHours[j][1];
                    totalWorkHours[j][1] = temp;
                }
            }
        }
        return totalWorkHours;
    }

    public static void printArray(int[][] sortedTotalWorkHour) {

        for (int row = 0; row < sortedTotalWorkHour.length; row++) {

            System.out.println((sortedTotalWorkHour[row] [0]+ 1) + ".employee works " + sortedTotalWorkHour[row][1] + " hours");

        }

    }
}

