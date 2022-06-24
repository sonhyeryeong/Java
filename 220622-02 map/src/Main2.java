import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		// 제네릭에서 키의 타입, 데이터의 타입 정의
		// 키 값은 중복되지 않는 값으로 정해주어야 한다. 
		//
		Map<String,Integer> map = new HashMap<>();
		map.put("둘리",100);
		map.put("홍길동",90);
		map.put("도우너",150);
		
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "둘리");
		map2.put(4,"홍길동");
		map2.put(3, "도우너");
		
		System.out.println(map.toString());
		
		//entry : 키와 value를 한 덩어리로 묶은 것. 
		Set<Entry<String,Integer>> entrySet =map.entrySet();//???
		
		//전체 원소를 한 번 순환하려고
		for(Entry<String,Integer> e: entrySet) {
			System.out.println(e.getKey()+"="+e.getValue());
		}
		
		
		
		
		
		
		
		
		
//		//전체를 순환하려면 키 값이 필요하다
//		Set<String> keySet = map.keySet();
//		
//		//for-each문 쓰면 
//		for(String key: keySet) {
//			System.out.println(key +"="+ map.get(key));
//		}
//		
//		//iterator쓰면
//		Iterator<String> iter = keySet.iterator();
//		while(iter.hasNext()) {
//			String key = iter.next();
//			Integer value = map.get(key);
//			
//			System.out.println(key + "="+ value);
//		}
	}

}
