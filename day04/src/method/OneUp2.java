package method;

public class OneUp2 {

	static int x = 1; // static 변수 = 고정변수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add());
		System.out.println(add());
		System.out.println(add());
		
		// x값 출력
		System.out.println(x);
	}
	
	public static int add()
	{
		x += 1;
		return x;
	}
}
