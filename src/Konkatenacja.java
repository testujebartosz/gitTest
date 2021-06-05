public class Konkatenacja {
    public static void main(String[] args) {
        String pierwszaCzęść = "Na śniadanie zjadłam dzisiaj ";
        String drugaCzęść = "jajecznicę ";
        String trzeciaCzęść = "na maśle.";

        String tekst = pierwszaCzęść + drugaCzęść + trzeciaCzęść;
        System.out.println(tekst);

        int liczba = 123;
        String tekstLiczba = tekst + liczba;
        System.out.println(tekstLiczba);

        boolean prawda = true;
        String booleanTekst = tekst + prawda;
        System.out.println(booleanTekst);


    }
}
