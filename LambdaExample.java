import java.util.ArrayList;

public class LambdaExample {
    public static void main(String[] args) {
        // Create a list of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Use a lambda expression to iterate and print each number
        numbers.forEach(number -> System.out.println("Number: " + number));
    }
}