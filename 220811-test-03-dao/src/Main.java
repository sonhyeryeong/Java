import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		//정규 표현 식 - 특정 문자열에 대해 내가 원하는 값만 찾아낸다거나,
		
		String line = " This is a book.";
		Pattern p = Pattern.compile("is"); //정규표현식을 넣어준다
		Matcher m = p.matcher(line);//검사하고자 하는 문장을 넣어준다
		
		
//		System.out.println(m.lookingAt());// p랑 line이랑 시작부분이 같냐 ? 시작 부분이 일치하면 true 
		
		boolean find  =m.find();//찾는 부분을 찾아서 표시한다.
		if(find) {
			System.out.println(m.start());//시작점
			System.out.println(m.end());//끝점
			//char의 인덱스처럼 0부터 시작함. 
		}
		
		//한 번 더 찾으라고 하면 그 다음 값을 반환
		find  =m.find();
		if(find) {
			System.out.println(m.start());
			System.out.println(m.end());
		}
		
		
		find  =m.find();//찾는 부분을 찾아서 표시한다.
		if(!find) {
			System.out.println("없음!");
		}
		
		
	}
}
