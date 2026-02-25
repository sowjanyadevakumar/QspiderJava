class Circle {
    double radius;
    String color;

    Circle() {
        this(1.0);
        System.out.println("No-arg constructor called");
    }

    Circle(double r) {
        this(r, "Red");
        System.out.println("Single-arg constructor called");
    }

    Circle(double r, String c) {
        radius = r;
        color = c;
        System.out.println("Two-arg constructor called");
    }

    void show() {
        System.out.println("Radius: " + radius + ", Color: " + color);
    }
}

public class P11_ConstructorChainingThis {
    public static void main(String[] args) {
        System.out.println("-- Creating c1 --");
        Circle c1 = new Circle();
        c1.show();

        System.out.println("-- Creating c2 --");
        Circle c2 = new Circle(5.5, "Blue");
        c2.show();
    }
}
