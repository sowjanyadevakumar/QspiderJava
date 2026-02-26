import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class P06_SetCollection {

    public static void main(String[] args) {
        System.out.println("--- HashSet (unordered, no duplicates) ---");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Grapes");
        System.out.println("HashSet: " + hashSet);
        System.out.println("Size: " + hashSet.size());
        System.out.println("Contains Mango: " + hashSet.contains("Mango"));
        hashSet.remove("Banana");
        System.out.println("After remove Banana: " + hashSet);

        System.out.println("\n--- LinkedHashSet (insertion order, no duplicates) ---");
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Delhi");
        linkedSet.add("Mumbai");
        linkedSet.add("Bangalore");
        linkedSet.add("Mumbai");
        System.out.println("LinkedHashSet: " + linkedSet);

        System.out.println("\n--- TreeSet (sorted order, no duplicates) ---");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(10);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());
        System.out.println("HeadSet (< 30): " + treeSet.headSet(30));
        System.out.println("TailSet (>= 30): " + treeSet.tailSet(30));
    }
}
