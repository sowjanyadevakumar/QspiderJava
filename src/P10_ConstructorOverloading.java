class Rectangle {
    int length;
    int width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(int l) {
        length = l;
        width = l;
    }

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Length=" + length + " Width=" + width + " Area=" + (length * width));
    }
}

public class P10_ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        r1.area();
        r2.area();
        r3.area();
    }
}
