import java.util.Scanner;

public class CalculatorTestMy {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        CalculatorMy addition = new CalculatorMy();
        System.out.println("Proszę podaj dwie dowolne liczby!");
        addition.firstNumber = scan.nextInt();
        addition.secondNumber = scan.nextInt();

        CalculatorMy subtraction = new CalculatorMy();
        System.out.println("Proszę podaj dwie dowolne liczby!");
        subtraction.firstNumber = scan.nextInt();
        subtraction.secondNumber = scan.nextInt();

        System.out.println("Proszę podaj dwie dowolne liczby!");
        CalculatorMy multiplication = new CalculatorMy();
        multiplication.firstNumber = scan.nextInt();
        multiplication.secondNumber = scan.nextInt();

        System.out.println("Proszę podaj dwie dowolne liczby!");
        CalculatorMy division = new CalculatorMy();
        division.firstNumber = scan.nextInt();
        division.secondNumber = scan.nextInt();

        System.out.println("Proszę podaj dwie dowolne liczby!");
        CalculatorMy modulo = new CalculatorMy();
        modulo.firstNumber = scan.nextInt();
        modulo.secondNumber = scan.nextInt();

        addition.wykonajDodawanie();
        subtraction.wykonajOdejmowanie();
        multiplication.wykonajMnozenie();
        division.wykonajDzielenia();
        modulo.wykonajModulo();

    }
}
