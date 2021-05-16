import java.util.Scanner;

public class CustomScanner {
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner - typ obiektowy - następnie nazwa zmiennej i tworzymy nowy obiekt klasy Scanner
        System.out.println("Proszę, podaj swoje imię:");
        String name = scanner.nextLine(); // metoda nextLine - pobierz wartość
        System.out.println("Cześć " + name + " !");
        }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę, podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        // int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + firstNumber*firstNumber);

    }
}
