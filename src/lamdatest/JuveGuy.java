package lamdatest;

public class JuveGuy implements Footballer {

    @Override
    public void sayHello(String name, String club, int age) {
        System.out.println("Hello! I am " + name + " and I am " + age + "." );
        System.out.println("I play for " + club + ".");
    }
}
