/**
 * Created by jacobchen2272 on 11/21/2014.
 */
public class Main {

    public static void main(String[] args) {

        Person firstPerson = new Person("Big Bird", 17);
        Person secondPerson = new Person("Billy", 4);


        System.out.println("firstPerson name is" + firstPerson.name);
        System.out.println("firstPerson age is " + firstPerson.age);

        firstPerson.name = "sdf";
        firstPerson.age = 1982;


        firstPerson.setGender(true);

        Teacher myTeacher = new Teacher("Jacob", 21);

        myTeacher.setGender(true);

        myTeacher.knowledge = 9001;

        //System.out.println("myTeacher's knowledge is " + myTeacher.knowledge);

        myTeacher.addStudent(firstPerson);


    }

}
