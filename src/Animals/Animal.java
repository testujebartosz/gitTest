package Animals;

// Klasa ABSTRAKCYJNA = przez dodanie słowa abstract

public abstract class Animal {

    public final static int legs = 4; // pole ze stałą wartościa

    public abstract void sound();

    public void sayHello(){
        System.out.println("Hello! I am an animal");
    }


}
