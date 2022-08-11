import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
	public static void main(String[] args) {
		String line = "123 He234llo. 39 Wo48rld! 57";
		Pattern p  = Pattern.compile("[0-9]{2,3}");//" [문자범위]{문자열 길이 (최소길이,최대길이)}" 예) (2,3):두자리-세자리 숫자 사이
		Matcher m = p.matcher(line);
		
		
		m.find();
		System.out.println(m.start());
		System.out.println(m.end());
		
		m.find();
		System.out.println(m.start());
		System.out.println(m.end());
	}
}
