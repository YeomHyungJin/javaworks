package vartype;

public class CharType {

	public static void main(String[] args) {
		// ���� �ڷ��� - char, String
		// char�� 2Byte ����(-32,768 ~ 32,767)
		char ch1 = 'A';
		char ch2 = 66;
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// 'A'�� �ƽ�Ű�ڵ�
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		
		// '��'�� �����ڵ�
		// https://www.unicode.org/charts/PDF/UAC00.pdf
		char ch3 = '��';
		char ch4 = '\uD55C';
		
		// '������'�� �����ڵ�
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
