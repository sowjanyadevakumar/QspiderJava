public class P02_ExceptionHierarchy {

    static void triggerRuntimeException() {
        String s = null;
        System.out.println(s.length());
    }

    static void triggerCheckedException() throws Exception {
        throw new Exception("This is a checked exception");
    }

    public static void main(String[] args) {
        try {
            triggerRuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Caught as RuntimeException: " + e.getClass().getName());
        }

        try {
            triggerRuntimeException();
        } catch (Exception e) {
            System.out.println("Caught as Exception: " + e.getClass().getName());
        }

        try {
            triggerRuntimeException();
        } catch (Throwable t) {
            System.out.println("Caught as Throwable: " + t.getClass().getName());
        }

        try {
            triggerCheckedException();
        } catch (Exception e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        }
    }
}
