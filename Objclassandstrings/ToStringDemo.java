public class ToStringDemo {

    int rollNo;
    String studentName;
    double marks;

    ToStringDemo(int rollNo, String studentName, double marks) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "RollNo: " + rollNo + " | Name: " + studentName + " | Marks: " + marks;
    }

    public static void main(String[] args) {
        ToStringDemo s1 = new ToStringDemo(101, "Ravi", 88.5);
        ToStringDemo s2 = new ToStringDemo(102, "Priya", 92.0);

        System.out.println("Without override (default): ");
        System.out.println(s1.getClass().getName() + "@" + Integer.toHexString(s1.hashCode()));

        System.out.println("\nWith toString() override:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.toString());
    }
}
