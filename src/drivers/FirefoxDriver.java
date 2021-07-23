package drivers;


public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Uruchom przeglądarkę za pomocą Firefox."); }

    @Override
    public void findElementBy() {
        System.out.println("Znajdź element za pomocą przeglądarki Firefox."); }

    public void info(){
        System.out.println("Będziesz potrzebował najnowszej wersji przeglądarki.");
    }
}
