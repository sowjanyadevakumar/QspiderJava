public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("QSpiders");

        System.out.println("Initial        : " + sb);
        System.out.println("Capacity       : " + sb.capacity());
        System.out.println("Length         : " + sb.length());

        sb.append(" Training");
        System.out.println("\nAfter append   : " + sb);

        sb.insert(8, " Java");
        System.out.println("After insert   : " + sb);

        sb.delete(8, 13);
        System.out.println("After delete   : " + sb);

        sb.reverse();
        System.out.println("After reverse  : " + sb);

        sb.reverse();

        System.out.println("\nStringBuilder vs StringBuffer:");
        System.out.println("Both are mutable");
        System.out.println("StringBuffer  -> synchronized (thread-safe)");
        System.out.println("StringBuilder -> not synchronized (faster, single-thread)");

        System.out.println("\nPerformance demo - String vs StringBuilder:");
        long start1 = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 5000; i++) {
            str = str + i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("String concat time   : " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        StringBuilder sbPerf = new StringBuilder();
        for (int i = 0; i < 5000; i++) {
            sbPerf.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder time   : " + (end2 - start2) + " ms");

        System.out.println("\nString to StringBuilder and back:");
        String input = "Bengaluru";
        StringBuilder converted = new StringBuilder(input);
        converted.reverse();
        System.out.println("Original : " + input);
        System.out.println("Reversed : " + converted.toString());
    }
}
