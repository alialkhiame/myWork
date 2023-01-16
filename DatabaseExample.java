import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseExample {
	public static void main(String[] args) {
		frames k = new frames();
	}

	public static void addToTabel(String x) {

		try {
			// Load the MySQL driver
			Class.forName("com.mysql.jdbc.Driver");

			// Connect to the database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/a", "root", "!!!!!");

			// Create a statement
			Statement stmt = con.createStatement();

			// Execute the insert statement
			String x2 = "INSERT INTO q (nn) VALUES ('" + x + "')";
			stmt.executeUpdate(x2);

			// Close the connection
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
