class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class P09_MethodOverloading {
    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        System.out.println("Two ints: " + m.add(10, 20));
        System.out.println("Three ints: " + m.add(10, 20, 30));
        System.out.println("Two doubles: " + m.add(1.5, 2.5));
    }
}
