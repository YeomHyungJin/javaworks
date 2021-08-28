package vartype;

public class Sample02 {

	public static void main(String[] args) {
		// 문자형 변수 선언 및 초기화 - 영어/한글
		// 한 문자인경우 - 홉따옴표
		char ch = 'A';
		
		// 문자가 여러개(문자열)인 경우 String 자료형 사용 - 쌍따옴표
		String ch2 = "AB";
		
		String name; 	// 변수 선언
		
		name = "염형진"; 	// 변수 초기화
		
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(name);
		
		// 변수이름 주의
		// 숫자로 시작할 수 없다.
	}

}
