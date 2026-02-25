abstract class Transport {
    String brand;

    Transport(String brand) {
        this.brand = brand;
        System.out.println("Transport created: " + brand);
    }

    abstract void fuelType();

    void start() {
        System.out.println(brand + " is starting...");
    }
}

class PetrolVehicle extends Transport {
    PetrolVehicle(String brand) {
        super(brand);
    }

    void fuelType() {
        System.out.println(brand + " runs on Petrol.");
    }
}

class BatteryVehicle extends Transport {
    BatteryVehicle(String brand) {
        super(brand);
    }

    void fuelType() {
        System.out.println(brand + " runs on Electricity.");
    }
}

public class P14_AbstractWithConstructor {
    public static void main(String[] args) {
        Transport t1 = new PetrolVehicle("Honda");
        t1.start();
        t1.fuelType();

        System.out.println("---");

        Transport t2 = new BatteryVehicle("Tesla");
        t2.start();
        t2.fuelType();
    }
}
