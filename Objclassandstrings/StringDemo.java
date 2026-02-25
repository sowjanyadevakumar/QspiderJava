public class StringDemo {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "Java";

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println("\nString Pool demo:");
        System.out.println("s1 == s2 (pool)     : " + (s1 == s2));
        System.out.println("s1 == s3 (new obj)  : " + (s1 == s3));
        System.out.println("s1.equals(s3)       : " + s1.equals(s3));

        System.out.println("\nString is immutable:");
        String original = "Bangalore";
        original.concat(" City");
        System.out.println("After concat (original unchanged): " + original);
        String modified = original.concat(" City");
        System.out.println("Stored in new ref: " + modified);

        System.out.println("\nUseful String methods:");
        System.out.println("Length     : " + s1.length());
        System.out.println("UpperCase  : " + s1.toUpperCase());
        System.out.println("LowerCase  : " + s1.toLowerCase());
        System.out.println("CharAt(1)  : " + s1.charAt(1));
        System.out.println("Contains   : " + s1.contains("ell"));
        System.out.println("Concat     : " + s1.concat(" " + s4));
        System.out.println("Replace    : " + s1.replace('l', 'r'));
        System.out.println("Substring  : " + s1.substring(1, 4));
        System.out.println("Trim       : " + "  Spaces  ".trim());
    }
}
