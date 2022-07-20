import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class Restaurants {
	//새 객체 생성
	private Place resultMapping(ResultSet rs) throws SQLException {
		String name = rs.getString("name");
		String num = rs.getString("num");
		String adress =rs.getString("adress");
		
		return new Place(name,num,adress);
	}
	//추가하는 메소드 만들기. 
	public int add(Place place) throws SQLException{
		String query ="insert into place(name,num,adress) values ('"+place.getName()+"','"
						+place.getNum()+"','"+place.getAdress()+"');";
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
	
	//목록 전체 출력
	//LIST 란 배열 안에 SQL데이터베이스를 넣고, 배열을 출력하도록 한다. 
	public List<Place> list() throws SQLException{
		String query = "select * from place";
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Place> list = new ArrayList<>();
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
	
	//검색하기 (상호명)
	public Place selectByName(String name) throws SQLException{
		//파라미터로 넣은 값을 이름에서 찾아서 
		String query ="select * from place where name = '"+name+"'";
		System.out.println("쿼리문 확인:"+query);
		Connection conn= null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			if(rs.next()) {
				//새로운 객체로 만든다. 
				//그 객체를 반환함
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
	
	
	//삭제 - 상호명으로 삭제할거임
	public int delete(String name) throws SQLException{
		String query = "delete from place where name = '"+name +"'";
		System.out.println("쿼리문 확인:"+query);
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
	
	//수정
	public int update(Place place) throws SQLException {
		String query = "update place set name ='"+ place.getName()
		+"', num ='" +place.getNum()
		+"' where name = '"+ place.getName()+"'";
	
		System.out.println("쿼리문 확인:"+query);
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