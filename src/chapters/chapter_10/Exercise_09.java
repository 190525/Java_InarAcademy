import java.util.Arrays;

//Revise Course Class and Test
public class Exercise_09 {
    public static void main(String[] args) {
        ReviseCourse course1 = new ReviseCourse("Data Structures");
        course1.addStudents("Peter Jones");
        course1.addStudents("Kim Smith");
        course1.addStudents("Anne Kenedy");
        course1.dropStudents("Anne Kenedy");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students1 = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students1[i]);
        }

    }
}
 class ReviseCourse {
    private String courseName;
    final static int MAX_DEFAULT_NUMBER_OF_STUDENTS=10;
    private String []students= new String[MAX_DEFAULT_NUMBER_OF_STUDENTS];
    private int numberOfStudents;
    public ReviseCourse(){
        numberOfStudents=0;

    }
    public ReviseCourse(String courseName){
        this.courseName=courseName;
    }
    public  void addStudents(String student){
        if(numberOfStudents>=MAX_DEFAULT_NUMBER_OF_STUDENTS){
            String []temp=new String[students.length*2];
            System.arraycopy(students,0,temp,0,students.length);
            students=temp;
        }
            students[numberOfStudents]=student;
            numberOfStudents++;

    }
    public void dropStudents(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }

        }
        if (index == -1) {
            System.out.println(student+ " is not found.");

        } else {
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            numberOfStudents--;
        }
    }
    public void clear(){
        Arrays.fill(students,null);
        numberOfStudents = 0;
    }
    public String getCourseName(){
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}


