import java.util.regex.Pattern;

public class Main5 {
	public static void main(String[] args) {
		// java에서 백슬러시 '\'를 표현하려면  '\\' 두 번 적어줘야 해요
		// w : 문자 [a-z A-Z]랑 똑같은거 
	    // {3,} : 3글자 이상
	    // {0,} : 
		// + 1이상 
		// ? 0이거나 1 
		// * 0이상
		
		// \w : 문자     \d: 숫자  \s : 공백 
		Pattern p = Pattern.compile("\\d?");
	}
}
