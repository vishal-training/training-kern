interface PaymentMethod {
    void pay(double amount);
}

class UPIPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("UPI " + amount);
    }
}

class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Card " + amount);
    }
}

class PaymentFactory {
    static PaymentMethod get(String type) {
        if (type.equals("UPI")) return new UPIPayment();
        return new CreditCardPayment();
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentMethod p = PaymentFactory.get("UPI");
        p.pay(1000);
    }
}
