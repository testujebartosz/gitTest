public class AndroidApp extends App {

    public String country;

    public AndroidApp(String name, String version, String country){
        super(name, version);
        this.country = country;
    }

    public void runAndroid(){
        System.out.println("Pobierz aplikację ze strony www.cucumber.org, aby móc z niej korzystać!"); }

    public void Availability(){
        System.out.println("Aplikacja dostępna jest tylko w " + country + ".");
    }

}
