import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//중국집 주문 가격 계산기
//짜장면:2500 짬뽕:4000 볶음밥:4000 

//메뉴를 추가 할 수 있게 끔 

//사용자가 주문한 계산 결과 출력 가

//1.맵을 하나 더 만들어서 KEY는 메ㅠㄴ이름, 벨류는 0개 ...+1
//2.주문메뉴어레이리스트
class KingParkMin{
	Map<String,Integer> map;
	
	public KingParkMin(Map<String, Integer> map) {
		super();
		this.map = map;
	}

	void calc() {//계산하는 메소드
		Scanner scan = new Scanner(System.in);
		int howMuch = 0;
		
		while(true) {
			System.out.println("원하는 음식을 입력하세요");
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
				scan.nextLine();
				continue;
			}else if(plusOrEnd==2){
				System.out.println("총 합은: "+howMuch);
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
	void plusMenu() {// 메뉴 추가하는 메소드
		Scanner scan = new Scanner(System.in);
		System.out.println("추가할 메뉴를 입력해주세요");
		String name = scan.nextLine();
		System.out.println("가격을 설정하여 주세요");
		int price = scan.nextInt();
		map.put(name,price);
	}
}


public class Self {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int howMuch =0;
		
		Map<String, Integer> map = new HashMap<>();
		map.put("짜장면",2500);
		map.put("짬뽕", 4000);
		map.put("볶음밥",4000);
		map.put("칠리새우",25000);
		
		KingParkMin method = new KingParkMin(map);
		
		//메뉴판 보여줌 - 원하는 음식 정하고- 수량 입력하고 - 다른 원하는 음식? - 수량? - 주문 끝임?
		boolean end = true;
		while(end) {
			System.out.println("아래 중 하나를 선택하세요");
			
			System.out.println("1.주문하기\t2.메뉴 추가\t 3.시스템 종료");
			int what = scan.nextInt();
			switch(what) {
			case 1://계산하기
				System.out.println("메뉴판\n"+map);
				method.calc();
				break;
			case 2:	//메뉴추가
				System.out.println("메뉴판\n"+map);
				method.plusMenu();
				break;
			case 3: //시스템 종료
				System.out.println("ㅇㅇ 꺼져줄게");
				end= false;
				break;
			}
			
		}
		
		
	}
}
//Map인터페이스를 뜯어고치려는 생각을 하면안돼 얘는 얘만의 toString이니깐
//그래서 새로 내가 메소드를 만들면됨~! ㅎㅎ
//어떤 메소드냐면, 꾸미기메소드(집어넣을 맵, 중간에 끼워넣을 문자)