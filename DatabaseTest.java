import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {
    public static void main(String[] args) {
        // Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/CollegeWebsite_LogInDetails"; // Replace with your database name
        String username = "root"; // Replace with your MySQL username
        String password = ""; // Replace with your MySQL password

        try {
            // Explicitly load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
                if (connection != null) {
                    System.out.println("Database connected successfully!");
                } else {
                    System.out.println("Failed to connect to the database!");
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver not found. Ensure the connector JAR is in the classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("An error occurred while connecting to the database.");
            e.printStackTrace();
        }
    }
}
