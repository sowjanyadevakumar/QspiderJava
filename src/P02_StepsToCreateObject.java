class Student {
    String name;
    int rollNo;

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class P02_StepsToCreateObject {
    public static void main(String[] args) {
        Student s;
        s = new Student();
        s.name = "Ravi";
        s.rollNo = 101;
        s.showDetails();
    }
}
