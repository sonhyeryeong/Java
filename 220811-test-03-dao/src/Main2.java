import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
	public static void main(String[] args) {
		String line = "1 He2llo. 3 Wo4rld! 5";
		Pattern p  = Pattern.compile("[0-9]");//정규표현식 표현? []대괄호 안에 문자에 대한 범위를 설정할 수 있다. 한글자 한글자 검사함!
		Matcher m = p.matcher(line);
		
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		m.find();
		System.out.println(m.start());
		
		
	}
}
