import java.util.Scanner;

public class OperatoryPorownania {

    // porównują elementy równania i zwracają logiczną wartość (true/false)

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę!");
        int firstNumber = scan.nextInt();
        System.out.println("Podaj drugą liczbę!");
        int secondNumber = scan.nextInt();

        boolean result = secondNumber > firstNumber;

        System.out.println("Czy druga liczba jest więszka od pierwszej?" + result);
        System.out.println("Czy pierwsza liczba jest większa od drugiej?" + (firstNumber > secondNumber));
        System.out.println("Czy pierwsza liczba jest mniejsza od drugiej?"+ (firstNumber < secondNumber));
        System.out.println("Czy pierwsza liczba jest większalubrówna od drugiej?" + (firstNumber >= secondNumber));
        System.out.println("Czy pierwsza liczba jest mniejszalubrówna od drugiej?" + (firstNumber <= secondNumber));
        System.out.println("Czy pierwsza liczba jest równa drugiej?" + (firstNumber == secondNumber)); // czy są równe
        System.out.println("Czy pierwsza liczba jest różna od drugiej?" + (firstNumber != secondNumber)); // czy są różne
    }
}
