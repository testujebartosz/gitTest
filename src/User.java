public class User {

    public String username;
    public String password;

// domyślny konstruktor - sprawdzamy czy metoda zostanie wywołana, nie przekazujemy do niego żadnych wartości
    public User(){
        System.out.println("Hello z konstruktora");
    }
    // konstruktor - jawnie definiujemy, do którego możemy przekazać konkretne wartości, parametry
    public User(String username, String password){
        // System.out.println(user + " my name is " + pass);

        this.username = username; // wskazuje nam na pole nowo tworzonego obiektu i przypisujemy wartość do tego pola
        this.password = password; /*dla nowo towrzonego obiektu dla pola password przypisz mi wartość password
       ktora zostanie podana jako drugi parametr konstruktora*/

    }

    public void sayHello(){
        System.out.println("Hello my name is " + username);
    }
}
