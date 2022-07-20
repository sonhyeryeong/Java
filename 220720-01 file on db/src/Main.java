import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class Main {
	//finally로 닫아주는 것을 자동으로 해주는거 해볼거임
	public static void main(String[] args) {
		// 트라이 리소스 문 - 닫는걸 자동으로 해줌 
		//세미콜론으로 구분하여 두 문장 써줄 수 있음. 
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("")) {
			
			pstmt.setString(1, " ");
			try(ResultSet rs = pstmt.executeQuery();){
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("")){
			
		}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
