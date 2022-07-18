import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id ="root";
		String password ="root";
		
		Connection conn= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,id,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void selectAllBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =null;
		try {
			conn= makeConnection();
			stmt = conn.createStatement();
			rs =stmt.executeQuery("select * from books");
			
			while(rs.next()){//다음 행이 있는지 없는지 확인하는 next메소드
				int id =rs.getInt("bookId");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				System.out.println(id+","+title+","+price);
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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
	
	
	public static int insertBook(String title,int price) {
			//book테이블에 칼럼추가 
			Connection conn= null;
			Statement stmt = null;
			int result =0;
			
			try {
				conn= makeConnection();
				stmt = conn.createStatement();
				
				
				result =stmt.executeUpdate("insert into books (title,price) VALUES("
						+"'"+title+"',"+price+");");
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
			return result;
	}

	
	public static void main(String[] args) {
//		insertBook("새로운책입니다",13000);
		selectAllBook();
	}
}
