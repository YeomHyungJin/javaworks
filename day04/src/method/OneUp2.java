package method;

public class OneUp2 {

	static int x = 1; // static ���� = ��������
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add());
		System.out.println(add());
		System.out.println(add());
		
		// x�� ���
		System.out.println(x);
	}
	
	public static int add()
	{
		x += 1;
		return x;
	}
}
