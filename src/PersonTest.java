public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom",29, "AGH" );

        teacher.teachMath();
        teacher.sayHello();
        teacher.walk();
        teacher.eat();

        System.out.println();

        Footballer footballer = new Footballer("Mike", 25, "Juventus FC"  );

        footballer.sayHello();
        footballer.playfootball();
        footballer.walk();
        footballer.eat();

    }

}