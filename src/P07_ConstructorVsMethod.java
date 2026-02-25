class Phone {
    String model;
    int price;

    Phone() {
        System.out.println("Constructor called - Object created");
        model = "Unknown";
        price = 0;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}

public class P07_ConstructorVsMethod {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.model = "Samsung";
        p.price = 15000;
        p.display();
    }
}
