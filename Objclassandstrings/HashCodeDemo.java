public class HashCodeDemo {

    int productId;
    String productName;

    HashCodeDemo(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        HashCodeDemo other = (HashCodeDemo) obj;
        return this.productId == other.productId && this.productName.equals(other.productName);
    }

    @Override
    public int hashCode() {
        return 31 * productId + productName.hashCode();
    }

    public static void main(String[] args) {
        HashCodeDemo p1 = new HashCodeDemo(1, "Laptop");
        HashCodeDemo p2 = new HashCodeDemo(1, "Laptop");
        HashCodeDemo p3 = new HashCodeDemo(2, "Mobile");

        System.out.println("p1 hashCode : " + p1.hashCode());
        System.out.println("p2 hashCode : " + p2.hashCode());
        System.out.println("p3 hashCode : " + p3.hashCode());

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        System.out.println("\nString hashCode demo:");
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());
    }
}
