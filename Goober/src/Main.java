import java.util.ArrayList;

/**
 * Created by jacobchen2272 on 11/21/2014.
 */
public class Main {

    public static void main(String[] args) {

        Person firstPerson = new Person("Big Bird", 17);
        Person secondPerson = new Person("Billy", 4);
        secondPerson.setGender(true);

        //System.out.println("firstPerson name is" + firstPerson.name);
        //System.out.println("firstPerson age is " + firstPerson.age);

        firstPerson.name = "sdf";
        firstPerson.age = 1982;


        firstPerson.setGender(true);

        Teacher myTeacher = new Teacher("Jacob", 21);

        myTeacher.setGender(true);

        myTeacher.knowledge = 9001;

        //System.out.println("myTeacher's knowledge is " + myTeacher.knowledge);


        myTeacher.addStudent(firstPerson);
        myTeacher.addStudent(secondPerson);

        System.out.println("Jacob's students");
        myTeacher.printStudentsInfo();

        Teacher hisTeacher = new Teacher("Obi wan Kinobe", 73);

        Person padawan1 = new Person("Luke", 19);
        Person padawan2 = new Person("Anakin", 50);


        Person padawan3 = new Person("Scott", 12);
        myTeacher.addStudent(padawan3);

        hisTeacher.addStudent(padawan3);

        hisTeacher.addStudent(padawan1);
        hisTeacher.addStudent(padawan2);
        hisTeacher.addStudent(secondPerson);

        System.out.println("\n\nObi wan's students");
        hisTeacher.printStudentsInfo();

        System.out.println("\n\nMatching students are: ");

        ArrayList<Person> matchingStudents = Teacher.findMatchingStudents(myTeacher, hisTeacher);

        Teacher dummyTeacher = new Teacher("I AM A DUMMY TEACHER", 12143214);

        dummyTeacher.students = matchingStudents;

        dummyTeacher.printStudentsInfo();

    }

}
