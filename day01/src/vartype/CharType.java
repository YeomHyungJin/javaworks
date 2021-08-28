package vartype;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - char, String
		// char는 2Byte 범위(-32,768 ~ 32,767)
		char ch1 = 'A';
		char ch2 = 66;
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// 'A'의 아스키코드
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		
		// '한'의 유니코드
		// https://www.unicode.org/charts/PDF/UAC00.pdf
		char ch3 = '한';
		char ch4 = '\uD55C';
		
		// '염형진'의 유니코드
		char ch5 = '\uC5FC';
		char ch6 = '\uD615';
		char ch7 = '\uC9C4';
		
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println(ch7);
	}
}
