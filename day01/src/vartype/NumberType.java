package vartype;

public class NumberType {

	public static void main(String[] args) {
		// 정수 자료형의 종류 및 크기
		// byte 자료형의 크기는 1Byte이므로 범위(-128 ~ 127)
		byte bData1 = -128;
//		byte bData2 = 128; // 범위 초과 오류
		
		// short 자료형의 크기는 2Byte이므로 범위(-32,768 ~ 32,767)
		short sData1 = 32767;
//		short sData1 = 32768; // 범위 초과 오류

		System.out.println(bData1);
		System.out.println(sData1);
		
		// 기본 자료형 - int는 4Byte (약 -21억 ~ 21억)
		int iNum = 1234567890;
//		int iNum2 = 12345678901; // 범위 초과 오류
		
		// long형 - 큰 숫자 8바이트 ('l'이나 'L'을 끝에 붙임
		long lNum = 12345678901L;
		
		System.out.println(iNum);
		System.out.println(lNum);
	}

}
