package innerclass;

public class StudentTest {

	public static void main(String[] args) {
		Student std = new Student("홍길동");
		
		Student.Score score = std.new Score();
		
		score.eng = 100;
		score.math = 90;
		score.showInfo();
	}

}
// 두개의 클래스 	1. 참조, 2. 협력, 3. 상속, 4. 내부클래스
