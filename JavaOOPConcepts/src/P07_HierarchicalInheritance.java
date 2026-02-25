class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a Triangle.");
    }
}

public class P07_HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        c.draw();
        r.draw();
        t.draw();
    }
}
