public class P10_ThrowAndPropagation {

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above. Given: " + age);
        }
        System.out.println("Age is valid: " + age);
    }

    static void level3() {
        throw new RuntimeException("Exception from level3");
    }

    static void level2() {
        level3();
    }

    static void level1() {
        level2();
    }

    static void validateScore(int score) {
        if (score < 0 || score > 100) {
            throw new ArithmeticException("Score out of range: " + score);
        }
        System.out.println("Valid score: " + score);
    }

    public static void main(String[] args) {
        System.out.println("--- throw keyword ---");
        try {
            validateAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        validateAge(20);

        System.out.println("\n--- Exception Propagation through call stack ---");
        try {
            level1();
        } catch (RuntimeException e) {
            System.out.println("Propagated exception caught in main: " + e.getMessage());
        }

        System.out.println("\n--- throw with ArithmeticException ---");
        try {
            validateScore(105);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
