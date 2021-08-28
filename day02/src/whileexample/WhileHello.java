package whileexample;

public class WhileHello {

	public static void main(String[] args) {
		// Hello~ 10번 반복
		
		// 초기값
		int n = 1;
		
		// while(조건값)
		while(n < 11)
		{
			System.out.println("Hello~");
			n++;  // 증감값 1증가
		}
		
		int i = 1;
		while(i < 101)
		{
			System.out.println(i);
			i++;
		}
	} // main 닫기
}// class 닫기
