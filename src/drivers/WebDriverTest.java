package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        //ChromeDriver chrome = new ChromeDriver();

        WebDriver driver = getDriver("firefoxa");

        driver.get();
        driver.info();
        driver.findElementBy(); // znalezienie jakiegoś elementu na stronie i wykonanie akcji
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

        System.out.println();

      /*  FirefoxDriver firefox = new FirefoxDriver();
        firefox.get();
        firefox.info();
        firefox.findElementBy();*/
    }

// dzięki polimorfizomowi kod jest bardziej elastyczny
    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if(name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")){
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name. ");
        //return null;
    }

    /*private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        try {
            throw new NoValidBrowserName("No valid browser name. ");
        } catch (NoValidBrowserName noValidBrowserName) {
            noValidBrowserName.printStackTrace();
        }
        return null;
    }*/
}
