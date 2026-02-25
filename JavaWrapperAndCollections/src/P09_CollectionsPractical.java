import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class P09_CollectionsPractical {

    public static void main(String[] args) {
        System.out.println("=== Student Grade Management System ===\n");

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Riya");
        studentNames.add("Arjun");
        studentNames.add("Priya");
        studentNames.add("Karan");
        studentNames.add("Sneha");
        System.out.println("Students: " + studentNames);

        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Riya", 88);
        grades.put("Arjun", 72);
        grades.put("Priya", 95);
        grades.put("Karan", 60);
        grades.put("Sneha", 81);

        System.out.println("\n--- Grade Report ---");
        for (String name : studentNames) {
            int grade = grades.get(name);
            String status = grade >= 75 ? "PASS" : "FAIL";
            System.out.println(name + ": " + grade + " -> " + status);
        }

        HashSet<String> passedStudents = new HashSet<>();
        for (String name : studentNames) {
            if (grades.get(name) >= 75) {
                passedStudents.add(name);
            }
        }
        System.out.println("\nPassed Students (unique, no order): " + passedStudents);

        ArrayList<Integer> scoreList = new ArrayList<>(grades.values());
        Collections.sort(scoreList, Collections.reverseOrder());
        System.out.println("\nScores (highest to lowest): " + scoreList);

        PriorityQueue<Integer> topScores = new PriorityQueue<>(Collections.reverseOrder());
        topScores.addAll(grades.values());
        System.out.println("\nTop 3 Scores:");
        for (int i = 0; i < 3; i++) {
            System.out.println("  " + (i + 1) + ". " + topScores.poll());
        }

        LinkedList<String> waitingList = new LinkedList<>();
        waitingList.offer("Amit");
        waitingList.offer("Deepa");
        waitingList.offer("Raj");
        System.out.println("\nWaiting List Queue: " + waitingList);
        System.out.println("Next in queue: " + waitingList.poll());
        System.out.println("Updated Waiting List: " + waitingList);

        int totalScore = 0;
        for (int score : grades.values()) {
            totalScore += score;
        }
        double average = (double) totalScore / grades.size();
        System.out.println("\nClass Average: " + String.format("%.2f", average));
    }
}
