// importowanie klas z tej samej i innych paczek do klasy App.
package com.nauka.app;

import com.nauka.app.database.DatabaseConnection;
import com.nauka.app.database.DatabaseUtils;

public class App {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        DatabaseUtils databaseUtils = new DatabaseUtils();
        pages.DatabaseUtils databaseUtils1 = new pages.DatabaseUtils();
    }
}
