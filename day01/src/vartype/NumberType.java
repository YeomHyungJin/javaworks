package vartype;

public class NumberType {

	public static void main(String[] args) {
		// ���� �ڷ����� ���� �� ũ��
		// byte �ڷ����� ũ��� 1Byte�̹Ƿ� ����(-128 ~ 127)
		byte bData1 = -128;
//		byte bData2 = 128; // ���� �ʰ� ����
		
		// short �ڷ����� ũ��� 2Byte�̹Ƿ� ����(-32,768 ~ 32,767)
		short sData1 = 32767;
//		short sData1 = 32768; // ���� �ʰ� ����

		System.out.println(bData1);
		System.out.println(sData1);
		
		// �⺻ �ڷ��� - int�� 4Byte (�� -21�� ~ 21��)
		int iNum = 1234567890;
//		int iNum2 = 12345678901; // ���� �ʰ� ����
		
		// long�� - ū ���� 8����Ʈ ('l'�̳� 'L'�� ���� ����
		long lNum = 12345678901L;
		
		System.out.println(iNum);
		System.out.println(lNum);
	}

}
