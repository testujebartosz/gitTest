import java.util.Scanner;

public class Calculator {

    //napisz program który poprosi użytkownika o 2 liczby, a następnie wykona na nich  podstawowe operacje matematyczne
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podaj dwie dowolne liczby!");
        System.out.println("Pierwsza liczba:");
        int firstNumber = scan.nextInt();
        System.out.println("Druga liczba:");
        int secondNumber = scan.nextInt();

        int addition = firstNumber + secondNumber;
        System.out.println("Wynik dodawania: " + addition);
        int subtraction = firstNumber  - secondNumber;
        System.out.println("Wynik odejmowania: " + subtraction);
        int multiplication = firstNumber * secondNumber;
        System.out.println("Wynik mnożenia: " + multiplication);

        System.out.println("Proszę podaj trzecią liczbę!");
        float thirdNumber = scan.nextFloat();
        float division = firstNumber/thirdNumber;
        System.out.println("Wynik dzielenia obliczamy liczba pierwsza przez liczbę trzecią: " + division);

        int mod = firstNumber%secondNumber;
        System.out.println("Wynik modulo: " + mod);

    }
}
