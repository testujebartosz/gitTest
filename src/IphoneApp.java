public class IphoneApp extends App {

    public String country;

    public IphoneApp(String name, String version, String country){
        super(name, version);
        this.country = country;
    }

    public void runIphone(){
        System.out.println("Pobierz aplikację ze strony www.pomodoro.org, aby móc z niej korzystać!"); }

    public void Availability(){
        System.out.println("Aplikacja dostępna jest tylko w " + country + ".");
    }
}
