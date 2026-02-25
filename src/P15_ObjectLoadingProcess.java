class Person {
    String name;
    int age;

    static {
        System.out.println("Step 1: Class loaded into memory (Static block executed)");
    }

    Person() {
        System.out.println("Step 3: Constructor called - Object initialized");
        name = "Default";
        age = 0;
    }

    Person(String n, int a) {
        System.out.println("Step 3: Parameterized Constructor called");
        name = n;
        age = a;
    }

    void greet() {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old.");
    }
}

public class P15_ObjectLoadingProcess {
    public static void main(String[] args) {
        System.out.println("Step 2: main() started - creating object now");
        Person p1 = new Person();
        System.out.println("Step 4: Object p1 ready");
        p1.greet();

        System.out.println("---");

        System.out.println("Step 2b: Creating second object");
        Person p2 = new Person("Ananya", 22);
        System.out.println("Step 4b: Object p2 ready");
        p2.greet();
    }
}
