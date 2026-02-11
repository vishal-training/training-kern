class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }
}

class Car {
    String model;
    Engine engine;

    Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Engine Type: " + engine.type);
    }
}

public class CarEngine {
    public static void main(String[] args) {
        Engine e = new Engine("Petrol");
        Car c = new Car("Honda City", e);

        c.displayDetails();
    }
}
