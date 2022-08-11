

public class TestValidator {
	public static void main(String[] args) {
		PersonValidator v= new PersonValidator();
		v.isValidName("테 스 트");
//		v.isValidName("테스트1숫자");
//		v.isValidName("특수문자!@@$");
//		v.isValidName("");
//		v.isValidName(null);
//		v.isValidName("ㅁㄴㅇㄹㅇㄶㄴㅁㅎㄹㅇㅎㅁ나ㅓ랑ㄴ미러야ㅓㄹ맏;러ㅣ너라이");
	}
}
