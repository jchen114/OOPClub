/**
 * Created by jacobchen2272 on 11/21/2014.
 */
public class Person {
    public String name;
    public int age;
    private boolean gender; // Gender = true : Male, Gender = false : Female

    public Person(){

    }

    public Person(String aName, int anAge) {
        this.name = aName;
        this.age = anAge;
    }

    public void setGender(boolean aGender){
        this.gender = aGender;
    }

    public boolean getGender(){
        return this.gender;
    }

    public void printMyInfo() {
        printInfo();
    }

    private void printInfo() {
        // Print name, age, and gender
        System.out.println("My name is " + this.name);
        System.out.println("My age is " + this.age);
    }

}
