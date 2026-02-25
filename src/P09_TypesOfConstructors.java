class Animal {
    String name;
    String sound;

    Animal() {
        name = "Unknown";
        sound = "...";
    }

    Animal(String n, String s) {
        name = n;
        sound = s;
    }

    void speak() {
        System.out.println(name + " says " + sound);
    }
}

public class P09_TypesOfConstructors {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.speak();

        Animal a2 = new Animal("Dog", "Woof");
        a2.speak();

        Animal a3 = new Animal("Cat", "Meow");
        a3.speak();
    }
}
