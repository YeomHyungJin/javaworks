package method;

public class SayHello {

	public static void main(String[] args) {
//		System.out.println("hello~ elsa");
		sayHello();
		sayHello2("hyung jin");
	}
	// �̸��� sayHello�� �Լ�(�޼���)
	public static void sayHello()
	{
		System.out.println("Hello~");
	}
	public static void sayHello2(String name) // �Ű� ����
	{
		System.out.println("Hello~ "+ name);
	}
}
