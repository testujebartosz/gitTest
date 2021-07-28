package lamdatest;

public class FootballerTest {
    //1
    public static void main(String[] args) {

        Footballer juve = new JuveGuy();
        sayHello("Mark", "Juventus FC", 22, juve);

        //klasa anonimowa
        Footballer barca = new Footballer() {
            @Override
            public void sayHello(String name, String club, int age) {
                System.out.println("Hello! I am " + name + " and I am " + age + ".");
                System.out.println("I play for " + club + ".");
            }
        };
        sayHello("John", "FC Barcelona", 26, barca);

            // wyrażenie lambda
         Footballer arsenal = (name, club, age) -> {
            System.out.println("Hello! I am " + name + " and I am " + age + ".");
            System.out.println("I play for " + club + ".");
            if (age>18){
                System.out.println("You can play for National team!");
            }

         };
        sayHello("Carol", "Arsenal", 21, arsenal);
    }




    //2
    public static void sayHello(String name, String club, int age, Footballer footballer){
        footballer.sayHello(name, club, age);

    }
}
