class Car {
    String brand;
    int year;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class P01_ObjectAndClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Toyota";
        c.year = 2022;
        c.display();
    }
}
