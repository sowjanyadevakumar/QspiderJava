class Address {
    String city;
    String state;
    String pincode;

    Address(String city, String state, String pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    void display() {
        System.out.println("  City: " + city + ", State: " + state + ", Pin: " + pincode);
    }
}

class StaffMember {
    String name;
    String role;
    Address address;

    StaffMember(String name, String role, Address address) {
        this.name = name;
        this.role = role;
        this.address = address;
    }

    void display() {
        System.out.println("Name: " + name + " | Role: " + role);
        System.out.println("Lives at:");
        address.display();
    }
}

public class P18_HasAComposition {
    public static void main(String[] args) {
        Address a1 = new Address("Bangalore", "Karnataka", "560001");
        StaffMember s1 = new StaffMember("Deepa", "Trainer", a1);
        s1.display();

        System.out.println("---");

        Address a2 = new Address("Chennai", "Tamil Nadu", "600001");
        StaffMember s2 = new StaffMember("Raj", "Developer", a2);
        s2.display();
    }
}
