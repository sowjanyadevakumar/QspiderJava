import java.util.ArrayList;

public class P02_Unboxing {

    public static void main(String[] args) {
        Integer boxedInt = 100;
        int primitiveInt = boxedInt;
        System.out.println("Integer -> int (auto-unboxing): " + primitiveInt);

        Double boxedDouble = 9.99;
        double primitiveDouble = boxedDouble;
        System.out.println("Double -> double: " + primitiveDouble);

        Boolean boxedBool = Boolean.TRUE;
        boolean primitiveBool = boxedBool;
        System.out.println("Boolean -> boolean: " + primitiveBool);

        Character boxedChar = 'Z';
        char primitiveChar = boxedChar;
        System.out.println("Character -> char: " + primitiveChar);

        Integer a = 50;
        Integer b = 30;
        int sum = a + b;
        System.out.println("Unboxing in arithmetic: " + a + " + " + b + " = " + sum);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        System.out.println("Sum from ArrayList (unboxing in loop): " + total);

        Integer x = null;
        try {
            int val = x;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: unboxing null Integer throws NPE");
        }
    }
}
