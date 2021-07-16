// Stwórz 3 obiekty klasy student. Przypisz wartości do pól. Stwórz tablice i dodaj studentów do tablicy.
// Przejdź przez elementy w tablicy i wywołaj wszystkie 4 metody

public class StudentChecker {
    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.infoUczelnia();

        Student firstStudent = new Student();

        firstStudent.imie = "Bartosz";
        firstStudent.nazwisko = "Kołodziej";
        firstStudent.nick = "BarKol";
        firstStudent.email = "bartek@gmail.com";
        firstStudent.numerIndeksu = 1;
        String uczelniaFirstStudent = firstStudent.nazwaUczelni;

        Student secondStudent = new Student();

        secondStudent.imie = "Kamil";
        secondStudent.nazwisko = "Warty";
        secondStudent.nick = "KamWar";
        secondStudent.email = "kamilwarty@gmail.com";
        secondStudent.numerIndeksu = 2;
        String uczelniaSecondStudnet = secondStudent.nazwaUczelni;


        Student thirdStudent = new Student();

        thirdStudent.imie = "Karol";
        thirdStudent.nazwisko ="Agrest";
        thirdStudent.nick = "KarAgr";
        thirdStudent.email = "karolagrest@gmail.com";
        thirdStudent.numerIndeksu = 3;

        Student[] students = new Student[3];
        students[0] = firstStudent;
        students[1] = secondStudent;
        students[2] = thirdStudent;

        for ( int i = 0; i < students.length; i++ ){
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
            System.out.println();
        }





    }


}
