public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Footballer");
        this.footballClub = footballClub;
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }

    public void playfootball(){
        System.out.println("I am playing football for " + footballClub );
    }


}
