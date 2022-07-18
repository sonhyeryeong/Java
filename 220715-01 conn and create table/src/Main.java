import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt =null;
		//드라이버 로드하기
		try {
			//커넥션만 하는 중
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");

			// table a : 컬럼 b varchar(10) pk 
			String query = "CREATE TABLE A (B VARCHAR(10) PRIMARY KEY);";
			//명령을 보낸다
			//사용하고 항상 닫아주어야 한다. 커넥션 위에!
			stmt  = conn.createStatement();
			
			stmt.executeUpdate(query);// INSERT, UPDATE, DELETE 할 때 executeUpdate 를 사용한다. 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {// 사용한 순서 역순으로 닫아준다. 
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
