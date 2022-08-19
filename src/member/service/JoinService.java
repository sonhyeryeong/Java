package member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;
import member.model.Member;
import member.model.MemberDao;

public class JoinService {

	private MemberDao memberDao = new MemberDao();
	
	public void join(JoinRequest joinReq) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			Member member = memberDao.selectById(conn, joinReq.getId());
			if (member != null) {
				JdbcUtil.rollback(conn);
				throw new DuplicateldException();
			}
			
			memberDao.insert(conn, 
					new Member(
							joinReq.getId(), 
							joinReq.getName(), 
							joinReq.getPassword(), 
							new Date())
					);
			conn.commit();
		} catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.closeConn(conn);
		}
	}
}