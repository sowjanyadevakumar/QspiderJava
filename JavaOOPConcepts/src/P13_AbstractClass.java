abstract class StaffEmployee {
    String name;
    double baseSalary;

    StaffEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateBonus();

    void display() {
        System.out.println("Name: " + name + " | Base: " + baseSalary + " | Bonus: " + calculateBonus());
    }
}

class Manager extends StaffEmployee {
    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateBonus() {
        return baseSalary * 0.30;
    }
}

class Developer extends StaffEmployee {
    Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateBonus() {
        return baseSalary * 0.20;
    }
}

public class P13_AbstractClass {
    public static void main(String[] args) {
        Manager m = new Manager("Suresh", 80000);
        Developer d = new Developer("Anita", 60000);
        m.display();
        d.display();
    }
}
