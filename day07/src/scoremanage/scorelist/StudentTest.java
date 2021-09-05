package scoremanage.scorelist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "흥부");
		Student s2 = new Student(101, "놀부");
		
		// 과목, 점수
		s1.addSubject("국어", 91);
		s1.addSubject("수학", 83);
		s1.addSubject("JAVA", 77);
		
		s2.addSubject("국어", 95);
		s2.addSubject("수학", 96);
		s2.addSubject("JAVA", 98);
		
		// 출력
		s1.showInfo();
		s2.showInfo();
	}

}
