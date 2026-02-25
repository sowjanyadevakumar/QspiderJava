public class P06_TryCatch {

    public static void main(String[] args) {
        System.out.println("--- Basic try-catch ---");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        System.out.println("\n--- catch block with exception info ---");
        try {
            int[] arr = new int[3];
            arr[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception type: " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());
        }

        System.out.println("\n--- Nested try-catch ---");
        try {
            try {
                String s = null;
                s.length();
            } catch (NullPointerException e) {
                System.out.println("Inner catch: NullPointerException handled");
                int[] arr = new int[2];
                arr[5] = 1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: ArrayIndexOutOfBoundsException handled");
        }

        System.out.println("\nProgram completed successfully.");
    }
}
