public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Initial        : " + sb);
        System.out.println("Capacity       : " + sb.capacity());
        System.out.println("Length         : " + sb.length());

        sb.append(" Programming");
        System.out.println("\nAfter append   : " + sb);

        sb.insert(4, " Core");
        System.out.println("After insert   : " + sb);

        sb.replace(5, 9, "Advanced");
        System.out.println("After replace  : " + sb);

        sb.delete(5, 14);
        System.out.println("After delete   : " + sb);

        sb.reverse();
        System.out.println("After reverse  : " + sb);

        sb.reverse();
        System.out.println("Reversed back  : " + sb);

        System.out.println("\ncharAt(0)      : " + sb.charAt(0));
        System.out.println("indexOf('P')   : " + sb.indexOf("P"));
        System.out.println("substring(5)   : " + sb.substring(5));

        System.out.println("\nStringBuffer is mutable - same object modified:");
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Before: " + sb2.hashCode());
        sb2.append(" World");
        System.out.println("After : " + sb2.hashCode());
        System.out.println(sb2);
    }
}
