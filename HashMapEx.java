import java.util.HashMap;

public class HashMapEx{
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        // Print the HashMap
        System.out.println("HashMap: " + map);
    }
}