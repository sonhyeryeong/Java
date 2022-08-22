import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Main {
	public static void main(String[] args) throws JsonProcessingException {
		//사람
		//이름=홍길동
		//나이=22
		
		//json객체 하나 만들기 
		ObjectMapper mapper = new ObjectMapper();
		ObjectNode node = mapper.createObjectNode();
		
		node.put("name", "홍길동");
		node.put("age", 22);
		node.put("boolean", true);
		
		ObjectNode node2= mapper.createObjectNode();
		node2.put("이름", "둘리");
		node2.put("나이", 23);
		
		node.set("bf", node2);
		
		
		String json = mapper.writeValueAsString(node);
		System.out.println(json);
		
	}

}
