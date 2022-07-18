import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import kr.co.greenart.dbutil.DBUtil;

// my_db.books 테이블
// 도서관리 콘솔 프로그램
// 추가 
// 전체목록
// 아이디나 제목이나 가격 등으로 검색 가능
// 삭제 
// 수정

public class TestConn {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.println("실행 흐름1");
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT 1"); 
			
			if(rs.next()) {
				int result = rs.getInt(1);
				System.out.println("확인: " + result );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}
