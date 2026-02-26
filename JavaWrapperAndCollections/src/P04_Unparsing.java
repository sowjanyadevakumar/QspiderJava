public class P04_Unparsing {

    public static void main(String[] args) {
        int num = 42;
        String fromInt = Integer.toString(num);
        System.out.println("int 42 -> String: \"" + fromInt + "\" (type: String)");

        double d = 3.14;
        String fromDouble = Double.toString(d);
        System.out.println("double 3.14 -> String: \"" + fromDouble + "\"");

        boolean b = true;
        String fromBool = Boolean.toString(b);
        System.out.println("boolean true -> String: \"" + fromBool + "\"");

        long l = 9876543210L;
        String fromLong = Long.toString(l);
        System.out.println("long -> String: \"" + fromLong + "\"");

        char c = 'J';
        String fromChar = Character.toString(c);
        System.out.println("char 'J' -> String: \"" + fromChar + "\"");

        String usingValueOf = String.valueOf(99);
        System.out.println("String.valueOf(99): \"" + usingValueOf + "\"");

        String usingConcat = 55 + "";
        System.out.println("55 + \"\": \"" + usingConcat + "\"");

        int binary = 255;
        System.out.println("255 in binary: " + Integer.toBinaryString(binary));
        System.out.println("255 in octal: " + Integer.toOctalString(binary));
        System.out.println("255 in hex: " + Integer.toHexString(binary));
    }
}
