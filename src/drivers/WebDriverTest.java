package drivers;

public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        //ChromeDriver chrome = new ChromeDriver();

        //przechodzimy po wszsytkich wartościach które znajdują się w Enumie
        DriverType[] driverTypes = DriverType.values();
        for (int i = 0; i < driverTypes.length; i++){
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        WebDriver driver = getDriver(DriverType.FIREFOX);

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
 /*   private static WebDriver getDriver(DriverType type) throws NoValidBrowserName {
        if(type==DriverType.CHROME){
            return new ChromeDriver();
        } else if (type==DriverType.FIREFOX){
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name. ");
        //return null;
    }*/

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

    private static WebDriver getDriver(DriverType type) {
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        }
            System.out.println(type.path);
            return new FirefoxDriver();

        }
    }
