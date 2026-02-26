import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class P05_ListCollection {

    public static void main(String[] args) {
        System.out.println("--- ArrayList ---");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add(1, "Grapes");
        System.out.println("List: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Get index 2: " + fruits.get(2));
        System.out.println("Contains Mango: " + fruits.contains("Mango"));
        fruits.remove("Apple");
        System.out.println("After remove first Apple: " + fruits);
        Collections.sort(fruits);
        System.out.println("Sorted: " + fruits);

        System.out.println("\n--- LinkedList ---");
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5);
        numbers.addLast(40);
        System.out.println("LinkedList: " + numbers);
        System.out.println("First: " + numbers.getFirst());
        System.out.println("Last: " + numbers.getLast());
        numbers.removeFirst();
        System.out.println("After removeFirst: " + numbers);

        System.out.println("\n--- Iterating with Iterator ---");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("\n--- List Interface (polymorphism) ---");
        List<String> cities = new ArrayList<>();
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Delhi");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
