public class AutoZadanieTest {
    public static void main(String[] args) {

        AutoZadanie ford = new AutoZadanie("Ford","Mondeo", 2008, 250500);
        ford.jedz();
        ford.hamuj();
        ford.info();

        System.out.println();

        AutoZadanie honda = new AutoZadanie("Honda","Civic", 2000, 300500);
        honda.jedz();
        honda.hamuj();
        honda.info();
    }
}
