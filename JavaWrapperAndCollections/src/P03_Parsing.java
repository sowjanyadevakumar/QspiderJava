public class P03_Parsing {

    public static void main(String[] args) {
        String intStr = "123";
        int parsedInt = Integer.parseInt(intStr);
        System.out.println("String \"123\" -> int: " + parsedInt + " (type: int)");

        String doubleStr = "3.14159";
        double parsedDouble = Double.parseDouble(doubleStr);
        System.out.println("String \"3.14159\" -> double: " + parsedDouble);

        String longStr = "9876543210";
        long parsedLong = Long.parseLong(longStr);
        System.out.println("String \"9876543210\" -> long: " + parsedLong);

        String floatStr = "2.718";
        float parsedFloat = Float.parseFloat(floatStr);
        System.out.println("String \"2.718\" -> float: " + parsedFloat);

        String boolStr = "true";
        boolean parsedBool = Boolean.parseBoolean(boolStr);
        System.out.println("String \"true\" -> boolean: " + parsedBool);

        String boolFalse = "hello";
        boolean parsedFalse = Boolean.parseBoolean(boolFalse);
        System.out.println("String \"hello\" -> boolean: " + parsedFalse);

        String byteStr = "127";
        byte parsedByte = Byte.parseByte(byteStr);
        System.out.println("String \"127\" -> byte: " + parsedByte);

        String shortStr = "500";
        short parsedShort = Short.parseShort(shortStr);
        System.out.println("String \"500\" -> short: " + parsedShort);

        try {
            int bad = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Parsing \"abc\" to int -> NumberFormatException: " + e.getMessage());
        }

        String age = "25";
        String salary = "55000.50";
        System.out.println("Employee age: " + Integer.parseInt(age) + ", Salary: " + Double.parseDouble(salary));
    }
}
