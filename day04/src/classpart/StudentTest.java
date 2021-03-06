package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 클래스를 사용
		// 클래스 인스턴스변수 = new 생성자 
		Student s1 = new Student();
//		s1.studentName = "성춘향"; 	접근제어자가 private이므로 불가
		s1.setStudentName("성춘향");
//		s1.grade = 3; 				접근제어자가 private이므로 불가
		s1.setGrade(3);
		s1.showInfo();
		
		Student s2 = new Student();
//		s2.studentName = "이순신"; 	접근제어자가 private이므로 불가
		s2.setStudentName("이순신");
//		s2.grade = 2;				접근제어자가 private이므로 불가
		s2.setGrade(2);
		s2.showInfo();
		
		Student s3 = new Student("홍길동");
//		s3.grade = 2;				접근제어자가 private이므로 불가
		s3.setGrade(1);
		s3.showInfo();
	}
}
