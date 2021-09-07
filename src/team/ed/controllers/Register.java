package team.ed.controllers;

import team.ed.storage.Database;
import team.ed.views.View;

public class Register {
    private Database database;

    public Register() {
        database = new Database();
    }

    // register inicia el proceso de la registradora
    public void register() {
        View.showHeaderPrincipal();
        View.showMenuPrincipal();
        int option;
        do {
            View.showGetOption();
            option = View.getOption();
        } while (option < 1 || option > 6);
    }
}
