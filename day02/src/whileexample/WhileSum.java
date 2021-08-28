package whileexample;

public class WhileSum {

	public static void main(String[] args) {
		// 1 부터 10 sum
		int i = 1;
		int sum = 0; // 합계를 저장할 변수
		
		while(i <= 10)
		{
			sum += i; // 누적 합계
			i++;
		}
		System.out.println("합계는 : "+ sum);
	}
 }
