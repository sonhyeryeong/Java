import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ConsoleTest {
	private Restaurants rest;
	
	public ConsoleTest(Restaurants rest) {
		this.rest =rest;
	}
	public void menu() {
		System.out.println("1.추가 , 2.목록, 3.삭제, 4.수정, 5.검색(제목)");
		Scanner scan  = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		
		switch (num) {
		case 1:
			break;
		case 2:
			list();
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}
	}
	private void  list() {
		try {
			List<Place> list  = rest.list();
			if(list.size()>0) {
				for(Place p :list) {
					System.out.println(p);
				}
			}else {
				System.out.println("책 데이터가 없음.");
			}
		}catch(SQLException e) {
			System.out.println("데이터를 읽어오는거 실패함. 다시해보실?");
		}
	}
	
	public void add() {
		System.out.println("제목,가격을 입력해주세요");
		Scanner scan  = new Scanner (System.in);
		String title = scan.nextLine();
		if(title.length()>40) {
			System.out.println("40자를 넘었습니다. ");
			return;
		}
		int price = scan.nextInt();
		
		try {
			int result = rest.add(new Place());
			
			System.out.println(result +"개의 책이 추가되었습니다. ");
		}catch(SQLException e){
			int code = e.getErrorCode();
			if(code==1062) {
				System.out.println("중복된 제목. 제목을 다시 확인해주세요");
			}
			System.out.println("데이터를 추가하는 과정이 실패했습니다. 다시 시도해주세요.");
		}
	}
	
	
	
	
	
	
	
	
	
}
