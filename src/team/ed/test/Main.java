package team.ed.test;

import team.ed.views.View;

public class Main {
    public static void main(String[] args) {
//        Database database = new Database();
//        Product product = database.getByIndex(0);
//        System.out.println(product);
//
//        product.setName("Pastusa");
//        product.setAmount(10);
//        product.setPrice(1000);
//
//        Product[] products = database.getAll();
//        for (Product v : products) {
//            System.out.println(v);
//        }
        View.showHeaderPrincipal();
        View.showMenuPrincipal();
        View.showGetOption();
        int option = View.getOption();
        System.out.println("La opción digitada fue: " + option);
    }
}
