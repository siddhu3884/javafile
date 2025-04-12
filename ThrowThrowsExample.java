public class ThrowThrowsExample {
    // Method with 'throws' keyword to declare it might throw an exception
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // Use 'throw' keyword to throw an exception
            throw new IllegalArgumentException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        try {
            // Call the method with an invalid age
            checkAge(16);
        } catch (IllegalArgumentException e) {
            // Handle the exception
            System.out.println("Exception: " + e.getMessage());
        }
        
        System.out.println("Program continues...");
    }
}