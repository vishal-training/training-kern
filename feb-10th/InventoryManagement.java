class Product {
    private int stock = 10;

    void update(int qty) {
        if (stock + qty < 0) throw new IllegalArgumentException();
        stock += qty;
    }

    int getStock() {
        return stock;
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Product p = new Product();
        p.update(-3);
        System.out.println(p.getStock());
    }
}

