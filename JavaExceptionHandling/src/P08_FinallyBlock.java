public class P08_FinallyBlock {

    static void demoFinally(boolean throwException) {
        try {
            System.out.println("try block executing...");
            if (throwException) {
                int result = 10 / 0;
            }
            System.out.println("End of try block.");
        } catch (ArithmeticException e) {
            System.out.println("catch block: " + e.getMessage());
        } finally {
            System.out.println("finally block: always executes!");
        }
    }

    static int demoFinallyWithReturn() {
        try {
            System.out.println("try: returning value");
            return 1;
        } finally {
            System.out.println("finally: runs even before return");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Finally when no exception ---");
        demoFinally(false);

        System.out.println("\n--- Finally when exception occurs ---");
        demoFinally(true);

        System.out.println("\n--- Finally with return statement ---");
        int value = demoFinallyWithReturn();
        System.out.println("Returned value: " + value);
    }
}
