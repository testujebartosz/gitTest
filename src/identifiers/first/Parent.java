package identifiers.first;

public class Parent {

    // modyfikatory dostępu

    public String first = "public";
    String second = "default"; // domyślne
    protected String third = "protected";
    private String fourth = "private";

    public void firstMethod(){
        System.out.println("public");
    }
    void secondMethod(){
        System.out.println("default");
    }
    protected void thirdMethod(){
        System.out.println("protected");
    }
    private void fourthMethod(){
        System.out.println("private");
    }

    // sprawdzamy do których pól i metod mamy dostęp
    public void testIdentifiers(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}
