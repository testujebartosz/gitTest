package identifiers.first;

public class Random {

    // klasa w tej samej paczce nie ma dostępu do PRIVATE - brak zależnosci między klasami

    public void testIdentifier(){
        Parent parent = new Parent();

        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        // System.out.println(parent.fourth); brak dostępu do prywtnego pola
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
        // parent.fourthMethod(); brak dostępu do prywatnej metody
    }
}
