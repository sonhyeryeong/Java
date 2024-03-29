package kr.co.greenart.dbutil;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	private final static Properties properties = new Properties();
	
	static {// dbutil 클래스가 로드되는 시점에서 생성됨
//		System.out.println("스테틱 블럭은 언제 실행되나요??");
		
		
		InputStream inStream =null;
		try {
			//프로퍼터 파일 읽어서(인풋스트림) 객체화
			inStream = DBUtil.class.getClassLoader()
					.getResourceAsStream("mysql.properties");
			properties.load(inStream);
			
			String driverClass = properties.getProperty("JDBC_DRIVER_CLASS");
			
			//드라이버 로드 (적재)
			Class.forName(driverClass);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static Connection getConnection() throws SQLException {
		String url = properties.getProperty("JDBC_URL");
		String id = properties.getProperty("JDBC_USERNAME");
		String password = properties.getProperty("JDBC_PASSWORD");
		
		return DriverManager.getConnection(url,id,password);
	}
	
	public static void closeConn(Connection conn) {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeStmt(Statement stmt) {
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeRs(ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
