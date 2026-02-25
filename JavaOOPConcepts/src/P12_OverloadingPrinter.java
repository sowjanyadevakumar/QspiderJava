class Printer {
    void print(String msg) {
        System.out.println("String: " + msg);
    }

    void print(int number) {
        System.out.println("Integer: " + number);
    }

    void print(double value) {
        System.out.println("Double: " + value);
    }

    void print(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}

public class P12_OverloadingPrinter {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Hello");
        p.print(42);
        p.print(3.14);
        p.print("Java", 3);
    }
}
