class Laptop {
    String brand;
    int ram;

    Laptop() {
        brand = "Dell";
        ram = 8;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }
}

public class P03_DefaultConstructor {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.show();
    }
}
