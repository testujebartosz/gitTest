import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    // jeśli ścieżka będzie nieprawidłowa to wyjątek się pojawi
   /* public static void main(String[] args) throws FileNotFoundException {
        readFile("/src/sdsds.txt");
    }
    // słówko throws oznacza ze ta metoda może wyrzucic wyjątek
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }*/

    public static void main(String[] args) {

        try {
            System.out.println("Before reading file");
            readFile("C:\\Users\\kolod\\OneDrive\\Pulpit\\javat\\src\\test.txt");
            System.out.println("Closing file");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Closing file");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }

}
