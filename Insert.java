import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		Connection connection=null;
		String sql="INSERT INTO student VALUES(2,'ANUSHA','anusha@mail.com')";
		
		try {
			//Step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2
			connection= DriverManager.getConnection(url, username, password);
			
			//Step 3
			Statement statement = connection.createStatement();
			
			//Step 4
			statement.execute(sql);
			
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


