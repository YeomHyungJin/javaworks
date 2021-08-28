package ifexamples;

public class EvenOddIf {

	public static void main(String[] args) {
		// 홀수, 짝수 판별 프로그램
		
		int num = 13;
		
		if(num % 2 == 0)
		{
			System.out.println("짝수입니다.");
		}
		else // num%2==1 생략됨
		{
			System.out.println("홀수입니다.");
		}
		System.out.println("숫자는 " + num + "입니다.");
	}
}
