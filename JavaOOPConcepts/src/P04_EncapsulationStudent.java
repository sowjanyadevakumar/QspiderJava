class Student {
    private String name;
    private int rollNo;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks for " + name);
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else
            return "F";
    }

    public void display() {
        System.out.println("Roll: " + rollNo + " | Name: " + name + " | Marks: " + marks + " | Grade: " + getGrade());
    }
}

public class P04_EncapsulationStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Kiran");
        s1.setRollNo(101);
        s1.setMarks(92);
        s1.display();

        Student s2 = new Student();
        s2.setName("Meena");
        s2.setRollNo(102);
        s2.setMarks(110);
        s2.setMarks(74);
        s2.display();
    }
}
