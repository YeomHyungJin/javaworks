package ifexamples;

public class IfEx {

	public static void main(String[] args) {
		// ���ǹ� ����ϱ� : if �ܵ� ���
		int age = 7;
		
		if(age >= 8)
		{
			System.out.println("�б��� ���ϴ�.");
		}
		
		// if ~ else��
		if(age < 8)
		{
			System.out.println("�б��� ���� �ʽ��ϴ�.");
		}
		else
		{
			System.out.println("�б��� ���ϴ�.");
		}
		System.out.println("���̴� " + age + "�� �Դϴ�.");
	}
}
