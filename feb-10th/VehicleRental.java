abstract class Vehicle {
    abstract double rent(int days);
}

class Car extends Vehicle {
    double rent(int days) {
        return days * 1000;
    }
}

class Bike extends Vehicle {
    double rent(int days) {
        return days * 300;
    }
}

class Truck extends Vehicle {
    double rent(int days) {
        return days * 2000;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println(v.rent(3));
    }
}
