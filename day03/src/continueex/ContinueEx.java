package continueex;

public class ContinueEx {

	public static void main(String[] args) {
		// 반복문 - continue 키워드 사용하기
		for ( int i = 1 ; i <= 10 ; i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
