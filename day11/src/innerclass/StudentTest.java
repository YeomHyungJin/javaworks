package innerclass;

public class StudentTest {

	public static void main(String[] args) {
		Student std = new Student("ȫ�浿");
		
		Student.Score score = std.new Score();
		
		score.eng = 100;
		score.math = 90;
		score.showInfo();
	}

}
// �ΰ��� Ŭ���� 	1. ����, 2. ����, 3. ���, 4. ����Ŭ����
