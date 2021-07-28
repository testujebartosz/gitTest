package files;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("test.txt");
        // metoda delete
        if (file.delete()){
            System.out.println("Usunelismy plik");
        } else {
            System.out.println("Nie udało się");
        }
    }
}
