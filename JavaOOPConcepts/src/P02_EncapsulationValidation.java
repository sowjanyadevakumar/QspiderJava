class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative. Setting to 0.");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Name: " + name + " | Salary: " + salary);
    }
}

public class P02_EncapsulationValidation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Ravi");
        e.setSalary(50000);
        e.display();

        Employee e2 = new Employee();
        e2.setName("Kumar");
        e2.setSalary(-1000);
        e2.display();
    }
}
