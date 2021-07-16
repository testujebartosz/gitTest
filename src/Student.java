public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
    public static String nazwaUczelni = "AGH"; // pole statyczne

    public void przedstawSie(){
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }

    public void zalogujSie(){
        System.out.println("Zaloguj się za pomocą " + nick);
    }

    public void podajNrIndeksu(){
        System.out.println("Moj numer indeksu to : " + numerIndeksu);
    }

    public void podajEmail(){
        System.out.println("Mój email to : " + email);
    }

    public static void infoUczelnia() { System.out.println("Moja  uczelnia to " + nazwaUczelni);
    druga();} //metoda statyczna

    public static void druga(){
        System.out.println("Jestem drugą metodą tylko dlaczego zawsze na początku?");
    }
}
