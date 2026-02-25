class Parent {
    void greet() {
        System.out.println("Hello from Parent.");
    }
}

class Child extends Parent {
    void greet() {
        System.out.println("Hello from Child.");
    }

    void callParentGreet() {
        super.greet();
    }
}

public class P08_MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.greet();

        Child c = new Child();
        c.greet();
        c.callParentGreet();
    }
}
