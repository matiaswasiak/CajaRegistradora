package team.ed.storage;

import team.ed.objects.Meat;
import team.ed.objects.Potato;
import team.ed.objects.Product;
import team.ed.objects.Rice;

public class Database {
    private Product[] products;

    public Database() {
        products = new Product[3];
        Product potato = new Potato("Sabanera");
        Product rice = new Rice("Una marca");
        Product meat = new Meat("Lomo fino");

        products[0] = potato;
        products[1] = rice;
        products[2] = meat;
    }

    public Product getByIndex(int i) {
        if (i < 0 || i > 2) {
            System.out.println("Índice no válido!");
            return null;
        }
        return products[i];
    }

    public Product[] getAll() {
        return products;
    }
}
