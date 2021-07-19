package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    // dostęp z innej paczki ograniczony

    public void testIdentifier(){
        System.out.println(first);
        //System.out.println(second); brak dostępu do pola domyślnego
        System.out.println(third);
        //System.out.println(fourth);  brak dostępu do pola prywatnego
        firstMethod();
        //secondMethod(); brak dostępu do metody domyślnej
        thirdMethod();
        //fourthMethod();  brak dostępu do metody prywatnej
    }
}
