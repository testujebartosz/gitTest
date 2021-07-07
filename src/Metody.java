public class Metody {

    public void policzWynik() {

        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for ( int i = 0; i < 100; i++){
            result = result + i;
            System.out.println(result);

        }
        System.out.println("Rezultat to: " + result);
    }
}
