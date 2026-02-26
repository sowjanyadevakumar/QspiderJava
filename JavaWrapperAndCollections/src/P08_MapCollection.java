import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class P08_MapCollection {

    public static void main(String[] args) {
        System.out.println("--- HashMap (unordered, key-value pairs) ---");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 85);
        hashMap.put("Bob", 90);
        hashMap.put("Charlie", 78);
        hashMap.put("Alice", 95);
        System.out.println("HashMap: " + hashMap);
        System.out.println("Get Alice: " + hashMap.get("Alice"));
        System.out.println("ContainsKey Bob: " + hashMap.containsKey("Bob"));
        System.out.println("ContainsValue 78: " + hashMap.containsValue(78));
        hashMap.remove("Charlie");
        System.out.println("After remove Charlie: " + hashMap);

        System.out.println("\n--- Iterating HashMap ---");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\n--- LinkedHashMap (insertion order) ---");
        LinkedHashMap<String, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("Name", "Sowjanya");
        linkedMap.put("City", "Bangalore");
        linkedMap.put("Course", "Java");
        System.out.println("LinkedHashMap: " + linkedMap);

        System.out.println("\n--- TreeMap (sorted by key) ---");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 1);
        treeMap.put("Apple", 3);
        treeMap.put("Mango", 2);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());

        System.out.println("\n--- getOrDefault and putIfAbsent ---");
        hashMap.putIfAbsent("David", 88);
        System.out.println("David score: " + hashMap.getOrDefault("Eve", 0));
        System.out.println("Map: " + hashMap);
    }
}
