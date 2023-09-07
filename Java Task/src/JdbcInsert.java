import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcInsert {

	private static Connection conn = null;
	private static PreparedStatement stmt = null;
	private static ResultSet rs = null;
	private static String output = null;
	private static final String username = "root";
	private static final String password = "root";
	private static final String url = "jdbc:mysql://localhost:3306/master_service";

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.prepareStatement("insert into ");
			//rs = stmt.executeQuery();



		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
	
		}
	}

}
