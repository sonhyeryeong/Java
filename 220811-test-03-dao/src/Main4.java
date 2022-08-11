import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
	public static void main(String[] args) {
		String line1= "lowercase";
		String line2="UPPERCASE";
		String line3="1q2w3e";
		
//		Pattern p = Pattern.compile("[A-Z]{9}");//문자열의 범위를 준다.
//		Matcher m = p.matcher(line2);
//		
//		System.out.println(m.matches());//matches는 정규 표현식이랑 문자열이랑 일치하면 true 반환
		
		
//		Pattern p = Pattern.compile("[0-9a-z]{6}");//두개 찾아야 하면 범위를 두 개 적어줌
//		Matcher m = p.matcher(line3);
//		System.out.println(m.matches());
		
		
		//아이디는 영소문자와 숫자로 이루어져야하고,최소 6자 최대 10자임  (영문자로 시작해아함)
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("아이디를 입력하세요");
//		String id = scan.nextLine();
//		
//		
//		Pattern p  = Pattern.compile("[a-z]{6,9}");
//		Pattern p2 = Pattern.compile("[0-9]");
//		Matcher m = p.matcher(id);
//		Matcher m2 = p2.matcher(id);
//		System.out.println("아이디가 적합한가요? "+ (m.matches() && m2.matches()));
		
		
		//올바른 전화번호 (010-####-####)
		String regex ="010-[0-9]{4}-[0-9]{4}";
		Pattern p = Pattern.compile(regex);
		System.out.println(p.matcher("010-1234-5678").matches());
		System.out.println(p.matcher("010-1234-aaaa").matches());
		System.out.println(p.matcher("010-~!@#-5678").matches());
		System.out.println(p.matcher("01012345678").matches());
		System.out.println(p.matcher("011-1234-5678").matches());
		
		
		
		
	}
}
