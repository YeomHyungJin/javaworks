package scoremanage.score;

public class Student {
	int id;				// 학번
	String stdName;		// 학생 이름
	Subject korean; 		// 국어 과목
	Subject math;		// 수학 과목
	
	public Student(int id, String stdName)
	{
		this.id = id;
		this.stdName = stdName;
		korean = new Subject();
		math = new Subject();
	}
	
	// 국어 과목과 점수 생성 메소드
	public void koreanSubject(String name, int score)
	{
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	// 국어 과목과 점수 생성 메소드
	public void mathSubject(String name, int score)
	{
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	// 정보 출력
	public void showInfo()
	{
//		System.out.println(stdName + "의 국어 점수는 " + korean.getScorePoint() + "점이고, 수학점수는 " + math.getScorePoint() + "점 입니다.");
		System.out.printf("%s의 국어 점수는 %d점이고, 수학점수는 %d점 입니다.", stdName, korean.getScorePoint(), math.getScorePoint());
	}
}
