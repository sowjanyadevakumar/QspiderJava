public class P05_ErrorAndAdvantage {

    static void causeStackOverflow() {
        causeStackOverflow();
    }

    static void withoutExceptionHandling() {
        int result = 10 / 0;
        System.out.println("Result: " + result);
        System.out.println("This line will never execute.");
    }

    static void withExceptionHandling() {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Handled: " + e.getMessage());
        }
        System.out.println("Program continues normally after handling.");
    }

    public static void main(String[] args) {
        System.out.println("--- Error: StackOverflowError ---");
        try {
            causeStackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught: infinite recursion detected");
        }

        System.out.println("\n--- Without Exception Handling ---");
        try {
            withoutExceptionHandling();
        } catch (ArithmeticException e) {
            System.out.println("Crash prevented at outer level: " + e.getMessage());
        }

        System.out.println("\n--- With Exception Handling (Advantage) ---");
        withExceptionHandling();
    }
}
