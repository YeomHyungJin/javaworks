package whileexample;

public class WhileSum2 {

	public static void main(String[] args) {
		// 1 부터 10 sum
		// break를 사용 -> 반복 조건문
		
		int n = 1;
		int sum = 0;
		while(true)
		{
			sum += n;
			n++;
			if(n > 10) break;
		}
		System.out.println("합계는 :: " + sum);
	}
 }
