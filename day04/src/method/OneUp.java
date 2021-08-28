package method;

public class OneUp {

	public static void main(String[] args) {
		int result = add(1); // x가 2를 반환하고 x메모리 소멸
		result = add(3);
		System.out.println(result);
		
		// x값 출력 - x는 선언이 안됨. undefined
//		System.out.println(a);
	}
	public static int add(int a)
	{
		a += 1;
		return a;
	}
}
