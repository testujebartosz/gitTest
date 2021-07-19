package identifiers.second;

import identifiers.first.Parent;

public class Random {

    // klasa w innej paczce nie ma dostępu do metod/pól PRIVATE/Default/Protected

    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
        //System.out.println(parent.second);
        //System.out.println(parent.third);
        // System.out.println(parent.fourth); brak dostępu do prywtnego pola
        parent.firstMethod();
        //parent.secondMethod();
        //parent.thirdMethod();
        // parent.fourthMethod(); brak dostępu do prywatnej metody


    }
}