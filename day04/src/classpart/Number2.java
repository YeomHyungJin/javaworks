package classpart;

public class Number2 {

	int x;
	
	public Number2(int y) // �Ű����� ���� ��������� ����
	{
		x = y;
		System.out.println("�Ű����� ���� ��������� �����մϴ�.");
	}
	
	public static void main(String[] args) {
		// Number2 ������ �˾ƺ���
		Number2 num = new Number2(5);
		Number2 num2 = new Number2(-12);
		
		System.out.println(num.x);
		System.out.println(num2.x);
	}
}
