package chapter_13.Exercise_13;
public class Course implements Cloneable{
    private String courseName;
    private String []students= new String[100];
    private int numberOfStudents;
    public Course(){
        numberOfStudents=0;

    }
    public Course(String courseName){
        this.courseName=courseName;
    }
    public  void addStudent(String student){
        if(numberOfStudents>=100){
            System.out.println("The course is full");
        }
        else{
            students[numberOfStudents]=student;
            numberOfStudents++;
        }
    }
    public void dropStudent(String student) {
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
    public String getCourseName(){
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    @Override
    public Course clone() throws CloneNotSupportedException{
        Course courseClone=(Course)super.clone();
        courseClone.students=students.clone();
        return courseClone;

    }
}

