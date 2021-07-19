package identifiers.first;

public class Child extends Parent{


    public void testIdentifier(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        // System.out.println(fourth); brak dostępu do pola prywatnego
        firstMethod();
        secondMethod();
        thirdMethod();
        // fourthMethod(); // brak dostępu do metody prywatnej
    }
}
