package method;

public class SayHello {

	public static void main(String[] args) {
//		System.out.println("hello~ elsa");
		sayHello();
		sayHello2("hyung jin");
	}
	// 이름이 sayHello인 함수(메서드)
	public static void sayHello()
	{
		System.out.println("Hello~");
	}
	public static void sayHello2(String name) // 매개 변수
	{
		System.out.println("Hello~ "+ name);
	}
}
