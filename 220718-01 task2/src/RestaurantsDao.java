import java.sql.SQLException;
import java.util.List;

//5개의 메소드를 만들어야 하기 때문에 인터페이스로 5개 일단 만들어줌
public interface RestaurantsDao {
	int create(String name,String num, String adress) throws SQLException;
	
	//쌤은 레스토랑 클래스로 만듬
	List<Place> read() throws SQLException;//전체를 읽는거
	Place read(int id) throws SQLException;//pk하나만 읽는거 
	
	int update(int id, String name,String num, String address) throws SQLException;
	int delete(int id) throws SQLException;
	
	
}
