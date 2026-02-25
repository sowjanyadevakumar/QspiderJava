interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }

    public void photocopy() {
        scan();
        print();
    }
}

public class P15_Interface {
    public static void main(String[] args) {
        AllInOnePrinter machine = new AllInOnePrinter();
        machine.print();
        machine.scan();
        System.out.println("--- Photocopy ---");
        machine.photocopy();
    }
}
