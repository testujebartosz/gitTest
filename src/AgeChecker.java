import java.util.Scanner;

/*Zapytaj użytkownika o wiek.
W przypadku gdy ma mniej niz 18 lat wypisz na ekranie informację, że nie może kupić alkoholu
Gdy ma więcej niż 18 lat to podziękuj za zakupy*/
public class AgeChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile masz lat? Wpisz swój wiek: ");
        int age = scan.nextInt();

        if (age < 18 && age >= 0){
            System.out.println("Nie możesz kupić alkoholu, masz mniej niż 18 lat :(.");
        } else if (age < 0){
            System.out.println("Podaj prawidłową wartość! Wiek nie może być mniejszy lub równy 0 :O.");
        } else {
            System.out.println("Możesz swobodnie kupować, dziękuję za zakupy!:)");
        }

    }
}
