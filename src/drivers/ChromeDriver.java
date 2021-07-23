package drivers;

import drivers.WebDriver;

public class ChromeDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("Uruchom przeglądarkę za pomocą Chrome."); }

    @Override
    public void findElementBy() {
        System.out.println("Znajdź element za pomocą przeglądarki Chrome."); }

    public void info(){
        System.out.println("Będziesz potrzebował najnowszej wersji przeglądarki.");
    }
}
