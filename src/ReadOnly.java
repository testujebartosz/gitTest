public class ReadOnly {

    private String name = "Bartek";

    //Getter pozwala pobrać pole i je wykorzystać

    public String getName() {
        return name + "jest ok";
    }

    //Setter pozwala przypisać/ustalić wartość pola które jest prywatne

    public void setName(String name) {
        this.name = name;
    }
}
