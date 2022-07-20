import java.sql.SQLException;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Restaurants rest = new Restaurants();
		
		int result;
		try {
			//추가 확인
//			result = rest.add(new Place("테스트용3","테스트 넘버3","테스트 주소3"));
//			System.out.println("추가확인: "+ (result ==1));
			
			
//			Place place  = rest.selectByName("테스트용1");
//			System.out.println(place);
			
//			result = rest.delete("테스트용2");
			
			result = rest.update(new Place("테스트용1","테스트넘버1","테스트주소1"));
			System.out.println(result ==1);
			
			List<Place> list = rest.list();
			System.out.println(list);
			
		}catch(SQLException e) {
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}
	}
}
