public class SimpleTryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int number = Integer.parseInt("Chandra"); // This will cause a NumberFormatException
        } catch (NumberFormatException e) {
            // Handle the exception
            System.out.println("Raju");
        }

        System.out.println("Program continues smoothly...");
    }
}