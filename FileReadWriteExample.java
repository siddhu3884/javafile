import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWriteExample {
    public static void main(String[] args) {
        try {
            // Writing to a file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a simple file handling example.");
            writer.close();
            System.out.println("Data has been written to the file.");

            // Reading from a file
            File file = new File("example.txt");
            Scanner reader = new Scanner(file);
            System.out.println("Reading from the file:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            // Handle any file-related exceptions
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}