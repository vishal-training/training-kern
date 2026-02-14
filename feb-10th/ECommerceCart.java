import java.util.*;

interface Product {
    double getPrice();
}

class Electronics implements Product {
    public double getPrice() {
        return 50000;
    }
}

interface DiscountStrategy {
    double apply(double amount);
}

class FlatDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount * 0.9;
    }
}

public class ECommerceCart {
    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Electronics());
        double total = cart.stream().mapToDouble(Product::getPrice).sum();
        DiscountStrategy d = new FlatDiscount();
        System.out.println(d.apply(total));
    }
}
