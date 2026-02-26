class AgeNotEligibleException extends RuntimeException {
    AgeNotEligibleException(String message) {
        super(message);
    }
}

class InvalidGradeException extends Exception {
    InvalidGradeException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int age;
    int grade;

    Student(String name, int age, int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade must be between 0-100. Given: " + grade);
        }
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void registerForExam() {
        if (age < 16) {
            throw new AgeNotEligibleException(name + " is not eligible. Min age is 16.");
        }
        System.out.println(name + " registered for exam successfully.");
    }

    void displayResult() {
        String result = grade >= 50 ? "PASS" : "FAIL";
        System.out.println(name + " -> Grade: " + grade + " | Result: " + result);
    }
}

class FileProcessor {
    static String readFile(String filename) throws Exception {
        if (filename == null || filename.isEmpty()) {
            throw new IllegalArgumentException("Filename cannot be empty");
        }
        if (!filename.endsWith(".txt")) {
            throw new Exception("Only .txt files are supported: " + filename);
        }
        return "Content of " + filename;
    }
}

public class P12_CustomExceptionAndThrowVsThrows {

    static void processFile(String filename) throws Exception {
        String content = FileProcessor.readFile(filename);
        System.out.println("File read: " + content);
    }

    public static void main(String[] args) {
        System.out.println("--- Custom Exception: AgeNotEligibleException (Unchecked) ---");
        try {
            Student s1 = new Student("Riya", 14, 85);
            s1.registerForExam();
        } catch (AgeNotEligibleException | InvalidGradeException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("\n--- Custom Exception: InvalidGradeException (Checked) ---");
        try {
            Student s2 = new Student("Arjun", 18, 110);
            s2.registerForExam();
        } catch (InvalidGradeException e) {
            System.out.println("Caught checked: " + e.getMessage());
        }

        System.out.println("\n--- Valid Student ---");
        try {
            Student s3 = new Student("Priya", 17, 72);
            s3.registerForExam();
            s3.displayResult();
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- throw vs throws: FileProcessor ---");
        System.out.println("throws: declares exception in method signature (obligation to caller)");
        System.out.println("throw: actually throws the exception object at runtime");

        try {
            processFile("report.txt");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            processFile("image.png");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
