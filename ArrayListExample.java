import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial List: " + fruits);

        // Insert an element at a specific index
        fruits.add(1, "Blueberry");
        System.out.println("After adding Blueberry: " + fruits);

        // Access an element by index
        String fruitAtIndex2 = fruits.get(2);
        System.out.println("Element at index 2: " + fruitAtIndex2);

        // Update an element
        fruits.set(0, "Apricot");
        System.out.println("After updating index 0: " + fruits);

        // Remove an element by index
        fruits.remove(3);
        System.out.println("After removing element at index 3: " + fruits);

        // Check if an element exists
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        // Iterate through the ArrayList
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}