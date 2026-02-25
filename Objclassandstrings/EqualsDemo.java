public class EqualsDemo {

    int empId;
    String empName;

    EqualsDemo(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        EqualsDemo other = (EqualsDemo) obj;
        return this.empId == other.empId && this.empName.equals(other.empName);
    }

    public static void main(String[] args) {
        EqualsDemo e1 = new EqualsDemo(10, "Kiran");
        EqualsDemo e2 = new EqualsDemo(10, "Kiran");
        EqualsDemo e3 = new EqualsDemo(20, "Suresh");

        System.out.println("== operator (e1 == e2)     : " + (e1 == e2));
        System.out.println("== operator (e1 == e1)     : " + (e1 == e1));

        System.out.println("equals() (e1, e2) same data: " + e1.equals(e2));
        System.out.println("equals() (e1, e3) diff data: " + e1.equals(e3));

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("\nString == : " + (str1 == str2));
        System.out.println("String equals: " + str1.equals(str2));
    }
}
