package method;

public class AddCalc {

	public static void main(String[] args) {
		// add함수 호출
		int result = add(1,2);
		System.out.println(result);
	}
	public static int add(int a, int b) // 매개 변수
	{
		int sum = a+b;
		
		return sum;
	}
}
