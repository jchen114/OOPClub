/**
 * Created by jacobchen2272 on 11/21/2014.
 */
public class Main {

    public static void main(String[] args) {

        Person firstPerson = new Person("Big Bird", 17);

        System.out.println("firstPerson name is" + firstPerson.name);
        System.out.println("firstPerson age is " + firstPerson.age);

        firstPerson.name = "sdf";
        firstPerson.age = 1982;


        firstPerson.setGender(true);

        if (firstPerson.getGender() == true) {
            System.out.println("Male");
        } else {
            System.out.println("Female");
        }

        firstPerson.printMyInfo();

        System.out.println(firstPerson.getGender()?"Male":"Female");

        Teacher myTeacher = new Teacher("Jacob", 21);

        myTeacher.setGender(true);

        firstPerson.age = 100;
        firstPerson.name = "George";

        System.out.println("first Person name is " + firstPerson.name);
        System.out.println("first Person age is " + firstPerson.age);

        myTeacher.knowledge = 9001;

        System.out.println("myTeacher's knowledge is " + myTeacher.knowledge);

    }

}
