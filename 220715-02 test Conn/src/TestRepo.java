import java.sql.SQLException;
import java.util.List;

public class TestRepo {
	public static void main(String[] args) {
		BookRepository repo = new BookRepository();
		
		int result ;
		try {
//			result=repo.add(new Book("테스트용 책12",5000));
//			System.out.println("추가 확인: "+ (result ==1));
			
//			List<Book> list = repo.list();
//			System.out.println(list);
			
//			Book book = repo.selectByTitle("asdf");
//			System.out.println(book);
			
			result = repo.update(new Book(11,"자바에서 변경한 새이름",5000));
			System.out.println(result ==1);
		}catch(SQLException e) {
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}
		
	}
}
