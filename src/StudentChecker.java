// Stwórz 3 obiekty klasy student. Przypisz wartości do pól. Stwórz tablice i dodaj studentów do tablicy.
// Przejdź przez elementy w tablicy i wywołaj wszystkie 4 metody

public class StudentChecker {
    public static void main(String[] args) {

        Student firstStudent = new Student();

        firstStudent.imie = "Bartosz";
        firstStudent.nazwisko = "Kołodziej";
        firstStudent.nick = "BarKol";
        firstStudent.email = "bartek@gmail.com";
        firstStudent.numerIndeksu = 1;

        Student secondStudent = new Student();

        secondStudent.imie = "Kamil";
        secondStudent.nazwisko = "Warty";
        secondStudent.nick = "KamWar";
        secondStudent.email = "kamilwarty@gmail.com";
        secondStudent.numerIndeksu = 2;

        Student thirdStudent = new Student();

        thirdStudent.imie = "Karol";
        thirdStudent.nazwisko ="Agrest";
        thirdStudent.nick = "KarAgr";
        thirdStudent.email = "karolagrest@gmail.com";
        thirdStudent.numerIndeksu = 3;

        String[] students = new String[3];
        students[0] = firstStudent.imie;






    }


}
