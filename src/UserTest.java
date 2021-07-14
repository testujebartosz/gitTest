public class UserTest {

    public static void main(String[] args) {

        User user = new User(); //wykorzystujemy konstruktor domyślny
        User user2 = new User("Tomek", "12345");

        /*user.username = "Bartek";
        user.password = "QWERTY";
        user.sayHello();
*/
        System.out.println(user2.username);
        System.out.println(user2.password);
        user2.sayHello();
    }
}
