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


}
