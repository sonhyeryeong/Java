import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main2 {
	public static void main(String[] args) throws JsonProcessingException {
		Person hong = new Person("홍길동",22);
		
		ObjectMapper mapper= new ObjectMapper();
		String json = mapper.writeValueAsString(hong);
		
		System.out.println(json);
		
		String jsonString = "{\"name\":\"둘리\",\"age\":23}";
		Person dooli = mapper.readValue(jsonString, Person.class);// 문자열 표현 제이슨 객체를 매퍼를 통해 클래스형태로 변환이 가능함.
	    														// 자바 객체로 재생성됨.
		
		System.out.println(dooli.getName());
		System.out.println(dooli.getAge());
	}

}
