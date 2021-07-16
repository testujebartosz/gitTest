import java.sql.SQLOutput;

public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze MatchTeacher");
        this.school = school;
    }

    public void teachMath(){
        System.out.println("I am teaching Math!");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
        System.out.println("I teach at " + school);
    }


}
