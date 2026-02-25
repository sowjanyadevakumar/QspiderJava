class Fruit {
    void taste() {
        System.out.println("Fruit has a taste.");
    }
}

class Mango extends Fruit {
    void taste() {
        System.out.println("Mango is sweet.");
    }
}

class Lemon extends Fruit {
    void taste() {
        System.out.println("Lemon is sour.");
    }
}

public class P10_RuntimePolymorphism {
    public static void main(String[] args) {
        Fruit f;

        f = new Mango();
        f.taste();

        f = new Lemon();
        f.taste();
    }
}
