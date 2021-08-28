package ifexamples;

public class IfExample1 {

	public static void main(String[] args) {
		// 성별에 따른 값 출력
		char gender = 'F';
		
		if(gender == 'F')
		{
			System.out.println("여성입니다.");
		}
		else // gender != 'F')
		{
			System.out.println("남성입니다.");
		}
	}
}
