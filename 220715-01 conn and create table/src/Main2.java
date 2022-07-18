import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
	public static Connection makeConnection() {//메소드로 커넥션을 만든다. 
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id ="root";
		String password ="root";
		
		Connection conn= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,password);//드라이브 매니져로 커넥션을 얻었다. 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}//사용하기 위해 커넥션을 얻는 메소드이기 때문에 닫는 동작이 없다. 
	
	
	
	
	public static void main(String[] args) {
		//book테이블에 칼럼추가 
		Connection conn= null;
		Statement stmt = null;
		
		try {
			conn= makeConnection();
			stmt = conn.createStatement();
			
			//int반환값이 있다. 
			int result =stmt.executeUpdate("insert into books (title,price) VALUES('SQL 연습',17000);");
			System.out.println(result+"행이 추가되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally { // 최근에 연 것부터 닫아준다. 
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
