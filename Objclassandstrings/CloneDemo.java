public class CloneDemo implements Cloneable {

    int itemId;
    String itemName;
    double price;

    CloneDemo(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ItemId: " + itemId + " | Item: " + itemName + " | Price: " + price;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneDemo original = new CloneDemo(501, "Keyboard", 1500.0);
        CloneDemo copy = (CloneDemo) original.clone();

        System.out.println("Original : " + original);
        System.out.println("Clone    : " + copy);

        System.out.println("\nAre both same object? " + (original == copy));

        copy.itemName = "Mouse";
        copy.price = 800.0;

        System.out.println("\nAfter modifying clone:");
        System.out.println("Original : " + original);
        System.out.println("Clone    : " + copy);
    }
}
