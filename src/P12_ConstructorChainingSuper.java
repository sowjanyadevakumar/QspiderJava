class Vehicle {
    String type;

    Vehicle(String t) {
        type = t;
        System.out.println("Vehicle constructor: type = " + type);
    }
}

class Bike extends Vehicle {
    String brand;

    Bike(String t, String b) {
        super(t);
        brand = b;
        System.out.println("Bike constructor: brand = " + brand);
    }

    void show() {
        System.out.println("Type: " + type + ", Brand: " + brand);
    }
}

public class P12_ConstructorChainingSuper {
    public static void main(String[] args) {
        Bike b = new Bike("Two-Wheeler", "Royal Enfield");
        b.show();
    }
}
