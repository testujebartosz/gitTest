//umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        //dodawanie
        int addition = firstNumber + secondNumber; //10
        //odejmowanie
        int subtraction = firstNumber  - secondNumber; //-2
        // mnożenie
        int multiplication = firstNumber * secondNumber; //24
        // dzielenie
        float division = thirdNumber/secondNumber; // 2/3 ~~ o,66
        //modulo - reszta z dzielenia
        int mod = secondNumber%firstNumber; // ile 4 mieści w 6, 1, zwracamy to co zostało czyli 2

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik modulo: " + mod);

        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber;
        System.out.println(" Po dodaniu: " + firstNumber);
        firstNumber-=secondNumber; // firstNumber - secondNumber;
        System.out.println(" Po odejmowaniu: " + firstNumber);
        firstNumber*=secondNumber; // firstNumber * secondNumber;
        System.out.println(" Po mnożeniu: " + firstNumber);
        firstNumber/=secondNumber; // firstNumber / secondNumber;
        System.out.println(" Po dzieleniu: " + firstNumber);
        firstNumber%=secondNumber; // firstNumber % secondNumber;
        System.out.println(" Po modulo: " + firstNumber);
    }

}
