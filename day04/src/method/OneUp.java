package method;

public class OneUp {

	public static void main(String[] args) {
		int result = add(1); // x�� 2�� ��ȯ�ϰ� x�޸� �Ҹ�
		result = add(3);
		System.out.println(result);
		
		// x�� ��� - x�� ������ �ȵ�. undefined
//		System.out.println(a);
	}
	public static int add(int a)
	{
		a += 1;
		return a;
	}
}
