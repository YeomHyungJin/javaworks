package vartype;

public class NumberType2 {

	public static void main(String[] args) {
		// �Ǽ� �ڷ����� ũ�� �� ����
		// float�� 4Byte, double(�⺻)�� 8Byte
		float fData = 2.54f;
		double dData = 2.5343234;
		
		System.out.println(fData);
		System.out.println(dData);
		
		// ���е� ����
		float fData2 = 0.12345678F; 		//�Ҽ� 8�ڸ����� ����
		float fData3 = 0.123456789F; 		//�Ҽ� 8�ڸ����� ����   (������� x)
		double dData2 = 0.1234567890123456; //�Ҽ� 16�ڸ����� ����
		double dData3 = 0.12345678901234567;//�Ҽ� 16�ڸ����� ����  (������� x)
		
		System.out.println(fData2);
		System.out.println(dData2);
		System.out.println(fData3);
		System.out.println(dData3);
	}

}
