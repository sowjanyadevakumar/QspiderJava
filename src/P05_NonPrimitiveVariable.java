class Address {
    String city;
    String state;

    void show() {
        System.out.println("City: " + city + ", State: " + state);
    }
}

class Employee {
    String name;
    Address addr;
}

public class P05_NonPrimitiveVariable {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Kiran";
        e.addr = new Address();
        e.addr.city = "Bangalore";
        e.addr.state = "Karnataka";

        System.out.println("Employee: " + e.name);
        e.addr.show();
    }
}
