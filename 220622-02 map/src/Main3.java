import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//중국집 주문 가격 계산기
//짜장면:2500 짬뽕:4000 볶음밥:4000 

//메뉴를 추가 할 수 있게 끔 

//사용자가 주문한 계산 결과 출력 가능 
class Method{
	
	
}






public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int howMuch =0;
		
		Map<String, Integer> map = new HashMap<>();
		map.put("짜장면",2500);
		map.put("짬뽕", 4000);
		map.put("볶음밥",4000);
		map.put("칠리새우",25000);
		
		
		
		
		//메뉴판 보여줌 - 원하는 음식 정하고- 수량 입력하고 - 다른 원하는 음식? - 수량? - 주문 끝임?
		boolean end = true;
		while(end) {
			System.out.println("메뉴판");
			System.out.println(map);
			System.out.println("1.주문하기\t2.메뉴 추가\t 3.시스템 종료");
			int what = scan.nextInt();
			switch(what) {
			case 1:
				while(true) {
					System.out.println("원하는 음식을 입력하세요");
					scan.nextLine();
					String food = scan.nextLine();
					System.out.println("수량을 입력하세요");
					int how = scan.nextInt();
					for(Map.Entry<String, Integer> s: map.entrySet()) {
						if(food.equals(s.getKey())) {
							howMuch += s.getValue()*how;
						}
					}
					System.out.println("1.더 주문하기\t2.주문 종료");
					int plusOrEnd = scan.nextInt();
					if(plusOrEnd==1) {
						continue;
					}else if(plusOrEnd==2){
						System.out.println("총 합은: "+howMuch);
						break;
					}else {
						System.out.println("잘못된 입력입니다.");
						break;
					}
				}
				break;
		
			case 2:	
				scan.nextLine();
				System.out.println("추가할 메뉴를 입력해주세요");
				String name = scan.nextLine();
				System.out.println("가격을 설정하여 주세요");
				int price = scan.nextInt();
				map.put(name,price);
				break;
				
				
			case 3: 
				System.out.println("시스템 종료");
				end= false;
				break;
			}
			
		}
		
		
		
	}
}


