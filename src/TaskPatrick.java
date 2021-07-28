import java.util.Scanner;

public class TaskPatrick {


    public static void main(String[] args) {


        Scanner odbierz = new Scanner(System.in);

        TestPatrick testPatrick = new TestPatrick();

        System.out.println("Proszę podaj trzy dowolne liczby!");
        System.out.println("Pierwsza liczba:");
        int firstNumber = odbierz.nextInt();
        System.out.println("Druga liczba:");
        int secondNumber = odbierz.nextInt();
        System.out.println("Trzecia liczba:");
        int thirdNumber = odbierz.nextInt();

        System.out.println(testPatrick.check(firstNumber, secondNumber, thirdNumber));

    }
}

