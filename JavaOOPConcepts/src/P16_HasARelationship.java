class CarEngine {
    String type;

    CarEngine(String type) {
        this.type = type;
    }

    void start() {
        System.out.println(type + " engine started.");
    }
}

class SportsCar {
    String model;
    CarEngine engine;

    SportsCar(String model, String engineType) {
        this.model = model;
        this.engine = new CarEngine(engineType);
    }

    void drive() {
        engine.start();
        System.out.println(model + " is now driving.");
    }
}

public class P16_HasARelationship {
    public static void main(String[] args) {
        SportsCar c1 = new SportsCar("BMW", "V8");
        SportsCar c2 = new SportsCar("Swift", "Diesel");

        c1.drive();
        System.out.println("---");
        c2.drive();
    }
}
