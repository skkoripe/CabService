package main;

import Backend.DatabaseInterface;
import GUI.MainPage;


public class Launcher {

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        DatabaseInterface databaseInterface=new DatabaseInterface();
        MainPage mainPage=new MainPage(databaseInterface);
        mainPage.launch();
    }
}
