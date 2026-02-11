import java.util.ArrayList;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Pen", 10));
        products.add(new Product("Book", 50));
        products.add(new Product("Bag", 500));

        double total = 0;

        for (Product p : products) {
            total += p.price;
        }

        System.out.println("Total Bill: " + total);
    }
}
