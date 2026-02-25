public class P03_TypesOfException {

    static void uncheckedExamples() {
        try {
            int[] arr = new int[3];
            arr[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked - ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Unchecked - NullPointerException caught");
        }

        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked - ArithmeticException: " + e.getMessage());
        }
    }

    static void checkedExample() throws Exception {
        throw new Exception("Checked Exception must be declared or handled");
    }

    public static void main(String[] args) {
        System.out.println("--- Unchecked Exceptions (RuntimeException) ---");
        uncheckedExamples();

        System.out.println("\n--- Checked Exception ---");
        try {
            checkedExample();
        } catch (Exception e) {
            System.out.println("Checked - Exception: " + e.getMessage());
        }
    }
}
