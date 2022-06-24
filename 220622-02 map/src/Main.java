import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		// 키 값, 데이터 값
		map.put("일",1);
		map.put("이",2);
		map.put("삼",3);
		map.put("사",4);
		
		System.out.println(map.size());
		
		System.out.println(map.get("이"));
		System.out.println(map.get("삼"));
		System.out.println(map.get("오"));// 없는 값을 물어보면 null을 반환한다. 
		
		if(!map.containsKey("이")) {//키 값이 중복되지 않을 때만
			map.put("이", 2222);
		}
		System.out.println(map.get("이"));// 기존 값에서 새로운 값으로 변경된다. (덮어 씌운다)
		
		
		
		
		
	}

}
