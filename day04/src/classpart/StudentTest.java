package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// �л� Ŭ������ ���
		// Ŭ���� �ν��Ͻ����� = new ������ 
		Student s1 = new Student();
//		s1.studentName = "������"; 	���������ڰ� private�̹Ƿ� �Ұ�
		s1.setStudentName("������");
//		s1.grade = 3; 				���������ڰ� private�̹Ƿ� �Ұ�
		s1.setGrade(3);
		s1.showInfo();
		
		Student s2 = new Student();
//		s2.studentName = "�̼���"; 	���������ڰ� private�̹Ƿ� �Ұ�
		s2.setStudentName("�̼���");
//		s2.grade = 2;				���������ڰ� private�̹Ƿ� �Ұ�
		s2.setGrade(2);
		s2.showInfo();
		
		Student s3 = new Student("ȫ�浿");
//		s3.grade = 2;				���������ڰ� private�̹Ƿ� �Ұ�
		s3.setGrade(1);
		s3.showInfo();
	}
}
