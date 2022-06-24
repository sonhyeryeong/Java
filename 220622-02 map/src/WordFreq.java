import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordFreq {
	public static void main(String[] args) {
		String line = "Hello. I'm a java developer.";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i =0; i<line.length();i++) {
			char c = line.charAt(i);//문자를 하나씩 가져옴
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				int value= map.get(c);
				value = value+1;
				map.put(c,value);
			}
		}
		System.out.println(map);
		
		
		
//	Map<String, Integer> m = new HashMap<String, Integer>();
//	
//	
//	String[] sample = {"to","be","or","not","to","be","is","a","problem"};
//	
//	//문자열에 포함된 단어의 빈도를 계산한다. 
//	for(String a: sample) {//문자열 배열에서 원소 하나씩 꺼내본다
//		
//		Integer freq = m.get(a);//해당 키 값이 없으면 null을 반환한다. 
//		m.put(a, (freq==null) ? 1: freq +1 );
//	}
//	
//	System.out.println(m.size()+"단어가 있습니다.");
//	System.out.println(m.containsKey("to"));
//	System.out.println(m.isEmpty());
//	System.out.println(m);
		
	}
}
