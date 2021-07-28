package drivers;

public class WebDriverSecondTest {

    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver firefoxSecond = new FirefoxDriver();
        WebDriver firefoxThird = new FirefoxDriver();

        //definiowanie klasy anonimowej - typ nazwa zmiennej = słowo kluczowe new oraz nazwę intrefsju ktroy ma implementować
        // musimy zdefinować ciało dla metod
        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening page with Safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with Safari");
            }

            @Override
            public void info() {
                System.out.println("thanks");
            }


        };

        safari.get();
        safari.findElementBy();
        safari.info();
    }
}
