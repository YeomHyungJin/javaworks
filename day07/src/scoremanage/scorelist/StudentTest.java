package scoremanage.scorelist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "���");
		Student s2 = new Student(101, "���");
		
		// ����, ����
		s1.addSubject("����", 91);
		s1.addSubject("����", 83);
		s1.addSubject("JAVA", 77);
		
		s2.addSubject("����", 95);
		s2.addSubject("����", 96);
		s2.addSubject("JAVA", 98);
		
		// ���
		s1.showInfo();
		s2.showInfo();
	}

}
