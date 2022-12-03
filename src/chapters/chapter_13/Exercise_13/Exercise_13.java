package chapter_13.Exercise_13;

public class Exercise_13 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Course course1 = new Course("Inar Academy");
        course1.addStudent("Ismail ASLAN");
        course1.addStudent("Haluk");
        course1.addStudent("Furkan");
        course1.addStudent("Yusuf");
        course1.addStudent("Burak");

        Course course2 = course1.clone();

        course2.addStudent("Hilmi");
        course2.addStudent("Hamza");
        course2.dropStudent("Furkan");
        course2.dropStudent("Haluk");

        System.out.println("Number of students in course1: "+ course1.getNumberOfStudents());
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(course1.getStudents()[i] + " ");
        }
          System.out.println();

        System.out.println("Number of students in course2: "+ course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.print(course2.getStudents()[i] + " ");
        }

    }
}

