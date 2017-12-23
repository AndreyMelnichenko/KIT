package center.kit.runners.classwork.lesson10;

import center.kit.app.classwork.lesson10.Person;
import center.kit.app.classwork.lesson10.Student;

public class lesson13Runner {
    public static void main(String[] args) {
        Person person = new Person("Ivan",22);
        Person student = new Student("Andrey",32,"KPI");
        System.out.println("This is PERSON "+person.getName()+" "+person.getAge());
        //System.out.println(student.getResponse("Hi"));
        //System.out.println("This is STUDENT "+student.getName()+" "+student.getAge()+" "+student.getUniversity());
        //Person teacher = new Teacher();
    }
    public static void PersonActions (){

    }
}
