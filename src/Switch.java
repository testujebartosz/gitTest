import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Dania do wyboru: Łosoś, Pizza, Frytki, Pizza i Frytki");
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz danie by poznać cenę:");
        String danie = scan.nextLine();

        switch (danie) {
            case "Pizza":
                System.out.println("Cena to 22 zł");
                break;
            case "Łosoś":
                System.out.println("Cena to 30 zł");
                break;
            case "Frytki":
                System.out.println("Cena to 9 zł");
                break;
            case "Pizza i Frytki":
                System.out.println("Cena to " + (22+9) + " zł");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }

    }
}
