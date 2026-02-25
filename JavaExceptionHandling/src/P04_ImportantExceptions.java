public class P04_ImportantExceptions {

    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("1. ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            String s = null;
            System.out.println(s.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("2. NullPointerException caught");
        }

        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("3. ClassCastException: " + e.getMessage());
        }

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("4. ArithmeticException: " + e.getMessage());
        }

        try {
            String s = "abc";
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("5. NumberFormatException: " + e.getMessage());
        }

        try {
            String s = "hello";
            char c = s.charAt(20);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("6. StringIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            Object[] objects = new String[3];
            objects[0] = 100;
        } catch (ArrayStoreException e) {
            System.out.println("7. ArrayStoreException: " + e.getMessage());
        }
    }
}
