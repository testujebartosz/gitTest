// zarezerwowane miejsce w pamięci z orekślonym typem danych
public class Zmienne {


    public static void main(String[] args) {

        // zmiennych nie  musimy od razu inicjalizować (przypisać wartość) możemy je tylko zadeklarować
       /* int firstNumber, secondNumber, result;
        // dopiero później przypisujemy wartości
        firstNumber = 2;
        secondNumber = 3;
        result = firstNumber + secondNumber;*/

        int firstNumber = 1;
        int secondNumber = 2;
        int result = firstNumber + secondNumber;
        System.out.println("Twój szczęśliwy numerek to " + result);

        String name = "Bartek";
        // nadpisywanie zmiennej name
        name = "Kasia";
        System.out.println("Masz na imię " + name);

        double number = 2.0;
        double numberTwo = 3.3;
        double total = number + numberTwo;
        System.out.println("Suma = " + total);

        int a = 5;
        int b = 3;
        System.out.println("a+b = " + (a + b));

    }
}
