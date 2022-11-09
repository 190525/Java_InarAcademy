// Test Course Class
public class Listing_05 {
    public static void main(String[] args) {
        Course course1=new Course("Data Structures");
        Course course2=new Course("Database Systems");
        course1.addStudents("Peter Jones");
        course1.addStudents("Kim Smith");
        course1.addStudents("Anne Kenedy");

        course2.addStudents("Peter Jones");
        course2.addStudents("Steve Smith");
        System.out.println("Number of students in course1: "+course1.getNumberOfStudents());
        String[]students1=course1.getStudents();
        for(int i=0;i< course1.getNumberOfStudents();i++){
            System.out.println(students1[i]);
        }
        System.out.println("Number of students in course2: "+course2.getNumberOfStudents());
        String[]students2=course1.getStudents();
        for(int i=0;i< course2.getNumberOfStudents();i++){
            System.out.println(students2[i]);
        }
    }
}
class Course{
    private String courseName;
    private String []students= new String[100];
    private int numberOfStudents;
    public Course(){
        numberOfStudents=0;

    }
    public Course(String courseName){
        this.courseName=courseName;
    }
    public  void addStudents(String student){
        if(numberOfStudents>=100){
            System.out.println("The course is full");
        }
        else{
            students[numberOfStudents]=student;
            numberOfStudents++;
        }
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
       
