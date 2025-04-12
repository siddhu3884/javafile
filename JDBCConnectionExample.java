import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionExample {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace 'testdb' with your database name
        String username = "root"; // Replace with your database username
        String password = "password"; // Replace with your database password

        try {
            // Establish the connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to the database was successful!");

            // Close the connection
            connection.close();
        } catch (SQLException e) {
            System.out.println("An error occurred while connecting to the database: ");
        }
    }
}