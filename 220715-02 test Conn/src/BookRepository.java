import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

// my_db.books 테이블
// 도서관리 콘솔 프로그램
// 추가 
// 전체목록
// 아이디나 제목이나 가격 등으로 검색 가능
// 삭제 
// 수정

public class BookRepository  {
	private Book resultMapping(ResultSet rs) throws SQLException {
		int bookId = rs.getInt("bookId");
		String title = rs.getString("title");
		int price =rs.getInt("price");
		
		return new Book(bookId,title,price);
	}
	
	
	//추가
	public int add(Book book) throws SQLException { //발생한 예외를 던진다. 
		String query ="insert into books (title,price) values ('"+book.getTitle()+"',"+book.getPrice()+")";
		System.out.println("추가: "+ query);
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt =conn.createStatement();
			
			return stmt.executeUpdate(query);
		}finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
	
	//목록 전체
	public List<Book> list() throws SQLException {
		String query ="select* from books";
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {//데이터베이스 정보를 담는다
				
				list.add(resultMapping(rs));
			}
		}finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}
	
//		data access object(DAO) 
	
	// 검색(제목) or  검색(가격)
	public Book selectByTitle (String title) throws SQLException{
		String query ="select* from books where title = '"+title+"'";
		Connection conn= null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				return resultMapping(rs);
			}else {// null을 반환한다,빈 객체, 예외 
				return null;
			}
		}finally {
			DBUtil.closeRs(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
	}
////	public List<Book> selectByPrice(int price){}
//	
	//삭제 - pk인 bookid를 사용해서 지울려고
	public int delete(int bookId) throws SQLException {
		String query = "delect from books where bookId = "+bookId;
		
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		}finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
//	//수정
	public int update(Book book) throws SQLException {
		String query = "update books set title ='"+ book.getTitle()
		+"', price =" +book.getPrice()
		+" where bookId ="+ book.getBookId();
		//쿼리문 띄어쓰기 신경쓰기 
		
		
		Connection conn= null;
		Statement stmt = null;
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			
			return stmt.executeUpdate(query);
		}finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
	}
}
