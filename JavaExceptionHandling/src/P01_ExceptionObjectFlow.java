public class P01_ExceptionObjectFlow {

    static void methodC() {
        int result = 10 / 0;
        System.out.println("methodC result: " + result);
    }

    static void methodB() {
        methodC();
    }

    static void methodA() {
        methodB();
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main: " + e);
            System.out.println("Message: " + e.getMessage());
        }
        System.out.println("Program continues after handling.");
    }
}
