import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Set {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		Connection connection=null;
		String sql="SELECT * from student";
		
		try {
			
			//STEP 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//STEP 2
			connection= DriverManager.getConnection(url, username, password);
			
			//STEP 3
			Statement statement= connection.createStatement();
			
			//STEP 4
			ResultSet resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("================");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
	          try {
				//STEP 5
				connection.close();
				System.out.println("ALL GOOD");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
