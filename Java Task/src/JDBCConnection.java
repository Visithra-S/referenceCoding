import java.sql.*;

public class JDBCConnection {

	private static Connection conn = null;
	private static PreparedStatement stmt = null;
	private static ResultSet rs = null;
	private static String output = null;
	private static final String username = "root";
	private static final String password = "root";
	private static final String url = "jdbc:mysql://localhost:3306/master_service";

	public static void main(String[] args) {
		//boolean count;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.prepareStatement("SELECT * FROM `junior_service`;");
			rs = stmt.executeQuery();
			//count = stmt.execute(); 

			while(rs.next()) {
				output = rs.getString("name");
				System.out.println("output : "+output);
			}
			
			//System.out.println("count : "+count);


		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if((rs != null) && !rs.isClosed()){
					rs.close();
				}
				if((stmt != null) && !stmt.isClosed()) {
					stmt.close();
				}
				if((conn != null) && !conn.isClosed()) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
