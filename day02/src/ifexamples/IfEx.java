package ifexamples;

public class IfEx {

	public static void main(String[] args) {
		// 조건문 사용하기 : if 단독 사용
		int age = 7;
		
		if(age >= 8)
		{
			System.out.println("학교에 갑니다.");
		}
		
		// if ~ else문
		if(age < 8)
		{
			System.out.println("학교에 가지 않습니다.");
		}
		else
		{
			System.out.println("학교에 갑니다.");
		}
		System.out.println("나이는 " + age + "세 입니다.");
	}
}
