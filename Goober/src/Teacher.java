import java.util.ArrayList;

/**
 * Created by jacobchen2272 on 11/21/2014.
 */
public class Teacher extends Person{

    public int knowledge;

    public ArrayList<Person> students;

    public Teacher(String aName, int anAge) {
        this.name = aName;
        this.age = anAge;
        this.knowledge = 1000;
        students = new ArrayList<Person>();
    }

    public void addStudent(Person student) {
        students.add(student);
    }

    public void printStudentsInfo() {

        for (int i = 0; i < students.size(); i++){

            System.out.println("------------------------------");
            students.get(i).printMyInfo();

        }

    }

    public static void printHello() {
        System.out.println("Hello Class!");
    }

    public static ArrayList<Person> findMatchingStudents(Teacher teacher1, Teacher teacher2) {

        ArrayList<Person> teacher1Students = teacher1.students;
        ArrayList<Person> teacher2Students = teacher2.students;

        ArrayList<Person> matchingStudents = new ArrayList<Person>();

        for (int i = 0; i < teacher1.students.size(); i ++) {

            Person student1 = teacher1.students.get(i);

            for(int j = 0; j < teacher2.students.size(); j ++){

                Person student2 = teacher2.students.get(j);

                if(student1.name.equalsIgnoreCase(student2.name) && student1.age == student2.age) {

                    // Student 1 is the same as student 2
                    matchingStudents.add(student1);

                }
            }
        }

        return matchingStudents;

    }


}
