package drivers;

public class NoValidBrowserName extends Exception{
 // modyfikacja wyjątku poprzez dodanie konstruktora

    public NoValidBrowserName(String message){
        super(message);

    }
}
