public class P07_MultiCatch {

    public static void main(String[] args) {
        System.out.println("--- Multi-catch: separate catch blocks ---");
        try {
            String[] names = { "Alice", null, "Bob" };
            for (int i = 0; i <= 3; i++) {
                System.out.println(names[i].toUpperCase());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: ArrayIndexOutOfBoundsException - " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught: NullPointerException");
        } catch (Exception e) {
            System.out.println("Caught: General Exception - " + e.getMessage());
        }

        System.out.println("\n--- Multi-catch: single catch for multiple types (Java 7+) ---");
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
            System.out.println(num);
        } catch (ClassCastException | NumberFormatException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
