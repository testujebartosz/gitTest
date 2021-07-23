import drivers.ChromeDriver;
import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ExceptionsExample {

    public static void main(String[] args) {

        /*int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        // jeśli damy i <= numbers.length - bedziemy odwoływać się do 3 elementu, który nie istnieje
        for (int i=0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }*/

        WebDriver driver = getDriver("firefoxaa");

        driver.get();
        driver.info();
        driver.findElementBy(); // znalezienie jakiegoś elementu na stronie i wykonanie akcji
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

    private static WebDriver getDriver(String name) {
        if(name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")){
            return new FirefoxDriver();
        }
        return null;
    }
}
