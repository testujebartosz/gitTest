package document;

public class PdfDocument extends Document{
//nadpisujemy metodę getDescription z klasy bazowej Document

    public void getDescription(){
        System.out.println("I am pdf document.");
    }
}
