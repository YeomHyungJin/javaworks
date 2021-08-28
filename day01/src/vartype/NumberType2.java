package vartype;

public class NumberType2 {

	public static void main(String[] args) {
		// 실수 자료형의 크기 및 범위
		// float는 4Byte, double(기본)는 8Byte
		float fData = 2.54f;
		double dData = 2.5343234;
		
		System.out.println(fData);
		System.out.println(dData);
		
		// 정밀도 측정
		float fData2 = 0.12345678F; 		//소수 8자리까지 측정
		float fData3 = 0.123456789F; 		//소수 8자리까지 측정   (정상출력 x)
		double dData2 = 0.1234567890123456; //소수 16자리까지 측정
		double dData3 = 0.12345678901234567;//소수 16자리까지 측정  (정상출력 x)
		
		System.out.println(fData2);
		System.out.println(dData2);
		System.out.println(fData3);
		System.out.println(dData3);
	}

}
