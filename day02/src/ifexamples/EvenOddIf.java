package ifexamples;

public class EvenOddIf {

	public static void main(String[] args) {
		// Ȧ��, ¦�� �Ǻ� ���α׷�
		
		int num = 13;
		
		if(num % 2 == 0)
		{
			System.out.println("¦���Դϴ�.");
		}
		else // num%2==1 ������
		{
			System.out.println("Ȧ���Դϴ�.");
		}
		System.out.println("���ڴ� " + num + "�Դϴ�.");
	}
}
