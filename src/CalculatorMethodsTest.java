import java.util.Scanner;

public class CalculatorMethodsTest {
    public static void main(String[] args) {

        Scanner odbierz = new Scanner(System.in);
        System.out.println("Proszę podaj dwie dowolne liczby!");
        System.out.println("Pierwsza liczba:");
        int firstNumber = odbierz.nextInt();
        System.out.println("Druga liczba:");
        int secondNumber = odbierz.nextInt();

        CalculatorMethods calculator = new CalculatorMethods();

        int addition = calculator.add(firstNumber, secondNumber);
        int subtraction = calculator.sub(firstNumber, secondNumber);
        int multiplication = calculator.multi(firstNumber, secondNumber);
        int division = calculator.div(firstNumber, secondNumber);
        int mod = calculator.mod(firstNumber, secondNumber);

        System.out.println("Dodawanie " + addition);
        System.out.println("Odejmowanie " + subtraction);
        System.out.println("Mnozenie " + multiplication);
        System.out.println("Dzielnie " + division);
        System.out.println("Modulo " + mod);

        // drugi sposób
        System.out.println("Dodawanie " + calculator.add(firstNumber, secondNumber));
        System.out.println("Odejmowanie " + calculator.sub(firstNumber, secondNumber));
        System.out.println("Mnozenie " + calculator.multi(firstNumber, secondNumber));
        System.out.println("Dzielnie " + calculator.div(firstNumber, secondNumber));
        System.out.println("Modulo " + calculator.mod(firstNumber, secondNumber));

    }

}
