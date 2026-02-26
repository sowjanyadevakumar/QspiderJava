public class P01_Boxing {

    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer boxedInt = primitiveInt;
        System.out.println("int -> Integer (autoboxing): " + boxedInt);

        double primitiveDouble = 3.14;
        Double boxedDouble = primitiveDouble;
        System.out.println("double -> Double: " + boxedDouble);

        boolean primitiveBool = true;
        Boolean boxedBool = primitiveBool;
        System.out.println("boolean -> Boolean: " + boxedBool);

        char primitiveChar = 'A';
        Character boxedChar = primitiveChar;
        System.out.println("char -> Character: " + boxedChar);

        long primitiveLong = 100L;
        Long boxedLong = primitiveLong;
        System.out.println("long -> Long: " + boxedLong);

        Integer manualBox = Integer.valueOf(99);
        System.out.println("Manual boxing with valueOf: " + manualBox);

        System.out.println("Max Integer value: " + Integer.MAX_VALUE);
        System.out.println("Min Integer value: " + Integer.MIN_VALUE);
    }
}
