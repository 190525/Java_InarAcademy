public class Exercise_02 {
    public static void main(String[] args) {
        Person person=new Person("İsmail","Erzurum","0523653256","ismail@gmail.com");
        System.out.println(person.toString());
        System.out.println("---------------------");
        Student student=new Student("İsmail","Erzurum","0523653256","ismail@gmail.com","Senior");
        System.out.println(student.toString());
        System.out.println("---------------------");

        Employee employee=new Employee("İsmail","Erzurum","0523653256","ismail@gmail.com",10000,"ITU",new MyDate().toString());
        System.out.println(employee.toString());
        System.out.println("---------------------");

        Faculty faculty=new Faculty("İsmail","11AM-4PM","Professor");
        System.out.println(faculty.toString());
        System.out.println("---------------------");

        Staff staff=new Staff("İsmail","Rector");
        System.out.println(staff.toString());

    }
}


