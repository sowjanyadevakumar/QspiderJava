class Bird {
    void sound() {
        System.out.println("Bird makes a sound.");
    }
}

class Sparrow extends Bird {
    void sound() {
        System.out.println("Sparrow chirps.");
    }
}

class Parrot extends Bird {
    void sound() {
        System.out.println("Parrot talks.");
    }

    void mimic() {
        System.out.println("Parrot mimics human voice.");
    }
}

public class P11_PolymorphismArray {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Bird();
        birds[1] = new Sparrow();
        birds[2] = new Parrot();

        for (Bird b : birds) {
            b.sound();
            if (b instanceof Parrot) {
                ((Parrot) b).mimic();
            }
        }
    }
}
