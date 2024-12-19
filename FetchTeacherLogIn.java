import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchTeacherLogIn {
    public static void main(String[] args) {
        // Database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/CollegeWebsite_LogInDetails"; // Replace with your database name
        String username = "root"; // Replace with your MySQL username
        String password = ""; // Replace with your MySQL password

        // SQL query to fetch rows
        String query = "SELECT * FROM teacherLogIn"; // Replace with your table name

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute the query
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            System.out.println("SerialNumber\tUsername\tEmail\tPassword\tMobile_Number");
            System.out.println("--------------------------------------------------------");
            while (resultSet.next()) {
                int id = resultSet.getInt("serial_No"); // Replace 'id' with your column name
                String userName = resultSet.getString("fullname"); // Replace 'username' with your column name
                String Email = resultSet.getString("email"); // Replace 'password' with your column name
                String mypassword = resultSet.getString("password");
                String mobileNumber = resultSet.getString("mobileNumber");
                System.out.println(id + "\t" +userName + "\t" + Email + "\t" + mypassword + "\t" + mobileNumber);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver not found. Ensure the connector JAR is in the classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        }
    }
}
