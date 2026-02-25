public class FinalizeDemo {

    String resourceName;

    FinalizeDemo(String resourceName) {
        this.resourceName = resourceName;
        System.out.println("Object created for: " + resourceName);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called - Releasing resource: " + resourceName);
        super.finalize();
    }

    public static void main(String[] args) throws InterruptedException {
        FinalizeDemo obj1 = new FinalizeDemo("DatabaseConnection");
        FinalizeDemo obj2 = new FinalizeDemo("FileHandler");

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("Garbage collector requested...");
        Thread.sleep(1000);
        System.out.println("Main method ends.");
    }
}
