import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b; //konwersja niejawna 'a' zostaje przekonwertowana na dobule

        // chcemy mieć int - musimy samodzielnie przekonwertować typ double na int

        int d = a/(int)b;

        System.out.println(c);
        System.out.println(d);

        // na przykładzie typów obiektowych
        WebDriver driver = new FirefoxDriver(); // zmienna driver przechowuje WebDriver - czyli bardziej ogólny typ



        FirefoxDriver firefoxDriver = (FirefoxDriver)driver; // zmienna firefoxdriver konkretnego typu(klasy), przypisujemy zawrtość zmiennej driver
        firefoxDriver.get();


    }
}
