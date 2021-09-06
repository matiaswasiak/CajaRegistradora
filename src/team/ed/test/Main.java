package team.ed.test;

import team.ed.objects.Product;
import team.ed.storage.Database;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Product product = database.getByIndex(0);
        System.out.println(product);
    }
}
