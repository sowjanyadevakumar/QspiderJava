class Box {
    int length;
    int width;
    int height;

    void volume() {
        System.out.println("Volume: " + (length * width * height));
    }
}

public class P04_NewKeyword {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.length = 5;
        b1.width = 3;
        b1.height = 2;
        b1.volume();

        Box b2 = new Box();
        b2.length = 10;
        b2.width = 4;
        b2.height = 3;
        b2.volume();
    }
}
